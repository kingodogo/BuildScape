package com.kingodogo.buildscape.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kingodogo.buildscape.BuildScape;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

// [Architect]: Base loot table provider for data generation
// Based on Forge Community Wiki documentation for 1.18.2
public abstract class ModLootTableProvider implements DataProvider {
    
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    
    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    public static Map<ResourceLocation, LootTable> tables = new HashMap<>();
    protected final DataGenerator generator;
    
    public ModLootTableProvider(DataGenerator generator) {
        this.generator = generator;
    }
    
    @Override
    public String getName() {
        return "BuildScape Loot Tables";
    }
    
    protected abstract void addTables();
    
    @Override
    public void run(HashCache cache) {
        lootTables.clear();
        tables.clear();
        
        addTables();
        
        // Convert Map<Block, LootTable.Builder> to Map<ResourceLocation, LootTable>
        lootTables.forEach((block, builder) -> {
            tables.put(block.getLootTable(), builder.setParamSet(net.minecraft.world.level.storage.loot.parameters.LootContextParamSets.BLOCK).build());
        });
        
        writeTables(cache, tables);
    }
    
    private void writeTables(HashCache cache, Map<ResourceLocation, LootTable> tables) {
        Path outputFolder = this.generator.getOutputFolder();
        tables.forEach((key, lootTable) -> {
            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
            try {
                DataProvider.save(GSON, cache, LootTables.serialize(lootTable), path);
            } catch (IOException e) {
                LOGGER.error("Couldn't write loot table {}", path, e);
            }
        });
    }
}

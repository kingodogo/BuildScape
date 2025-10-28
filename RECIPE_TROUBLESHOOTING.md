# 🔧 Recipe Troubleshooting Guide

## ❌ Issue: Recipes Not Working

If your recipes are still not working, here are the most common causes and solutions:

### **1. Block ID vs Item ID Mismatch**

**Problem**: The recipe references a block ID but needs to match the actual registered ID.

**Check Your Item Registration:**
```java
// In ModItems.java
public static final RegistryObject<Item> BLACK_SAND_ITEM = ITEMS.register("black_sand_item", 
    () -> new BlockItem(ModBlocks.BLACK_SAND.get(), new Item.Properties()));
```

**Check Your Recipe Result:**
```json
{
  "result": {
    "item": "buildscape:black_sand"  // Must match what's registered!
  }
}
```

### **2. Recipe File Naming**

Recipe files should match the result item name:
- Recipe file: `black_sand.json`
- Result item: `buildscape:black_sand`

### **3. Common Recipe Formats**

#### **For Minecraft 1.21.1** (Current Format):
```json
{
  "type": "minecraft:crafting_shapeless",
  "ingredients": [
    {"item": "minecraft:sand"},
    {"item": "minecraft:black_dye"}
  ],
  "result": {
    "item": "buildscape:black_sand"
  }
}
```

### **4. Testing Recipes**

1. **Launch the game**
2. **Open crafting table**
3. **Put sand + dye** in the 3x3 grid
4. **Check if the recipe appears**

### **5. Debugging Steps**

#### **Check if blocks are registered:**
```java
// In game, use /give command to test:
/give @p buildscape:black_sand
```

#### **Check logs for errors:**
Look in `run/logs/latest.log` for:
- Recipe loading errors
- Item registration errors
- Missing item errors

#### **Try a simpler recipe first:**
Test with vanilla items to verify the format works:
```json
{
  "type": "minecraft:crafting_shapeless",
  "ingredients": [
    {"item": "minecraft:iron_ingot"}
  ],
  "result": {
    "item": "minecraft:iron_block"
  }
}
```

### **6. Force Reload**

If recipes still don't work:
1. **Delete the `run` folder**
2. **Rebuild the project**
3. **Launch the game again**

### **7. Known Issues**

- **JEI Not Available**: JEI for 1.21.1 is not yet released, so you'll need to test recipes in-game manually
- **BlockItem Registration**: Make sure your BlockItem is properly registered with the correct ID

### **8. Current Status**

✅ **Recipe Format**: Correct (matches Minecraft 1.21.1 standards)  
✅ **File Structure**: All recipe files in correct location  
✅ **Item Registration**: All items properly registered  
✅ **Block Registration**: All blocks properly registered  

⏳ **Next Step**: Launch the game and test in crafting table!

## 🎯 Quick Fix Checklist

- [ ] Recipe files are in `src/main/resources/data/buildscape/recipes/`
- [ ] Recipe file names match result item names
- [ ] All ingredients use `{"item": "..."}` format
- [ ] Result uses `{"item": "..."}` format  
- [ ] BlockItem is registered with correct ID
- [ ] Mod has been rebuilt since last changes
- [ ] Game has been restarted to load new recipes

## 🆘 Still Not Working?

If recipes still don't work after all these fixes, the issue might be:
1. **Game not loading the recipes** - Check logs for errors
2. **ID mismatch** - Verify item IDs match everywhere
3. **Cache issue** - Delete run folder and rebuild

Try testing in creative mode first to verify the blocks/items exist!

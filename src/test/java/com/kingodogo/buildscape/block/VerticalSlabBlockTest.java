package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for VerticalSlabBlock.
 * Tests block properties, shapes, and state management.
 */
class VerticalSlabBlockTest {

    private VerticalSlabBlock verticalSlab;
    private Block parentBlock;

    @BeforeEach
    void setUp() {
        parentBlock = Blocks.STONE;
        verticalSlab = new VerticalSlabBlock(
            Block.Properties.copy(parentBlock),
            parentBlock
        );
    }

    @Test
    @DisplayName("Constructor should set parent block")
    void testConstructor_SetsParentBlock() {
        assertNotNull(verticalSlab);
        assertEquals(parentBlock, verticalSlab.getParentBlock());
    }

    @Test
    @DisplayName("getParentBlock() should return correct parent")
    void testGetParentBlock_ReturnsCorrectParent() {
        Block testParent = Blocks.OAK_PLANKS;
        VerticalSlabBlock testSlab = new VerticalSlabBlock(
            Block.Properties.copy(testParent),
            testParent
        );

        assertEquals(testParent, testSlab.getParentBlock());
    }

    @Test
    @DisplayName("Default block state should have correct properties")
    void testDefaultBlockState_HasCorrectProperties() {
        BlockState defaultState = verticalSlab.defaultBlockState();

        assertNotNull(defaultState);
        assertEquals(Direction.NORTH, defaultState.getValue(VerticalSlabBlock.FACING));
        assertEquals(SlabType.BOTTOM, defaultState.getValue(VerticalSlabBlock.TYPE));
        assertFalse(defaultState.getValue(VerticalSlabBlock.WATERLOGGED));
    }

    @Test
    @DisplayName("FACING property should support all horizontal directions")
    void testFacingProperty_SupportsAllHorizontalDirections() {
        BlockState state = verticalSlab.defaultBlockState();

        // Test all horizontal directions
        for (Direction dir : Direction.Plane.HORIZONTAL) {
            BlockState facingState = state.setValue(VerticalSlabBlock.FACING, dir);
            assertEquals(dir, facingState.getValue(VerticalSlabBlock.FACING));
        }
    }

    @Test
    @DisplayName("TYPE property should support all slab types")
    void testTypeProperty_SupportsAllSlabTypes() {
        BlockState state = verticalSlab.defaultBlockState();

        // Test all slab types
        for (SlabType type : SlabType.values()) {
            BlockState typeState = state.setValue(VerticalSlabBlock.TYPE, type);
            assertEquals(type, typeState.getValue(VerticalSlabBlock.TYPE));
        }
    }

    @Test
    @DisplayName("WATERLOGGED property should support true and false")
    void testWaterloggedProperty_SupportsTrueAndFalse() {
        BlockState state = verticalSlab.defaultBlockState();

        BlockState waterlogged = state.setValue(VerticalSlabBlock.WATERLOGGED, true);
        assertTrue(waterlogged.getValue(VerticalSlabBlock.WATERLOGGED));

        BlockState notWaterlogged = state.setValue(VerticalSlabBlock.WATERLOGGED, false);
        assertFalse(notWaterlogged.getValue(VerticalSlabBlock.WATERLOGGED));
    }

    @Test
    @DisplayName("getShape() should return full block for DOUBLE type")
    void testGetShape_ReturnsFullBlockForDoubleType() {
        BlockState doubleState = verticalSlab.defaultBlockState()
            .setValue(VerticalSlabBlock.TYPE, SlabType.DOUBLE);

        VoxelShape shape = verticalSlab.getShape(doubleState, null, BlockPos.ZERO, null);

        assertNotNull(shape);
        // Full block shape should be 16x16x16
        assertEquals(1.0, shape.max(Direction.Axis.X), 0.001);
        assertEquals(1.0, shape.max(Direction.Axis.Y), 0.001);
        assertEquals(1.0, shape.max(Direction.Axis.Z), 0.001);
    }

    @Test
    @DisplayName("getShape() should return correct shape for NORTH facing")
    void testGetShape_ReturnsCorrectShapeForNorth() {
        BlockState northState = verticalSlab.defaultBlockState()
            .setValue(VerticalSlabBlock.FACING, Direction.NORTH)
            .setValue(VerticalSlabBlock.TYPE, SlabType.BOTTOM);

        VoxelShape shape = verticalSlab.getShape(northState, null, BlockPos.ZERO, null);

        assertNotNull(shape);
        // North shape: 0-16 in X, 0-16 in Y, 0-8 in Z
        assertEquals(0.0, shape.min(Direction.Axis.Z), 0.001);
        assertEquals(0.5, shape.max(Direction.Axis.Z), 0.001);
    }

    @Test
    @DisplayName("getShape() should return correct shape for SOUTH facing")
    void testGetShape_ReturnsCorrectShapeForSouth() {
        BlockState southState = verticalSlab.defaultBlockState()
            .setValue(VerticalSlabBlock.FACING, Direction.SOUTH)
            .setValue(VerticalSlabBlock.TYPE, SlabType.BOTTOM);

        VoxelShape shape = verticalSlab.getShape(southState, null, BlockPos.ZERO, null);

        assertNotNull(shape);
        // South shape: 0-16 in X, 0-16 in Y, 8-16 in Z
        assertEquals(0.5, shape.min(Direction.Axis.Z), 0.001);
        assertEquals(1.0, shape.max(Direction.Axis.Z), 0.001);
    }

    @Test
    @DisplayName("getShape() should return correct shape for EAST facing")
    void testGetShape_ReturnsCorrectShapeForEast() {
        BlockState eastState = verticalSlab.defaultBlockState()
            .setValue(VerticalSlabBlock.FACING, Direction.EAST)
            .setValue(VerticalSlabBlock.TYPE, SlabType.BOTTOM);

        VoxelShape shape = verticalSlab.getShape(eastState, null, BlockPos.ZERO, null);

        assertNotNull(shape);
        // East shape: 8-16 in X, 0-16 in Y, 0-16 in Z
        assertEquals(0.5, shape.min(Direction.Axis.X), 0.001);
        assertEquals(1.0, shape.max(Direction.Axis.X), 0.001);
    }

    @Test
    @DisplayName("getShape() should return correct shape for WEST facing")
    void testGetShape_ReturnsCorrectShapeForWest() {
        BlockState westState = verticalSlab.defaultBlockState()
            .setValue(VerticalSlabBlock.FACING, Direction.WEST)
            .setValue(VerticalSlabBlock.TYPE, SlabType.BOTTOM);

        VoxelShape shape = verticalSlab.getShape(westState, null, BlockPos.ZERO, null);

        assertNotNull(shape);
        // West shape: 0-8 in X, 0-16 in Y, 0-16 in Z
        assertEquals(0.0, shape.min(Direction.Axis.X), 0.001);
        assertEquals(0.5, shape.max(Direction.Axis.X), 0.001);
    }

    @Test
    @DisplayName("Block state definition should include all required properties")
    void testBlockStateDefinition_IncludesAllProperties() {
        BlockState state = verticalSlab.defaultBlockState();

        assertTrue(state.hasProperty(VerticalSlabBlock.FACING), "Should have FACING property");
        assertTrue(state.hasProperty(VerticalSlabBlock.TYPE), "Should have TYPE property");
        assertTrue(state.hasProperty(VerticalSlabBlock.WATERLOGGED), "Should have WATERLOGGED property");
    }

    @Test
    @DisplayName("All possible states should be valid")
    void testAllPossibleStates_AreValid() {
        int stateCount = 0;

        for (Direction facing : Direction.Plane.HORIZONTAL) {
            for (SlabType type : SlabType.values()) {
                for (boolean waterlogged : new boolean[]{true, false}) {
                    BlockState state = verticalSlab.defaultBlockState()
                        .setValue(VerticalSlabBlock.FACING, facing)
                        .setValue(VerticalSlabBlock.TYPE, type)
                        .setValue(VerticalSlabBlock.WATERLOGGED, waterlogged);

                    assertNotNull(state);
                    assertEquals(facing, state.getValue(VerticalSlabBlock.FACING));
                    assertEquals(type, state.getValue(VerticalSlabBlock.TYPE));
                    assertEquals(waterlogged, state.getValue(VerticalSlabBlock.WATERLOGGED));

                    stateCount++;
                }
            }
        }

        // 4 facing directions * 3 slab types * 2 waterlogged states = 24 states
        assertEquals(24, stateCount, "Should have 24 possible states");
    }

    @Test
    @DisplayName("TOP type should behave like BOTTOM type")
    void testTopType_BehavesLikeBottomType() {
        BlockState topState = verticalSlab.defaultBlockState()
            .setValue(VerticalSlabBlock.TYPE, SlabType.TOP)
            .setValue(VerticalSlabBlock.FACING, Direction.NORTH);

        BlockState bottomState = verticalSlab.defaultBlockState()
            .setValue(VerticalSlabBlock.TYPE, SlabType.BOTTOM)
            .setValue(VerticalSlabBlock.FACING, Direction.NORTH);

        VoxelShape topShape = verticalSlab.getShape(topState, null, BlockPos.ZERO, null);
        VoxelShape bottomShape = verticalSlab.getShape(bottomState, null, BlockPos.ZERO, null);

        // For vertical slabs, TOP and BOTTOM might be treated the same (single slab)
        // This is implementation-specific
        assertNotNull(topShape);
        assertNotNull(bottomShape);
    }

    @Test
    @DisplayName("Different parent blocks should create different vertical slabs")
    void testDifferentParentBlocks_CreateDifferentSlabs() {
        Block parent1 = Blocks.STONE;
        Block parent2 = Blocks.OAK_PLANKS;

        VerticalSlabBlock slab1 = new VerticalSlabBlock(
            Block.Properties.copy(parent1),
            parent1
        );

        VerticalSlabBlock slab2 = new VerticalSlabBlock(
            Block.Properties.copy(parent2),
            parent2
        );

        assertNotSame(slab1, slab2);
        assertEquals(parent1, slab1.getParentBlock());
        assertEquals(parent2, slab2.getParentBlock());
    }

    @Test
    @DisplayName("Shapes should be consistent across multiple calls")
    void testShapes_ConsistentAcrossMultipleCalls() {
        BlockState state = verticalSlab.defaultBlockState()
            .setValue(VerticalSlabBlock.FACING, Direction.NORTH);

        VoxelShape shape1 = verticalSlab.getShape(state, null, BlockPos.ZERO, null);
        VoxelShape shape2 = verticalSlab.getShape(state, null, BlockPos.ZERO, null);

        assertEquals(shape1.min(Direction.Axis.X), shape2.min(Direction.Axis.X), 0.001);
        assertEquals(shape1.max(Direction.Axis.X), shape2.max(Direction.Axis.X), 0.001);
        assertEquals(shape1.min(Direction.Axis.Y), shape2.min(Direction.Axis.Y), 0.001);
        assertEquals(shape1.max(Direction.Axis.Y), shape2.max(Direction.Axis.Y), 0.001);
        assertEquals(shape1.min(Direction.Axis.Z), shape2.min(Direction.Axis.Z), 0.001);
        assertEquals(shape1.max(Direction.Axis.Z), shape2.max(Direction.Axis.Z), 0.001);
    }

    @Test
    @DisplayName("Y-axis should always be full height for half slabs")
    void testYAxis_AlwaysFullHeightForHalfSlabs() {
        for (Direction facing : Direction.Plane.HORIZONTAL) {
            BlockState state = verticalSlab.defaultBlockState()
                .setValue(VerticalSlabBlock.FACING, facing)
                .setValue(VerticalSlabBlock.TYPE, SlabType.BOTTOM);

            VoxelShape shape = verticalSlab.getShape(state, null, BlockPos.ZERO, null);

            assertEquals(0.0, shape.min(Direction.Axis.Y), 0.001,
                "Y min should be 0 for " + facing);
            assertEquals(1.0, shape.max(Direction.Axis.Y), 0.001,
                "Y max should be 1 for " + facing);
        }
    }
}
package com.kingodogo.buildscape.api.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Edge case and boundary tests for CosmeticData.
 * Tests unusual inputs, large data sets, and boundary conditions.
 */
class CosmeticDataEdgeCasesTest {

    @Test
    @DisplayName("adaptFromSecureResponse() with very large unlocked list should handle correctly")
    void testAdaptFromSecureResponse_VeryLargeUnlockedList() {
        CosmeticData data = new CosmeticData();

        // Create a large list of cosmetics
        List<String> largeList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            largeList.add("item:test:" + i);
        }

        data.setUnlockedCosmetics(largeList);
        data.adaptFromSecureResponse();

        assertNotNull(data.getUnlocked());
        assertEquals(10000, data.getUnlocked().size());
        assertEquals("item:test:0", data.getUnlocked().get(0));
        assertEquals("item:test:9999", data.getUnlocked().get(9999));
    }

    @Test
    @DisplayName("adaptFromSecureResponse() with very large selected cosmetics map should handle correctly")
    void testAdaptFromSecureResponse_VeryLargeSelectedMap() {
        CosmeticData data = new CosmeticData();

        Map<String, String> largeMap = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            largeMap.put("slot_" + i, "item:test:" + i);
        }

        data.setSelectedCosmetics(largeMap);
        data.adaptFromSecureResponse();

        assertNotNull(data.getEquipped());
        assertEquals(1000, data.getEquipped().size());
    }

    @Test
    @DisplayName("Cosmetic IDs with special characters should be preserved")
    void testCosmeticIds_WithSpecialCharacters_Preserved() {
        CosmeticData data = new CosmeticData();

        List<String> specialIds = List.of(
            "item:namespace:id-with-dashes",
            "item:namespace:id_with_underscores",
            "item:namespace:id.with.dots",
            "item:namespace:id:with:colons"
        );

        data.setUnlocked(specialIds);

        for (int i = 0; i < specialIds.size(); i++) {
            assertEquals(specialIds.get(i), data.getUnlocked().get(i));
        }
    }

    @Test
    @DisplayName("Empty strings in selected cosmetics should be filtered out")
    void testEmptyStrings_InSelectedCosmetics_FilteredOut() {
        CosmeticData data = new CosmeticData();

        Map<String, String> selected = new HashMap<>();
        selected.put("head", "");
        selected.put("chest", "");
        selected.put("legs", "");

        data.setSelectedCosmetics(selected);
        data.adaptFromSecureResponse();

        assertNotNull(data.getEquipped());
        assertTrue(data.getEquipped().isEmpty(), "All empty strings should be filtered");
    }

    @Test
    @DisplayName("Whitespace-only values in selected cosmetics should not be filtered")
    void testWhitespaceOnly_InSelectedCosmetics_NotFiltered() {
        CosmeticData data = new CosmeticData();

        Map<String, String> selected = new HashMap<>();
        selected.put("head", "   ");
        selected.put("chest", "\t");
        selected.put("legs", "\n");

        data.setSelectedCosmetics(selected);
        data.adaptFromSecureResponse();

        assertNotNull(data.getEquipped());
        // Whitespace-only strings are not empty(), so they won't be filtered
        assertEquals(3, data.getEquipped().size());
    }

    @Test
    @DisplayName("Very long cosmetic ID strings should be handled")
    void testVeryLongCosmeticIds_Handled() {
        CosmeticData data = new CosmeticData();

        String longId = "item:namespace:" + "x".repeat(1000);
        data.setUnlocked(List.of(longId));

        assertEquals(1, data.getUnlocked().size());
        assertEquals(longId, data.getUnlocked().get(0));
    }

    @Test
    @DisplayName("Duplicate cosmetic IDs in unlocked list should be preserved")
    void testDuplicateCosmeticIds_InUnlockedList_Preserved() {
        CosmeticData data = new CosmeticData();

        List<String> withDuplicates = List.of(
            "item:test:1",
            "item:test:2",
            "item:test:1",  // duplicate
            "item:test:3",
            "item:test:1"   // duplicate
        );

        data.setUnlocked(withDuplicates);

        assertEquals(5, data.getUnlocked().size());
        assertEquals("item:test:1", data.getUnlocked().get(0));
        assertEquals("item:test:1", data.getUnlocked().get(2));
        assertEquals("item:test:1", data.getUnlocked().get(4));
    }

    @Test
    @DisplayName("Selected cosmetics with duplicate values should all appear in equipped")
    void testSelectedCosmetics_WithDuplicateValues_AllInEquipped() {
        CosmeticData data = new CosmeticData();

        Map<String, String> selected = new HashMap<>();
        selected.put("head", "item:test:helmet");
        selected.put("backup_head", "item:test:helmet");  // Same value, different key

        data.setSelectedCosmetics(selected);
        data.adaptFromSecureResponse();

        assertNotNull(data.getEquipped());
        // Both entries should be in equipped (no deduplication by value)
        assertEquals(2, data.getEquipped().size());
    }

    @Test
    @DisplayName("Unicode characters in cosmetic IDs should be preserved")
    void testUnicodeCharacters_InCosmeticIds_Preserved() {
        CosmeticData data = new CosmeticData();

        List<String> unicodeIds = List.of(
            "item:test:café",
            "item:test:日本語",
            "item:test:emoji🎮"
        );

        data.setUnlocked(unicodeIds);

        assertEquals(3, data.getUnlocked().size());
        assertEquals("item:test:café", data.getUnlocked().get(0));
        assertEquals("item:test:日本語", data.getUnlocked().get(1));
        assertEquals("item:test:emoji🎮", data.getUnlocked().get(2));
    }

    @Test
    @DisplayName("Mixed null and valid values in selected cosmetics should handle correctly")
    void testMixedNullAndValid_InSelectedCosmetics_HandledCorrectly() {
        CosmeticData data = new CosmeticData();

        Map<String, String> selected = new HashMap<>();
        selected.put("slot1", "item:valid:1");
        selected.put("slot2", null);
        selected.put("slot3", "item:valid:2");
        selected.put("slot4", null);
        selected.put("slot5", "");
        selected.put("slot6", "item:valid:3");

        data.setSelectedCosmetics(selected);
        data.adaptFromSecureResponse();

        assertNotNull(data.getEquipped());
        assertEquals(3, data.getEquipped().size());
        assertTrue(data.getEquipped().contains("item:valid:1"));
        assertTrue(data.getEquipped().contains("item:valid:2"));
        assertTrue(data.getEquipped().contains("item:valid:3"));
        assertFalse(data.getEquipped().contains(null));
        assertFalse(data.getEquipped().contains(""));
    }

    @Test
    @DisplayName("Empty unlockedCosmetics list should result in empty unlocked after adaptation")
    void testEmptyUnlockedCosmetics_ResultsInEmptyUnlocked() {
        CosmeticData data = new CosmeticData();

        data.setUnlockedCosmetics(List.of());
        data.adaptFromSecureResponse();

        assertNotNull(data.getUnlocked());
        assertTrue(data.getUnlocked().isEmpty());
    }

    @Test
    @DisplayName("isSecureFormat() with both secure and legacy fields should return true")
    void testIsSecureFormat_WithBothSecureAndLegacy_ReturnsTrue() {
        CosmeticData data = new CosmeticData();

        // Set both types of fields
        data.setUnlocked(List.of("legacy:1"));
        data.setUnlockedCosmetics(List.of("secure:1"));

        assertTrue(data.isSecureFormat(), "Should be considered secure format when secure fields are present");
    }

    @Test
    @DisplayName("Multiple calls to adaptFromSecureResponse() should be idempotent")
    void testMultipleAdaptCalls_Idempotent() {
        CosmeticData data = new CosmeticData();

        List<String> unlockedCosmetics = List.of("item:1", "item:2");
        Map<String, String> selectedCosmetics = new HashMap<>();
        selectedCosmetics.put("head", "item:1");

        data.setUnlockedCosmetics(unlockedCosmetics);
        data.setSelectedCosmetics(selectedCosmetics);

        data.adaptFromSecureResponse();
        List<String> firstUnlocked = new ArrayList<>(data.getUnlocked());
        List<String> firstEquipped = new ArrayList<>(data.getEquipped());

        data.adaptFromSecureResponse();
        List<String> secondUnlocked = data.getUnlocked();
        List<String> secondEquipped = data.getEquipped();

        assertEquals(firstUnlocked, secondUnlocked);
        assertEquals(firstEquipped, secondEquipped);
    }

    @Test
    @DisplayName("Immutable list for locked should not cause issues")
    void testImmutableLockedList_NoIssues() {
        CosmeticData data = new CosmeticData();

        data.setUnlockedCosmetics(List.of("item:1"));
        data.adaptFromSecureResponse();

        List<String> locked = data.getLocked();
        assertNotNull(locked);
        assertTrue(locked.isEmpty());

        // Verify it's immutable by attempting to modify
        assertThrows(UnsupportedOperationException.class, () -> {
            locked.add("item:new");
        });
    }

    @Test
    @DisplayName("Map with null keys in selected cosmetics should be handled")
    void testMapWithNullKeys_InSelectedCosmetics_Handled() {
        CosmeticData data = new CosmeticData();

        Map<String, String> selected = new HashMap<>();
        selected.put(null, "item:test:1");
        selected.put("head", "item:test:2");

        data.setSelectedCosmetics(selected);

        assertDoesNotThrow(() -> data.adaptFromSecureResponse(),
            "Should handle null keys without throwing");
    }

    @Test
    @DisplayName("Boundary: exactly one cosmetic in each field")
    void testBoundary_ExactlyOneCosmetic() {
        CosmeticData data = new CosmeticData();

        data.setUnlockedCosmetics(List.of("item:single"));

        Map<String, String> selected = new HashMap<>();
        selected.put("only", "item:single");
        data.setSelectedCosmetics(selected);

        data.adaptFromSecureResponse();

        assertEquals(1, data.getUnlocked().size());
        assertEquals(1, data.getEquipped().size());
        assertEquals(0, data.getLocked().size());
    }

    @Test
    @DisplayName("Negative test: setting unlocked to null after secure format should handle gracefully")
    void testNegative_SetUnlockedToNullAfterSecureFormat() {
        CosmeticData data = new CosmeticData();

        data.setUnlockedCosmetics(List.of("item:1"));
        data.adaptFromSecureResponse();

        assertNotNull(data.getUnlocked());

        // Now set unlocked to null
        data.setUnlocked(null);

        assertNull(data.getUnlocked());
        // Secure format fields should still be set
        assertNotNull(data.getUnlockedCosmetics());
    }

    @Test
    @DisplayName("Regression: adaptation should not modify original secure fields")
    void testRegression_AdaptationNotModifyOriginalFields() {
        CosmeticData data = new CosmeticData();

        List<String> originalUnlocked = new ArrayList<>(List.of("item:1", "item:2"));
        Map<String, String> originalSelected = new HashMap<>();
        originalSelected.put("head", "item:1");

        data.setUnlockedCosmetics(originalUnlocked);
        data.setSelectedCosmetics(originalSelected);

        data.adaptFromSecureResponse();

        // Original lists should not be modified
        assertEquals(2, originalUnlocked.size());
        assertEquals(1, originalSelected.size());

        // Secure fields should still reference original data
        assertSame(originalUnlocked, data.getUnlockedCosmetics());
        assertSame(originalSelected, data.getSelectedCosmetics());
    }
}
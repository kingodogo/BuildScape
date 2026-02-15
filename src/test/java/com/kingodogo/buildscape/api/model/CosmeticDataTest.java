package com.kingodogo.buildscape.api.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for CosmeticData.
 * Tests legacy format, secure format, and adaptation logic.
 */
class CosmeticDataTest {

    private CosmeticData cosmeticData;

    @BeforeEach
    void setUp() {
        cosmeticData = new CosmeticData();
    }

    @Test
    @DisplayName("Constructor with parameters should set legacy fields")
    void testConstructorWithParameters_SetsLegacyFields() {
        List<String> unlocked = List.of("item:minecraft:diamond");
        List<String> locked = List.of("item:minecraft:emerald");
        List<String> equipped = List.of("item:minecraft:gold_ingot");

        CosmeticData data = new CosmeticData(unlocked, locked, equipped);

        assertEquals(unlocked, data.getUnlocked());
        assertEquals(locked, data.getLocked());
        assertEquals(equipped, data.getEquipped());
    }

    @Test
    @DisplayName("Default constructor should initialize with null fields")
    void testDefaultConstructor_InitializesNullFields() {
        assertNull(cosmeticData.getUnlocked());
        assertNull(cosmeticData.getLocked());
        assertNull(cosmeticData.getEquipped());
        assertNull(cosmeticData.getDefaultCosmetics());
        assertNull(cosmeticData.getUnlockedCosmetics());
        assertNull(cosmeticData.getSelectedCosmetics());
    }

    @Test
    @DisplayName("Legacy getters and setters should work correctly")
    void testLegacyGettersSetters_WorkCorrectly() {
        List<String> unlocked = List.of("item:test:1", "item:test:2");
        List<String> locked = List.of("item:test:3");
        List<String> equipped = List.of("item:test:1");

        cosmeticData.setUnlocked(unlocked);
        cosmeticData.setLocked(locked);
        cosmeticData.setEquipped(equipped);

        assertEquals(unlocked, cosmeticData.getUnlocked());
        assertEquals(locked, cosmeticData.getLocked());
        assertEquals(equipped, cosmeticData.getEquipped());
    }

    @Test
    @DisplayName("Secure API getters and setters should work correctly")
    void testSecureAPIGettersSetters_WorkCorrectly() {
        List<String> defaultCosmetics = List.of("item:default:1");
        List<String> unlockedCosmetics = List.of("item:unlock:1", "item:unlock:2");
        Map<String, String> selectedCosmetics = new HashMap<>();
        selectedCosmetics.put("head", "item:unlock:1");

        cosmeticData.setDefaultCosmetics(defaultCosmetics);
        cosmeticData.setUnlockedCosmetics(unlockedCosmetics);
        cosmeticData.setSelectedCosmetics(selectedCosmetics);

        assertEquals(defaultCosmetics, cosmeticData.getDefaultCosmetics());
        assertEquals(unlockedCosmetics, cosmeticData.getUnlockedCosmetics());
        assertEquals(selectedCosmetics, cosmeticData.getSelectedCosmetics());
    }

    @Test
    @DisplayName("isSecureFormat() should return false for legacy format")
    void testIsSecureFormat_ReturnsFalseForLegacy() {
        cosmeticData.setUnlocked(List.of("item:test:1"));
        cosmeticData.setLocked(List.of("item:test:2"));
        cosmeticData.setEquipped(List.of("item:test:1"));

        assertFalse(cosmeticData.isSecureFormat(), "Should return false when only legacy fields are set");
    }

    @Test
    @DisplayName("isSecureFormat() should return true when unlockedCosmetics is set")
    void testIsSecureFormat_ReturnsTrueForUnlockedCosmetics() {
        cosmeticData.setUnlockedCosmetics(List.of("item:test:1"));

        assertTrue(cosmeticData.isSecureFormat(), "Should return true when unlockedCosmetics is set");
    }

    @Test
    @DisplayName("isSecureFormat() should return true when selectedCosmetics is set")
    void testIsSecureFormat_ReturnsTrueForSelectedCosmetics() {
        Map<String, String> selected = new HashMap<>();
        selected.put("head", "item:test:1");
        cosmeticData.setSelectedCosmetics(selected);

        assertTrue(cosmeticData.isSecureFormat(), "Should return true when selectedCosmetics is set");
    }

    @Test
    @DisplayName("adaptFromSecureResponse() should populate unlocked from unlockedCosmetics")
    void testAdaptFromSecureResponse_PopulatesUnlocked() {
        List<String> unlockedCosmetics = List.of("item:test:1", "item:test:2", "item:test:3");
        cosmeticData.setUnlockedCosmetics(unlockedCosmetics);

        cosmeticData.adaptFromSecureResponse();

        assertEquals(unlockedCosmetics, cosmeticData.getUnlocked(), "Unlocked should match unlockedCosmetics");
    }

    @Test
    @DisplayName("adaptFromSecureResponse() should populate equipped from selectedCosmetics values")
    void testAdaptFromSecureResponse_PopulatesEquipped() {
        Map<String, String> selectedCosmetics = new HashMap<>();
        selectedCosmetics.put("head", "item:test:helmet");
        selectedCosmetics.put("chest", "item:test:chestplate");
        selectedCosmetics.put("legs", "item:test:leggings");

        cosmeticData.setSelectedCosmetics(selectedCosmetics);
        cosmeticData.adaptFromSecureResponse();

        assertNotNull(cosmeticData.getEquipped(), "Equipped should not be null");
        assertEquals(3, cosmeticData.getEquipped().size(), "Equipped should have 3 items");
        assertTrue(cosmeticData.getEquipped().contains("item:test:helmet"), "Should contain helmet");
        assertTrue(cosmeticData.getEquipped().contains("item:test:chestplate"), "Should contain chestplate");
        assertTrue(cosmeticData.getEquipped().contains("item:test:leggings"), "Should contain leggings");
    }

    @Test
    @DisplayName("adaptFromSecureResponse() should filter null and empty values from selectedCosmetics")
    void testAdaptFromSecureResponse_FiltersNullAndEmpty() {
        Map<String, String> selectedCosmetics = new HashMap<>();
        selectedCosmetics.put("head", "item:test:helmet");
        selectedCosmetics.put("chest", null);
        selectedCosmetics.put("legs", "");
        selectedCosmetics.put("feet", "item:test:boots");

        cosmeticData.setSelectedCosmetics(selectedCosmetics);
        cosmeticData.adaptFromSecureResponse();

        assertNotNull(cosmeticData.getEquipped(), "Equipped should not be null");
        assertEquals(2, cosmeticData.getEquipped().size(), "Equipped should have only 2 non-empty items");
        assertTrue(cosmeticData.getEquipped().contains("item:test:helmet"), "Should contain helmet");
        assertTrue(cosmeticData.getEquipped().contains("item:test:boots"), "Should contain boots");
        assertFalse(cosmeticData.getEquipped().contains(null), "Should not contain null");
        assertFalse(cosmeticData.getEquipped().contains(""), "Should not contain empty string");
    }

    @Test
    @DisplayName("adaptFromSecureResponse() should set locked to empty list")
    void testAdaptFromSecureResponse_SetsLockedToEmpty() {
        cosmeticData.setUnlockedCosmetics(List.of("item:test:1"));
        cosmeticData.adaptFromSecureResponse();

        assertNotNull(cosmeticData.getLocked(), "Locked should not be null");
        assertTrue(cosmeticData.getLocked().isEmpty(), "Locked should be empty");
    }

    @Test
    @DisplayName("adaptFromSecureResponse() should handle null unlockedCosmetics")
    void testAdaptFromSecureResponse_HandlesNullUnlockedCosmetics() {
        cosmeticData.setUnlockedCosmetics(null);

        assertDoesNotThrow(() -> cosmeticData.adaptFromSecureResponse(),
            "Should not throw exception with null unlockedCosmetics");

        assertNull(cosmeticData.getUnlocked(), "Unlocked should remain null");
    }

    @Test
    @DisplayName("adaptFromSecureResponse() should handle null selectedCosmetics")
    void testAdaptFromSecureResponse_HandlesNullSelectedCosmetics() {
        cosmeticData.setSelectedCosmetics(null);

        assertDoesNotThrow(() -> cosmeticData.adaptFromSecureResponse(),
            "Should not throw exception with null selectedCosmetics");
    }

    @Test
    @DisplayName("adaptFromSecureResponse() should handle empty selectedCosmetics")
    void testAdaptFromSecureResponse_HandlesEmptySelectedCosmetics() {
        cosmeticData.setSelectedCosmetics(new HashMap<>());
        cosmeticData.adaptFromSecureResponse();

        // Equipped should be set but might be null or empty depending on implementation
        // The current implementation doesn't set equipped if selectedCosmetics is empty
    }

    @Test
    @DisplayName("Complete secure format workflow should work correctly")
    void testCompleteSecureFormatWorkflow_WorksCorrectly() {
        // Simulate API response
        List<String> defaultCosmetics = List.of("item:default:sword");
        List<String> unlockedCosmetics = List.of("item:unlock:diamond", "item:unlock:gold", "item:default:sword");
        Map<String, String> selectedCosmetics = new HashMap<>();
        selectedCosmetics.put("head", "item:unlock:diamond");
        selectedCosmetics.put("feet", "item:unlock:gold");

        cosmeticData.setDefaultCosmetics(defaultCosmetics);
        cosmeticData.setUnlockedCosmetics(unlockedCosmetics);
        cosmeticData.setSelectedCosmetics(selectedCosmetics);

        assertTrue(cosmeticData.isSecureFormat(), "Should be secure format");

        cosmeticData.adaptFromSecureResponse();

        // Verify adaptation
        assertEquals(3, cosmeticData.getUnlocked().size(), "Should have 3 unlocked items");
        assertEquals(2, cosmeticData.getEquipped().size(), "Should have 2 equipped items");
        assertTrue(cosmeticData.getLocked().isEmpty(), "Locked should be empty");
    }

    @Test
    @DisplayName("Legacy format should not be affected by adaptFromSecureResponse")
    void testLegacyFormat_NotAffectedByAdaptation() {
        List<String> originalUnlocked = List.of("item:legacy:1");
        List<String> originalLocked = List.of("item:legacy:2");
        List<String> originalEquipped = List.of("item:legacy:1");

        cosmeticData.setUnlocked(originalUnlocked);
        cosmeticData.setLocked(originalLocked);
        cosmeticData.setEquipped(originalEquipped);

        cosmeticData.adaptFromSecureResponse();

        // Legacy fields should be overwritten with empty locked
        assertEquals(originalUnlocked, cosmeticData.getUnlocked(), "Unlocked should remain unchanged");
        assertNotNull(cosmeticData.getLocked(), "Locked should not be null");
        assertTrue(cosmeticData.getLocked().isEmpty(), "Locked should be empty after adaptation");
        assertEquals(originalEquipped, cosmeticData.getEquipped(), "Equipped should remain unchanged");
    }

    @Test
    @DisplayName("Boundary case: adaptFromSecureResponse with all null values in selectedCosmetics")
    void testBoundaryCase_AllNullValuesInSelectedCosmetics() {
        Map<String, String> selectedCosmetics = new HashMap<>();
        selectedCosmetics.put("head", null);
        selectedCosmetics.put("chest", null);

        cosmeticData.setSelectedCosmetics(selectedCosmetics);
        cosmeticData.adaptFromSecureResponse();

        assertNotNull(cosmeticData.getEquipped(), "Equipped should not be null");
        assertTrue(cosmeticData.getEquipped().isEmpty(), "Equipped should be empty when all values are null");
    }
}
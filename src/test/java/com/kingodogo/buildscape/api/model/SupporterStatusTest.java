package com.kingodogo.buildscape.api.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for SupporterStatus.
 */
class SupporterStatusTest {

    @Test
    @DisplayName("Default constructor should create object with default values")
    void testDefaultConstructor_CreatesObjectWithDefaultValues() {
        SupporterStatus status = new SupporterStatus();

        assertFalse(status.isConnected());
        assertNull(status.getUsername());
        assertNull(status.getTier());
        assertNull(status.getTierLevel());
        assertNull(status.getCosmetics());
    }

    @Test
    @DisplayName("Parameterized constructor should set all fields")
    void testParameterizedConstructor_SetsAllFields() {
        List<String> cosmetics = List.of("item:diamond:helmet", "item:gold:sword");

        SupporterStatus status = new SupporterStatus(
            true,
            "TestPlayer",
            "Gold",
            2,
            cosmetics
        );

        assertTrue(status.isConnected());
        assertEquals("TestPlayer", status.getUsername());
        assertEquals("Gold", status.getTier());
        assertEquals(2, status.getTierLevel());
        assertEquals(cosmetics, status.getCosmetics());
    }

    @Test
    @DisplayName("Setters should update field values")
    void testSetters_UpdateFieldValues() {
        SupporterStatus status = new SupporterStatus();

        status.setConnected(true);
        status.setUsername("Player123");
        status.setTier("Diamond");
        status.setTierLevel(3);
        status.setCosmetics(List.of("item:test:1"));

        assertTrue(status.isConnected());
        assertEquals("Player123", status.getUsername());
        assertEquals("Diamond", status.getTier());
        assertEquals(3, status.getTierLevel());
        assertEquals(1, status.getCosmetics().size());
    }

    @Test
    @DisplayName("Connected supporter should have all fields populated")
    void testConnectedSupporter_HasAllFieldsPopulated() {
        List<String> cosmetics = List.of("item:1", "item:2", "item:3");

        SupporterStatus status = new SupporterStatus(
            true,
            "ConnectedUser",
            "Platinum",
            4,
            cosmetics
        );

        assertTrue(status.isConnected());
        assertNotNull(status.getUsername());
        assertNotNull(status.getTier());
        assertNotNull(status.getTierLevel());
        assertNotNull(status.getCosmetics());
        assertEquals(3, status.getCosmetics().size());
    }

    @Test
    @DisplayName("Not connected supporter should have connected=false")
    void testNotConnectedSupporter_HasConnectedFalse() {
        SupporterStatus status = new SupporterStatus(
            false,
            null,
            null,
            null,
            null
        );

        assertFalse(status.isConnected());
        assertNull(status.getUsername());
        assertNull(status.getTier());
        assertNull(status.getTierLevel());
        assertNull(status.getCosmetics());
    }

    @Test
    @DisplayName("Should handle empty cosmetics list")
    void testHandleEmptyCosmeticsList() {
        SupporterStatus status = new SupporterStatus(
            true,
            "User",
            "Bronze",
            1,
            List.of()
        );

        assertTrue(status.isConnected());
        assertNotNull(status.getCosmetics());
        assertTrue(status.getCosmetics().isEmpty());
    }

    @Test
    @DisplayName("Should handle null tier level for free tier")
    void testHandleNullTierLevelForFreeTier() {
        SupporterStatus status = new SupporterStatus(
            true,
            "FreeUser",
            "Free",
            null,
            List.of()
        );

        assertTrue(status.isConnected());
        assertEquals("Free", status.getTier());
        assertNull(status.getTierLevel());
    }

    @Test
    @DisplayName("Tier level should support various numeric values")
    void testTierLevelSupportsVariousValues() {
        SupporterStatus status = new SupporterStatus();

        status.setTierLevel(0);
        assertEquals(0, status.getTierLevel());

        status.setTierLevel(1);
        assertEquals(1, status.getTierLevel());

        status.setTierLevel(100);
        assertEquals(100, status.getTierLevel());

        status.setTierLevel(-1);
        assertEquals(-1, status.getTierLevel());
    }

    @Test
    @DisplayName("Should handle username with special characters")
    void testHandleUsernameWithSpecialCharacters() {
        SupporterStatus status = new SupporterStatus();
        status.setUsername("Player_123-Test");

        assertEquals("Player_123-Test", status.getUsername());
    }

    @Test
    @DisplayName("Cosmetics list should be mutable")
    void testCosmeticsListShouldBeMutable() {
        java.util.ArrayList<String> cosmetics = new java.util.ArrayList<>();
        cosmetics.add("item:1");

        SupporterStatus status = new SupporterStatus();
        status.setCosmetics(cosmetics);

        assertEquals(1, status.getCosmetics().size());

        // Modify the list
        cosmetics.add("item:2");

        // The status should reflect the change since it's the same list
        assertEquals(2, status.getCosmetics().size());
    }

    @Test
    @DisplayName("Complete supporter workflow with all data")
    void testCompleteSupporterWorkflow() {
        // Simulate a supporter with all information
        List<String> cosmetics = List.of(
            "item:diamond:helmet",
            "item:diamond:chestplate",
            "item:gold:sword",
            "particle:trail:sparkle"
        );

        SupporterStatus status = new SupporterStatus(
            true,
            "ProSupporter",
            "Diamond",
            3,
            cosmetics
        );

        // Verify all fields
        assertTrue(status.isConnected());
        assertEquals("ProSupporter", status.getUsername());
        assertEquals("Diamond", status.getTier());
        assertEquals(3, status.getTierLevel());
        assertEquals(4, status.getCosmetics().size());
        assertTrue(status.getCosmetics().contains("item:diamond:helmet"));
        assertTrue(status.getCosmetics().contains("particle:trail:sparkle"));
    }
}
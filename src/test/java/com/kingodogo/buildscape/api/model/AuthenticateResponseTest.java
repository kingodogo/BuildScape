package com.kingodogo.buildscape.api.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for AuthenticateResponse.
 */
class AuthenticateResponseTest {

    private AuthenticateResponse response;

    @BeforeEach
    void setUp() {
        response = new AuthenticateResponse();
    }

    @Test
    @DisplayName("Default constructor should create object with null fields")
    void testDefaultConstructor_CreatesObjectWithNullFields() {
        assertNull(response.getError());
        assertNull(response.getCode());
        assertNull(response.getDefaultCosmetics());
        assertNull(response.getUnlockedCosmetics());
        assertNull(response.getSelectedCosmetics());
    }

    @Test
    @DisplayName("isError() should return false when error is null")
    void testIsError_ReturnsFalseWhenErrorIsNull() {
        response.setError(null);
        assertFalse(response.isError());
    }

    @Test
    @DisplayName("isError() should return false when error is empty")
    void testIsError_ReturnsFalseWhenErrorIsEmpty() {
        response.setError("");
        assertFalse(response.isError());
    }

    @Test
    @DisplayName("isError() should return true when error is set")
    void testIsError_ReturnsTrueWhenErrorIsSet() {
        response.setError("Authentication failed");
        assertTrue(response.isError());
    }

    @Test
    @DisplayName("Getters and setters should work correctly")
    void testGettersSetters_WorkCorrectly() {
        response.setError("Test error");
        response.setCode("TEST_CODE");

        assertEquals("Test error", response.getError());
        assertEquals("TEST_CODE", response.getCode());
    }

    @Test
    @DisplayName("Cosmetic field getters and setters should work correctly")
    void testCosmeticFieldGettersSetters_WorkCorrectly() {
        List<String> defaultCosmetics = List.of("item:default:1");
        List<String> unlockedCosmetics = List.of("item:unlock:1", "item:unlock:2");
        Map<String, String> selectedCosmetics = new HashMap<>();
        selectedCosmetics.put("head", "item:unlock:1");

        response.setDefaultCosmetics(defaultCosmetics);
        response.setUnlockedCosmetics(unlockedCosmetics);
        response.setSelectedCosmetics(selectedCosmetics);

        assertEquals(defaultCosmetics, response.getDefaultCosmetics());
        assertEquals(unlockedCosmetics, response.getUnlockedCosmetics());
        assertEquals(selectedCosmetics, response.getSelectedCosmetics());
    }

    @Test
    @DisplayName("toCosmeticData() should convert response to CosmeticData")
    void testToCosmeticData_ConvertsResponseToCosmeticData() {
        List<String> defaultCosmetics = List.of("item:default:1");
        List<String> unlockedCosmetics = List.of("item:unlock:1", "item:unlock:2");
        Map<String, String> selectedCosmetics = new HashMap<>();
        selectedCosmetics.put("head", "item:unlock:1");
        selectedCosmetics.put("chest", "item:unlock:2");

        response.setDefaultCosmetics(defaultCosmetics);
        response.setUnlockedCosmetics(unlockedCosmetics);
        response.setSelectedCosmetics(selectedCosmetics);

        CosmeticData data = response.toCosmeticData();

        assertNotNull(data);
        assertEquals(defaultCosmetics, data.getDefaultCosmetics());
        assertEquals(unlockedCosmetics, data.getUnlockedCosmetics());
        assertEquals(selectedCosmetics, data.getSelectedCosmetics());
    }

    @Test
    @DisplayName("toCosmeticData() should call adaptFromSecureResponse()")
    void testToCosmeticData_CallsAdaptFromSecureResponse() {
        List<String> unlockedCosmetics = List.of("item:unlock:1", "item:unlock:2");
        Map<String, String> selectedCosmetics = new HashMap<>();
        selectedCosmetics.put("head", "item:unlock:1");

        response.setUnlockedCosmetics(unlockedCosmetics);
        response.setSelectedCosmetics(selectedCosmetics);

        CosmeticData data = response.toCosmeticData();

        // After adaptFromSecureResponse, unlocked should be populated
        assertNotNull(data.getUnlocked());
        assertEquals(unlockedCosmetics, data.getUnlocked());

        // Equipped should be populated from selectedCosmetics
        assertNotNull(data.getEquipped());
        assertEquals(1, data.getEquipped().size());
        assertTrue(data.getEquipped().contains("item:unlock:1"));

        // Locked should be empty
        assertNotNull(data.getLocked());
        assertTrue(data.getLocked().isEmpty());
    }

    @Test
    @DisplayName("toCosmeticData() should handle null fields")
    void testToCosmeticData_HandlesNullFields() {
        CosmeticData data = response.toCosmeticData();

        assertNotNull(data);
        assertNull(data.getDefaultCosmetics());
        assertNull(data.getUnlockedCosmetics());
        assertNull(data.getSelectedCosmetics());
    }

    @Test
    @DisplayName("Error response should still convert to CosmeticData")
    void testErrorResponse_StillConvertsToCosmeticData() {
        response.setError("Authentication failed");
        response.setCode("AUTH_FAILED");

        CosmeticData data = response.toCosmeticData();

        assertNotNull(data);
        // Even error responses should convert (with null cosmetic data)
    }

    @Test
    @DisplayName("isError() should handle whitespace-only error string")
    void testIsError_HandlesWhitespaceOnlyError() {
        response.setError("   ");
        // Current implementation: "   " is not empty, so isError() returns true
        assertTrue(response.isError());
    }

    @Test
    @DisplayName("Multiple toCosmeticData() calls should create independent objects")
    void testToCosmeticData_CreatesIndependentObjects() {
        response.setUnlockedCosmetics(List.of("item:test:1"));

        CosmeticData data1 = response.toCosmeticData();
        CosmeticData data2 = response.toCosmeticData();

        assertNotSame(data1, data2);
    }

    @Test
    @DisplayName("Code field should be independent of error field")
    void testCodeField_IndependentOfErrorField() {
        response.setCode("TEST_CODE");
        assertFalse(response.isError(), "Having code but no error should not trigger isError()");

        response.setError("Test error");
        assertTrue(response.isError(), "Having both code and error should trigger isError()");
        assertEquals("TEST_CODE", response.getCode(), "Code should remain set");
    }

    @Test
    @DisplayName("Complete successful authentication workflow")
    void testCompleteSuccessfulAuthWorkflow() {
        // Simulate successful authentication response
        response.setDefaultCosmetics(List.of("item:default:sword"));
        response.setUnlockedCosmetics(List.of("item:unlock:diamond", "item:unlock:gold"));
        Map<String, String> selected = new HashMap<>();
        selected.put("head", "item:unlock:diamond");
        selected.put("feet", "item:unlock:gold");
        response.setSelectedCosmetics(selected);

        assertFalse(response.isError());
        assertNull(response.getError());

        CosmeticData data = response.toCosmeticData();
        assertNotNull(data);
        assertTrue(data.isSecureFormat());
        assertEquals(2, data.getUnlocked().size());
        assertEquals(2, data.getEquipped().size());
    }

    @Test
    @DisplayName("Complete failed authentication workflow")
    void testCompleteFailedAuthWorkflow() {
        // Simulate failed authentication response
        response.setError("Invalid access token");
        response.setCode("AUTH_INVALID_TOKEN");

        assertTrue(response.isError());
        assertEquals("Invalid access token", response.getError());
        assertEquals("AUTH_INVALID_TOKEN", response.getCode());

        CosmeticData data = response.toCosmeticData();
        assertNotNull(data);
        assertNull(data.getDefaultCosmetics());
        assertNull(data.getUnlockedCosmetics());
    }
}
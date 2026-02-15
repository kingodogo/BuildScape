package com.kingodogo.buildscape.api.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for ApiResponse.
 */
class ApiResponseTest {

    @Test
    @DisplayName("Default constructor should create object with default values")
    void testDefaultConstructor_CreatesObjectWithDefaultValues() {
        ApiResponse response = new ApiResponse();

        assertFalse(response.isSuccess());
        assertNull(response.getMessage());
        assertNull(response.getError());
    }

    @Test
    @DisplayName("Parameterized constructor should set success and message")
    void testParameterizedConstructor_SetsSucessAndMessage() {
        ApiResponse response = new ApiResponse(true, "Operation successful");

        assertTrue(response.isSuccess());
        assertEquals("Operation successful", response.getMessage());
        assertNull(response.getError());
    }

    @Test
    @DisplayName("Setters should update field values")
    void testSetters_UpdateFieldValues() {
        ApiResponse response = new ApiResponse();

        response.setSuccess(true);
        response.setMessage("Test message");
        response.setError("Test error");

        assertTrue(response.isSuccess());
        assertEquals("Test message", response.getMessage());
        assertEquals("Test error", response.getError());
    }

    @Test
    @DisplayName("Success response should have success=true and message")
    void testSuccessResponse_HasSuccessTrueAndMessage() {
        ApiResponse response = new ApiResponse(true, "Connection successful");

        assertTrue(response.isSuccess());
        assertEquals("Connection successful", response.getMessage());
    }

    @Test
    @DisplayName("Failure response should have success=false")
    void testFailureResponse_HasSuccessFalse() {
        ApiResponse response = new ApiResponse(false, "Connection failed");

        assertFalse(response.isSuccess());
        assertEquals("Connection failed", response.getMessage());
    }

    @Test
    @DisplayName("Should handle null message")
    void testHandleNullMessage() {
        ApiResponse response = new ApiResponse(true, null);

        assertTrue(response.isSuccess());
        assertNull(response.getMessage());
    }

    @Test
    @DisplayName("Should handle empty message")
    void testHandleEmptyMessage() {
        ApiResponse response = new ApiResponse(true, "");

        assertTrue(response.isSuccess());
        assertEquals("", response.getMessage());
    }

    @Test
    @DisplayName("Error field should be independent of success field")
    void testErrorField_IndependentOfSuccessField() {
        ApiResponse response = new ApiResponse(true, "Success");
        response.setError("Warning message");

        assertTrue(response.isSuccess());
        assertEquals("Success", response.getMessage());
        assertEquals("Warning message", response.getError());
    }

    @Test
    @DisplayName("Should allow changing success state")
    void testAllowChangingSuccessState() {
        ApiResponse response = new ApiResponse(true, "Initial success");

        response.setSuccess(false);
        response.setMessage("Now failed");

        assertFalse(response.isSuccess());
        assertEquals("Now failed", response.getMessage());
    }
}
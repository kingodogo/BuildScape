package com.kingodogo.buildscape.api.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for AuthenticateRequest.
 */
class AuthenticateRequestTest {

    @Test
    @DisplayName("Default constructor should create object with null fields")
    void testDefaultConstructor_CreatesObjectWithNullFields() {
        AuthenticateRequest request = new AuthenticateRequest();

        assertNull(request.getAction());
        assertNull(request.getUuid());
        assertNull(request.getAccessToken());
    }

    @Test
    @DisplayName("Parameterized constructor should set all fields")
    void testParameterizedConstructor_SetsAllFields() {
        String action = "authenticate";
        String uuid = "550e8400-e29b-41d4-a716-446655440000";
        String accessToken = "test_token_12345";

        AuthenticateRequest request = new AuthenticateRequest(action, uuid, accessToken);

        assertEquals(action, request.getAction());
        assertEquals(uuid, request.getUuid());
        assertEquals(accessToken, request.getAccessToken());
    }

    @Test
    @DisplayName("createAuthenticate() factory method should create request with authenticate action")
    void testCreateAuthenticate_CreatesRequestWithAuthenticateAction() {
        String uuid = "550e8400-e29b-41d4-a716-446655440000";
        String accessToken = "test_token_12345";

        AuthenticateRequest request = AuthenticateRequest.createAuthenticate(uuid, accessToken);

        assertNotNull(request);
        assertEquals("authenticate", request.getAction());
        assertEquals(uuid, request.getUuid());
        assertEquals(accessToken, request.getAccessToken());
    }

    @Test
    @DisplayName("Setters should update field values")
    void testSetters_UpdateFieldValues() {
        AuthenticateRequest request = new AuthenticateRequest();

        request.setAction("test_action");
        request.setUuid("test_uuid");
        request.setAccessToken("test_token");

        assertEquals("test_action", request.getAction());
        assertEquals("test_uuid", request.getUuid());
        assertEquals("test_token", request.getAccessToken());
    }

    @Test
    @DisplayName("Should handle null values in constructor")
    void testConstructor_HandlesNullValues() {
        AuthenticateRequest request = new AuthenticateRequest(null, null, null);

        assertNull(request.getAction());
        assertNull(request.getUuid());
        assertNull(request.getAccessToken());
    }

    @Test
    @DisplayName("Should handle empty strings in constructor")
    void testConstructor_HandlesEmptyStrings() {
        AuthenticateRequest request = new AuthenticateRequest("", "", "");

        assertEquals("", request.getAction());
        assertEquals("", request.getUuid());
        assertEquals("", request.getAccessToken());
    }

    @Test
    @DisplayName("createAuthenticate() should handle UUID with dashes")
    void testCreateAuthenticate_HandlesUuidWithDashes() {
        String uuidWithDashes = "550e8400-e29b-41d4-a716-446655440000";
        String accessToken = "test_token";

        AuthenticateRequest request = AuthenticateRequest.createAuthenticate(uuidWithDashes, accessToken);

        assertEquals(uuidWithDashes, request.getUuid());
    }

    @Test
    @DisplayName("createAuthenticate() should handle UUID without dashes")
    void testCreateAuthenticate_HandlesUuidWithoutDashes() {
        String uuidWithoutDashes = "550e8400e29b41d4a716446655440000";
        String accessToken = "test_token";

        AuthenticateRequest request = AuthenticateRequest.createAuthenticate(uuidWithoutDashes, accessToken);

        assertEquals(uuidWithoutDashes, request.getUuid());
    }

    @Test
    @DisplayName("Multiple createAuthenticate() calls should create independent objects")
    void testCreateAuthenticate_CreatesIndependentObjects() {
        AuthenticateRequest request1 = AuthenticateRequest.createAuthenticate("uuid1", "token1");
        AuthenticateRequest request2 = AuthenticateRequest.createAuthenticate("uuid2", "token2");

        assertNotSame(request1, request2);
        assertEquals("uuid1", request1.getUuid());
        assertEquals("uuid2", request2.getUuid());
        assertEquals("token1", request1.getAccessToken());
        assertEquals("token2", request2.getAccessToken());
    }

    @Test
    @DisplayName("Setters should allow overwriting values")
    void testSetters_AllowOverwriting() {
        AuthenticateRequest request = new AuthenticateRequest("action1", "uuid1", "token1");

        request.setAction("action2");
        request.setUuid("uuid2");
        request.setAccessToken("token2");

        assertEquals("action2", request.getAction());
        assertEquals("uuid2", request.getUuid());
        assertEquals("token2", request.getAccessToken());
    }
}
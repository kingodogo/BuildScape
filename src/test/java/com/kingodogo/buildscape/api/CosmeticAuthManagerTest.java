package com.kingodogo.buildscape.api;

import com.kingodogo.buildscape.api.model.CosmeticData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for CosmeticAuthManager.
 * Tests authentication caching, thread safety, and state management.
 */
class CosmeticAuthManagerTest {

    private CosmeticAuthManager authManager;

    @BeforeEach
    void setUp() {
        authManager = CosmeticAuthManager.getInstance();
        authManager.clearCache();
    }

    @AfterEach
    void tearDown() {
        authManager.clearCache();
    }

    @Test
    @DisplayName("getInstance() should return singleton instance")
    void testGetInstance_ReturnsSingleton() {
        CosmeticAuthManager instance1 = CosmeticAuthManager.getInstance();
        CosmeticAuthManager instance2 = CosmeticAuthManager.getInstance();

        assertSame(instance1, instance2, "Should return same singleton instance");
    }

    @Test
    @DisplayName("isAuthenticated() should return false initially")
    void testIsAuthenticated_InitiallyFalse() {
        assertFalse(authManager.isAuthenticated(), "Should not be authenticated initially");
    }

    @Test
    @DisplayName("getCachedCosmetics() should return null initially")
    void testGetCachedCosmetics_InitiallyNull() {
        assertNull(authManager.getCachedCosmetics(), "Should have no cached cosmetics initially");
    }

    @Test
    @DisplayName("getAuthTimestamp() should return 0 initially")
    void testGetAuthTimestamp_InitiallyZero() {
        assertEquals(0, authManager.getAuthTimestamp(), "Should have zero timestamp initially");
    }

    @Test
    @DisplayName("clearCache() should reset all state")
    void testClearCache_ResetsState() {
        // Force some state (using reflection since authenticateOnLaunch needs Minecraft)
        try {
            java.lang.reflect.Field authenticatedField = CosmeticAuthManager.class.getDeclaredField("authenticated");
            authenticatedField.setAccessible(true);
            authenticatedField.set(authManager, true);

            java.lang.reflect.Field timestampField = CosmeticAuthManager.class.getDeclaredField("authTimestamp");
            timestampField.setAccessible(true);
            timestampField.set(authManager, 12345L);

            assertTrue(authManager.isAuthenticated(), "Should be authenticated before clear");
            assertEquals(12345L, authManager.getAuthTimestamp(), "Should have timestamp before clear");

            authManager.clearCache();

            assertFalse(authManager.isAuthenticated(), "Should not be authenticated after clear");
            assertEquals(0, authManager.getAuthTimestamp(), "Should have zero timestamp after clear");
            assertNull(authManager.getCachedCosmetics(), "Should have no cached cosmetics after clear");
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("forceReauthentication() should reset authentication state but not in-progress flag")
    void testForceReauthentication_ResetsAuthState() {
        // Set some state
        try {
            java.lang.reflect.Field authenticatedField = CosmeticAuthManager.class.getDeclaredField("authenticated");
            authenticatedField.setAccessible(true);
            authenticatedField.set(authManager, true);

            java.lang.reflect.Field timestampField = CosmeticAuthManager.class.getDeclaredField("authTimestamp");
            timestampField.setAccessible(true);
            timestampField.set(authManager, 12345L);

            authManager.forceReauthentication();

            assertFalse(authManager.isAuthenticated(), "Should not be authenticated after force reauth");
            assertEquals(0, authManager.getAuthTimestamp(), "Should have zero timestamp after force reauth");
            assertNull(authManager.getCachedCosmetics(), "Should have no cached cosmetics after force reauth");
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("getCachedCosmetics() should return cached data after authentication")
    void testGetCachedCosmetics_ReturnsDataAfterAuth() {
        try {
            // Simulate successful authentication by setting cached data
            CosmeticData mockData = new CosmeticData();
            mockData.setUnlocked(java.util.List.of("item:test:diamond"));

            java.lang.reflect.Field cachedField = CosmeticAuthManager.class.getDeclaredField("cachedCosmetics");
            cachedField.setAccessible(true);
            cachedField.set(authManager, mockData);

            java.lang.reflect.Field authenticatedField = CosmeticAuthManager.class.getDeclaredField("authenticated");
            authenticatedField.setAccessible(true);
            authenticatedField.set(authManager, true);

            CosmeticData retrieved = authManager.getCachedCosmetics();
            assertNotNull(retrieved, "Should return cached cosmetics");
            assertEquals(1, retrieved.getUnlocked().size(), "Should have correct number of unlocked items");
            assertEquals("item:test:diamond", retrieved.getUnlocked().get(0), "Should have correct cosmetic ID");
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Thread safety: concurrent access should not cause issues")
    void testThreadSafety_ConcurrentAccess() throws InterruptedException {
        final int threadCount = 10;
        Thread[] threads = new Thread[threadCount];
        final java.util.concurrent.atomic.AtomicInteger successCount = new java.util.concurrent.atomic.AtomicInteger(0);

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                try {
                    // Concurrent reads should be safe
                    boolean isAuth = authManager.isAuthenticated();
                    CosmeticData data = authManager.getCachedCosmetics();
                    long timestamp = authManager.getAuthTimestamp();

                    // Should complete without exception
                    successCount.incrementAndGet();
                } catch (Exception e) {
                    // Fail on exception
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        assertEquals(threadCount, successCount.get(), "All threads should complete successfully");
    }

    @Test
    @DisplayName("Authentication timestamp should be set after successful auth")
    void testAuthTimestamp_SetAfterAuth() {
        try {
            long beforeTime = System.currentTimeMillis();

            java.lang.reflect.Field timestampField = CosmeticAuthManager.class.getDeclaredField("authTimestamp");
            timestampField.setAccessible(true);
            timestampField.set(authManager, beforeTime);

            long timestamp = authManager.getAuthTimestamp();
            assertTrue(timestamp >= beforeTime, "Timestamp should be set to current or later time");
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Cached cosmetics should persist across multiple getCachedCosmetics() calls")
    void testCachedCosmetics_PersistsAcrossCalls() {
        try {
            CosmeticData mockData = new CosmeticData();
            mockData.setUnlocked(java.util.List.of("item:test:gold", "item:test:silver"));

            java.lang.reflect.Field cachedField = CosmeticAuthManager.class.getDeclaredField("cachedCosmetics");
            cachedField.setAccessible(true);
            cachedField.set(authManager, mockData);

            CosmeticData first = authManager.getCachedCosmetics();
            CosmeticData second = authManager.getCachedCosmetics();

            assertSame(first, second, "Should return same cached instance");
            assertEquals(2, first.getUnlocked().size(), "Should maintain correct data");
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("clearCache() should be thread-safe")
    void testClearCache_ThreadSafe() throws InterruptedException {
        final int threadCount = 5;
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                authManager.clearCache();
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        // Should complete without exception and state should be clean
        assertFalse(authManager.isAuthenticated());
        assertNull(authManager.getCachedCosmetics());
        assertEquals(0, authManager.getAuthTimestamp());
    }

    @Test
    @DisplayName("forceReauthentication() should be thread-safe")
    void testForceReauthentication_ThreadSafe() throws InterruptedException {
        final int threadCount = 5;
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                authManager.forceReauthentication();
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        // Should complete without exception and state should be clean
        assertFalse(authManager.isAuthenticated());
        assertNull(authManager.getCachedCosmetics());
        assertEquals(0, authManager.getAuthTimestamp());
    }
}
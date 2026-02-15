package com.kingodogo.buildscape.api;

import com.kingodogo.buildscape.api.model.CosmeticData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Concurrency and stress tests for CosmeticAuthManager.
 * Tests thread safety under high concurrency scenarios.
 */
class CosmeticAuthManagerConcurrencyTest {

    private CosmeticAuthManager authManager;
    private ExecutorService executorService;

    @BeforeEach
    void setUp() {
        authManager = CosmeticAuthManager.getInstance();
        authManager.clearCache();
        executorService = Executors.newFixedThreadPool(20);
    }

    @AfterEach
    void tearDown() {
        authManager.clearCache();
        executorService.shutdownNow();
    }

    @Test
    @DisplayName("Concurrent clearCache() calls should be thread-safe")
    void testConcurrentClearCache_ThreadSafe() throws InterruptedException {
        final int threadCount = 50;
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch doneLatch = new CountDownLatch(threadCount);
        final AtomicInteger exceptionCount = new AtomicInteger(0);

        // Set some initial state
        try {
            java.lang.reflect.Field authenticatedField = CosmeticAuthManager.class.getDeclaredField("authenticated");
            authenticatedField.setAccessible(true);
            authenticatedField.set(authManager, true);
        } catch (Exception e) {
            fail("Setup failed: " + e.getMessage());
        }

        for (int i = 0; i < threadCount; i++) {
            executorService.submit(() -> {
                try {
                    startLatch.await(); // Wait for all threads to be ready
                    authManager.clearCache();
                } catch (Exception e) {
                    exceptionCount.incrementAndGet();
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        startLatch.countDown(); // Start all threads
        boolean completed = doneLatch.await(5, TimeUnit.SECONDS);

        assertTrue(completed, "All threads should complete within timeout");
        assertEquals(0, exceptionCount.get(), "No exceptions should occur");
        assertFalse(authManager.isAuthenticated(), "Should be in clean state");
    }

    @Test
    @DisplayName("Concurrent forceReauthentication() calls should be thread-safe")
    void testConcurrentForceReauthentication_ThreadSafe() throws InterruptedException {
        final int threadCount = 50;
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch doneLatch = new CountDownLatch(threadCount);
        final AtomicInteger exceptionCount = new AtomicInteger(0);

        for (int i = 0; i < threadCount; i++) {
            executorService.submit(() -> {
                try {
                    startLatch.await();
                    authManager.forceReauthentication();
                } catch (Exception e) {
                    exceptionCount.incrementAndGet();
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        boolean completed = doneLatch.await(5, TimeUnit.SECONDS);

        assertTrue(completed, "All threads should complete within timeout");
        assertEquals(0, exceptionCount.get(), "No exceptions should occur");
        assertFalse(authManager.isAuthenticated(), "Should not be authenticated");
    }

    @Test
    @DisplayName("Concurrent reads should not block each other")
    void testConcurrentReads_DoNotBlock() throws InterruptedException {
        final int threadCount = 100;
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch doneLatch = new CountDownLatch(threadCount);
        final List<Long> completionTimes = new CopyOnWriteArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            executorService.submit(() -> {
                try {
                    startLatch.await();
                    long start = System.nanoTime();

                    // Perform multiple read operations
                    boolean isAuth = authManager.isAuthenticated();
                    CosmeticData data = authManager.getCachedCosmetics();
                    long timestamp = authManager.getAuthTimestamp();

                    long duration = System.nanoTime() - start;
                    completionTimes.add(duration);
                } catch (Exception e) {
                    // Ignore
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        boolean completed = doneLatch.await(5, TimeUnit.SECONDS);

        assertTrue(completed, "All threads should complete quickly");
        assertEquals(threadCount, completionTimes.size(), "All threads should record completion");

        // Calculate average time
        double avgNanos = completionTimes.stream().mapToLong(Long::longValue).average().orElse(0);
        double avgMillis = avgNanos / 1_000_000.0;

        // Reads should be fast (< 10ms average)
        assertTrue(avgMillis < 10, "Average read time should be fast: " + avgMillis + "ms");
    }

    @Test
    @DisplayName("Mixed concurrent operations should maintain consistency")
    void testMixedConcurrentOperations_MaintainConsistency() throws InterruptedException {
        final int operationsPerType = 20;
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch doneLatch = new CountDownLatch(operationsPerType * 3);
        final AtomicInteger readSuccesses = new AtomicInteger(0);

        // Readers
        for (int i = 0; i < operationsPerType; i++) {
            executorService.submit(() -> {
                try {
                    startLatch.await();
                    boolean isAuth = authManager.isAuthenticated();
                    CosmeticData data = authManager.getCachedCosmetics();
                    long timestamp = authManager.getAuthTimestamp();
                    readSuccesses.incrementAndGet();
                } catch (Exception e) {
                    // Ignore
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        // Clear operations
        for (int i = 0; i < operationsPerType; i++) {
            executorService.submit(() -> {
                try {
                    startLatch.await();
                    authManager.clearCache();
                } catch (Exception e) {
                    // Ignore
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        // Force reauth operations
        for (int i = 0; i < operationsPerType; i++) {
            executorService.submit(() -> {
                try {
                    startLatch.await();
                    authManager.forceReauthentication();
                } catch (Exception e) {
                    // Ignore
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        boolean completed = doneLatch.await(10, TimeUnit.SECONDS);

        assertTrue(completed, "All operations should complete");
        assertTrue(readSuccesses.get() > 0, "Some reads should succeed");

        // Final state should be consistent
        assertFalse(authManager.isAuthenticated(), "Should not be authenticated after clears");
        assertNull(authManager.getCachedCosmetics(), "Should have no cached data");
        assertEquals(0, authManager.getAuthTimestamp(), "Should have zero timestamp");
    }

    @Test
    @DisplayName("Rapid successive clearCache() calls should maintain state consistency")
    void testRapidClearCache_MaintainsStateConsistency() throws InterruptedException {
        final int iterations = 1000;

        for (int i = 0; i < iterations; i++) {
            authManager.clearCache();

            // Verify state after each clear
            assertFalse(authManager.isAuthenticated(), "Should not be authenticated at iteration " + i);
            assertNull(authManager.getCachedCosmetics(), "Should have no cache at iteration " + i);
            assertEquals(0, authManager.getAuthTimestamp(), "Should have zero timestamp at iteration " + i);
        }
    }

    @Test
    @DisplayName("Concurrent access during state transition should not corrupt data")
    void testConcurrentAccessDuringStateTransition_NoCorruption() throws InterruptedException {
        final int readerCount = 30;
        final int writerCount = 10;
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch doneLatch = new CountDownLatch(readerCount + writerCount);
        final List<Boolean> authStates = new CopyOnWriteArrayList<>();

        // Readers continuously check authentication state
        for (int i = 0; i < readerCount; i++) {
            executorService.submit(() -> {
                try {
                    startLatch.await();
                    for (int j = 0; j < 100; j++) {
                        boolean isAuth = authManager.isAuthenticated();
                        authStates.add(isAuth);
                        Thread.sleep(1); // Small delay
                    }
                } catch (Exception e) {
                    // Ignore
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        // Writers toggle state
        for (int i = 0; i < writerCount; i++) {
            final int index = i;
            executorService.submit(() -> {
                try {
                    startLatch.await();
                    for (int j = 0; j < 50; j++) {
                        if (index % 2 == 0) {
                            authManager.clearCache();
                        } else {
                            authManager.forceReauthentication();
                        }
                        Thread.sleep(2); // Small delay
                    }
                } catch (Exception e) {
                    // Ignore
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        boolean completed = doneLatch.await(30, TimeUnit.SECONDS);

        assertTrue(completed, "All operations should complete");
        assertFalse(authStates.isEmpty(), "Should have recorded states");

        // All recorded states should be valid (either true or false, not corrupted)
        for (Boolean state : authStates) {
            assertNotNull(state, "State should not be null");
        }
    }

    @Test
    @DisplayName("High frequency getCachedCosmetics() calls should be consistent")
    void testHighFrequencyGetCachedCosmetics_Consistent() throws InterruptedException {
        final int threadCount = 50;
        final int callsPerThread = 100;
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch doneLatch = new CountDownLatch(threadCount);
        final List<CosmeticData> results = new CopyOnWriteArrayList<>();

        // Set initial cached data
        try {
            CosmeticData mockData = new CosmeticData();
            mockData.setUnlocked(List.of("item:test:1"));

            java.lang.reflect.Field cachedField = CosmeticAuthManager.class.getDeclaredField("cachedCosmetics");
            cachedField.setAccessible(true);
            cachedField.set(authManager, mockData);
        } catch (Exception e) {
            fail("Setup failed: " + e.getMessage());
        }

        for (int i = 0; i < threadCount; i++) {
            executorService.submit(() -> {
                try {
                    startLatch.await();
                    for (int j = 0; j < callsPerThread; j++) {
                        CosmeticData data = authManager.getCachedCosmetics();
                        results.add(data);
                    }
                } catch (Exception e) {
                    // Ignore
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        boolean completed = doneLatch.await(10, TimeUnit.SECONDS);

        assertTrue(completed, "All threads should complete");
        assertEquals(threadCount * callsPerThread, results.size(), "Should have all results");

        // All results should be the same instance (cached)
        CosmeticData first = results.get(0);
        for (CosmeticData data : results) {
            if (data != null) {
                assertSame(first, data, "All cached results should be same instance");
            }
        }
    }

    @Test
    @DisplayName("Stress test: sustained concurrent operations for extended period")
    void testStressTest_SustainedConcurrentOperations() throws InterruptedException {
        final int duration = 2; // seconds
        final AtomicInteger operationCount = new AtomicInteger(0);
        final AtomicInteger errorCount = new AtomicInteger(0);
        final CountDownLatch stopLatch = new CountDownLatch(1);

        // Start multiple worker threads
        for (int i = 0; i < 10; i++) {
            final int threadId = i;
            executorService.submit(() -> {
                while (stopLatch.getCount() > 0) {
                    try {
                        switch (threadId % 4) {
                            case 0:
                                authManager.isAuthenticated();
                                break;
                            case 1:
                                authManager.getCachedCosmetics();
                                break;
                            case 2:
                                authManager.clearCache();
                                break;
                            case 3:
                                authManager.forceReauthentication();
                                break;
                        }
                        operationCount.incrementAndGet();
                    } catch (Exception e) {
                        errorCount.incrementAndGet();
                    }
                }
            });
        }

        // Run for specified duration
        Thread.sleep(duration * 1000L);
        stopLatch.countDown();

        // Wait for threads to finish current operations
        executorService.shutdown();
        boolean terminated = executorService.awaitTermination(5, TimeUnit.SECONDS);

        assertTrue(terminated, "Executor should terminate cleanly");
        assertTrue(operationCount.get() > 1000, "Should perform many operations: " + operationCount.get());
        assertEquals(0, errorCount.get(), "Should have no errors during stress test");

        // Verify final state is consistent
        assertNotNull(authManager, "Manager should still be valid");
        assertFalse(authManager.isAuthenticated() && authManager.getCachedCosmetics() != null,
            "State should be internally consistent");
    }
}
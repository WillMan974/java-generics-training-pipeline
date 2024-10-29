package main.java.exercises.ex10;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.Objects.nonNull;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * A generic cache with expiring entries.
 *
 * @param <K> the type of keys maintained by this cache
 * @param <V> the type of mapped values
 */
public class ExpiringCache<K, V> {
    private final Map<K, CacheEntry<V>> cache;
    private final ScheduledExecutorService scheduler;

    public ExpiringCache() {
        this.cache = new ConcurrentHashMap<>();
        this.scheduler = Executors.newScheduledThreadPool(1);
    }

    /**
     * Puts a value into the cache with a specified time-to-live (TTL).
     *
     * @param key the key with which the specified value is to be associated
     * @param value the value to be associated with the specified key
     * @param ttlInSeconds the time-to-live (TTL) for the cache entry in seconds
     */
    public void put(K key, V value, long ttlInSeconds) {
        long expirationTime = System.currentTimeMillis() + SECONDS.toMillis(ttlInSeconds);

        cache.put(key, new CacheEntry<>(value, expirationTime));
        scheduler.schedule(
                () -> cache.remove(key), ttlInSeconds, SECONDS
        );
    }

    public V get(K key) {
        CacheEntry<V> entry = cache.get(key);

        if (nonNull(entry) && entry.isValid()) {
            return entry.value();
        }
        cache.remove(key);
        return null;
    }

    public void clear() {
        cache.clear();
    }

    public void shutdown() {
        scheduler.shutdown();
    }

    /**
     * Represents an entry in the cache with a value and an expiration time.
     *
     * @param <V> The type of the value contained in the cache entry.
     */
    private record CacheEntry<V>(V value, long expirationTime) {
        boolean isValid() {
            return System.currentTimeMillis() < expirationTime;
        }
    }
}

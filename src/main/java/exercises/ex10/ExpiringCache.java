package main.java.exercises.ex10;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.Objects.nonNull;
import static java.util.concurrent.TimeUnit.SECONDS;

public class ExpiringCache<K, V> {
    private final Map<K, CacheEntry<V>> cache;
    private final ScheduledExecutorService scheduler;

    public ExpiringCache() {
        this.cache = new ConcurrentHashMap<>();
        this.scheduler = Executors.newScheduledThreadPool(1);
    }

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

    private record CacheEntry<V>(V value, long expirationTime) {
        boolean isValid() {
            return System.currentTimeMillis() < expirationTime;
        }
    }
}

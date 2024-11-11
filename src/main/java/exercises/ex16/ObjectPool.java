package main.java.exercises.ex16;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Supplier;

/**
 * A generic thread-safe object pool implementation.
 *
 * @param <T> the type of objects to be pooled
 */
public class ObjectPool<T> {
    private final ConcurrentLinkedQueue<T> pool;
    private final Supplier<T> factory;

    public ObjectPool(Supplier<T> factory) {
        this.pool = new ConcurrentLinkedQueue<>();
        this.factory = factory;
    }

    /**
     * Acquires an object from the pool if available; otherwise, creates a new object using the factory.
     *
     * @return an Optional containing an object from the pool if available, or a newly created object if the pool is empty
     */
    public Optional<T> acquire() {
        return Optional
                .ofNullable(pool.poll())
                .or(() -> Optional.of(factory.get()));
    }

    /**
     * Releases an object back to the pool if it is non-null.
     *
     * @param obj the object to be released back to the pool
     */
    public void release(T obj) {
        if (Objects.nonNull(obj)) {
            pool.offer(obj);
        }
    }
}
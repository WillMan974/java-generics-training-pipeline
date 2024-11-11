package main.java.exercises.ex16;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Supplier;

public class ObjectPool<T> {
    private final ConcurrentLinkedQueue<T> pool;
    private final Supplier<T> factory;

    public ObjectPool(Supplier<T> factory) {
        this.pool = new ConcurrentLinkedQueue<>();
        this.factory = factory;
    }

    public Optional<T> acquire() {
        return Optional
                .ofNullable(pool.poll())
                .or(() -> Optional.of(factory.get()));
    }

    public void release(T obj) {
        if (Objects.nonNull(obj)) {
            pool.offer(obj);
        }
    }
}
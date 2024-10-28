package main.java.exercises.ex05;

import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public Pair<U, T> swap() {
        return new Pair<>(this.second, this.first);
    }

    public Pair<T, U> mapFirst(Function<T, T> mapper) {
        return new Pair<>(
                mapper.apply(this.first),
                this.second
        );
    }

    public Pair<T, U> mapSecond(Function<U, U> mapper) {
        return new Pair<>(
                this.first,
                mapper.apply(this.second)
        );
    }

    public Pair<?, ?> mapBoth(BiConsumer<T, U> consumer) {
        consumer.accept(this.first, this.second);
        return new Pair<>(this.first, this.second);
    }

    /**
     * Merge two pairs using a BiConsumer.
     *
     * @param other    the other pair to merge with
     * @param consumer the consumer defining how to merge the pairs
     */
    public void merge(Pair<T, U> other, BiConsumer<Pair<T, U>, Pair<T, U>> consumer) {
        consumer.accept(this, other);
    }

    public List<?> toList() {
        return List.of(this.first, this.second);
    }

    public <R> R transform(Function<Pair<T, U>, R> transformer) {
        return transformer.apply(this);
    }

    @Override
    public String toString() {
        return String.format("""
                        Pair<%s, %s> {
                            first = %s,
                            second = %s
                        }""",
                Objects.nonNull(first) ? first.getClass().getSimpleName() : "NULL",
                Objects.nonNull(second) ? second.getClass().getSimpleName() : "NULL",
                Objects.nonNull(first) ? first.toString() : "NULL",
                Objects.nonNull(second) ? second.toString() : "NULL");
    }
}

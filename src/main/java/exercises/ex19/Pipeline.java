package main.java.exercises.ex19;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/**
 * The Pipeline class represents a generic wrapper for an object of type T that
 * allows for chained transformations using the map method.
 *
 * @param <T> the type of the value held by this Pipeline instance
 */
public class Pipeline<T> {
    private final T value;

    private Pipeline(T value) {
        this.value = value;
    }

    public static <T> Pipeline<T> of(T value) {
        return new Pipeline<>(value);
    }

    /**
     * Transforms the current value held by the Pipeline using the provided
     * transformer function and returns a new Pipeline instance containing the
     * transformed value.
     *
     * @param transformer the function to apply to the current value to obtain a new value
     * @param <R> the type of the value returned by the transformer function
     * @return a new Pipeline instance containing the transformed value
     */
    public <R> Pipeline<R> map(Function<? super T, ? extends R> transformer) {
        Objects.requireNonNull(transformer, "Transformer cannot be null");
        R transformedValue = transformer.apply(value);
        return of(transformedValue);
    }

    public T get() {
        return value;
    }

    public Optional<T> getAsOptional() {
        return Optional.ofNullable(value);
    }
}
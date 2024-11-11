package main.java.exercises.ex15;

/**
 * Interface for defining mappers that convert an instance of one type to another.
 * This interface is typically utilized in the context of mapping objects between different
 * classes, as facilitated by utility methods in classes like {@code ObjectMapperUtil}.
 *
 * @param <S> the source type
 * @param <T> the target type
 */
public interface Mapper<S, T> {
    T map(S source);
}
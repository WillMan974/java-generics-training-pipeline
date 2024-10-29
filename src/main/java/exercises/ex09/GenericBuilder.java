package main.java.exercises.ex09;

/**
 * Abstract builder class for constructing objects of type T with a fluent interface.
 *
 * @param <T> the type of object that this builder creates
 * @param <B> the type of the builder, used to provide a fluent interface
 */
public abstract class GenericBuilder<T, B extends GenericBuilder<T, B>> {

    protected abstract B self();

    public abstract T build();
}

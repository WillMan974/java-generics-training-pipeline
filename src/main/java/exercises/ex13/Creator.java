package main.java.exercises.ex13;

/**
 * A functional interface for creating objects of a specific type.
 *
 * @param <T> the type of object that this Creator will create
 */
public interface Creator<T> {
    T create();
}

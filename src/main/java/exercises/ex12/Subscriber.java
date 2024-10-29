package main.java.exercises.ex12;

/**
 * An interface representing a subscriber that will be notified with data of type T.
 *
 * @param <T> the type of the data that this subscriber can receive during the update
 */
public interface Subscriber<T> {
    void update(T data);
}

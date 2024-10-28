package main.java.exercises.ex01;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * A generic container class that holds a single element of type T.
 *
 * @param <T> the type of the element contained in the Box
 */
public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Boolean isEmpty() {
        return isNull(item);
    }

    @Override
    public String toString() {
        return String.format("""
                        Box<%s> {
                            item = %s
                        }""",
                nonNull(item) ? item.getClass().getSimpleName() : "NULL",
                nonNull(item) ? item.toString() : "NULL");
    }
}

package main.java.exercises.ex01;

import java.util.Objects;

/**
 * A generic container class that holds a single element of type T.
 *
 * @param <T> the type of the element contained in the Box
 */
public class Box<T> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Boolean isEmpty() {
        return Objects.isNull(element);
    }
}

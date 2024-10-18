package main.java.exercises.ex01;

import java.util.Objects;

public class Box<T> {
    private T element;

    public Box(T object) {
        this.element = object;
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

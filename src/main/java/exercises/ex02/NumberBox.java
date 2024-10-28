package main.java.exercises.ex02;

import main.java.exercises.ex01.Box;

import static java.util.Objects.nonNull;

/**
 * A specialized Box that holds a single element which is a subclass of the Number class.
 * Provides additional functionalities to operate on the number contained in it.
 *
 * @param <T> the type of the number contained in the NumberBox, which must extend from Number
 */
public class NumberBox<T extends Number> extends Box<T> {

    public NumberBox(T number) {
        super(number);
    }

    public double toDouble() {
        return getItem().doubleValue();
    }

    public Number sum(T other) {
        return toDouble() + other.doubleValue();
    }

    @Override
    public String toString() {
        return String.format("""
                        NumberBox<%s> {
                            item = %s
                        }""",
                nonNull(getItem()) ? getItem().getClass().getSimpleName() : "NULL",
                nonNull(getItem()) ? getItem().toString() : "NULL");
    }
}

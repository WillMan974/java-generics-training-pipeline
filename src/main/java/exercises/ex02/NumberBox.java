package main.java.exercises.ex02;

import java.util.Objects;

/**
 * The NumberBox class is a generic container designed to hold objects of any type
 * that extends the Number class. This includes classes such as Integer, Double,
 * Float, Long, and others that are subclasses of Number.
 *
 * @param <T> The type of number that the NumberBox will contain. It must extend the
 *            Number class.
 */
public class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public Boolean isEmpty() {
        return Objects.isNull(number);
    }

    public double toDouble() {
        return number.doubleValue();
    }

    public Number sum(T other) {
        return convertToSameType(
                this.toDouble() + other.doubleValue()
        );
    }

    /**
     * Converts the provided Number to the type of the current instance's number.
     *
     * @param other The Number to be converted to the same type as the instance's number.
     * @return The provided Number converted to the same type as the instance's number.
     */
    @SuppressWarnings("unchecked")
    public T convertToSameType(Number other) {
        return (T) convertNumber(other);
    }

    private Number convertNumber(Number other) {
        if (number instanceof Integer) {
            return other.intValue();
        } else if (number instanceof Double) {
            return other.doubleValue();
        } else if (number instanceof Float) {
            return other.floatValue();
        } else if (number instanceof Long) {
            return other.longValue();
        } else if (number instanceof Short) {
            return other.shortValue();
        } else if (number instanceof Byte) {
            return other.byteValue();
        } else {
            throw new IllegalArgumentException("Unsupported Number type");
        }
    }
}

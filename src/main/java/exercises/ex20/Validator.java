package main.java.exercises.ex20;

import java.util.function.Predicate;

/**
 * A class that provides a way to validate objects of type T using predicates.
 * It allows the composition of multiple predicates to perform complex validations.
 *
 * @param <T> the type of objects that this validator can validate
 */
public class Validator<T> {

    private final Predicate<T> validation;

    private Validator(Predicate<T> validation) {
        this.validation = validation;
    }

    public static <T> Validator<T> from(Predicate<T> validation) {
        return new Validator<>(validation);
    }

    public Validator<T> and(Predicate<T> otherValidation) {
        return new Validator<>(validation.and(otherValidation));
    }

    public boolean test(T value) {
        return validation.test(value);
    }

}
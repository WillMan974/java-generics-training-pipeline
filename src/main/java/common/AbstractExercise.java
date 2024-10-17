package main.java.common;

public abstract class AbstractExercise implements Exercise {
    protected final String language;

    protected AbstractExercise(String language) {
        this.language = language;
    }
}

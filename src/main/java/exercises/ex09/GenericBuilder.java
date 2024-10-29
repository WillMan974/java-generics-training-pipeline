package main.java.exercises.ex09;

public abstract class GenericBuilder<T, B extends GenericBuilder<T, B>> {

    protected abstract B self();

    public abstract T build();
}

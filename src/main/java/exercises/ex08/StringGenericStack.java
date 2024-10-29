package main.java.exercises.ex08;

import main.java.exercises.ex07.GenericStack;

/**
 * A specialized stack implementation that can only hold {@link String} objects.
 * This class extends {@link GenericStack} with a type parameter of {@code String}.
 * It provides two constructors for creating an instance of the stack either with or without a size limit.
 */
public class StringGenericStack extends GenericStack<String> {

    public StringGenericStack() {
        super();
    }

    public StringGenericStack(int sizeLimit) {
        super(sizeLimit);
    }
}

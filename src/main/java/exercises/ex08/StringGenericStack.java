package main.java.exercises.ex08;

import main.java.exercises.ex07.GenericStack;

public class StringGenericStack extends GenericStack<String> {

    public StringGenericStack() {
        super();
    }

    public StringGenericStack(int sizeLimit) {
        super(sizeLimit);
    }
}

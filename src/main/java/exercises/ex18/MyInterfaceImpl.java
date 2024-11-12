package main.java.exercises.ex18;

/**
 * MyInterfaceImpl is a concrete implementation of the MyInterface.
 * This class provides the behavior for the method defined in MyInterface.
 */
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Executing myMethod");
    }
}
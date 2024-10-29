package main.java.exercises.ex12;

import main.java.exercises.ex02.NumberBox;

/**
 * A subscriber implementation for NumberBox containing Integer.
 * <p>
 * This class implements the Subscriber interface to handle updates
 * with NumberBox containing Integer elements. When an update
 * occurs, the received NumberBox<Integer> data is printed to the console.
 */
public class IntegerNumberBoxSubscriber implements Subscriber<NumberBox<Integer>> {

    @Override
    public void update(NumberBox<Integer> data) {
        System.out.println("IntegerNumberBoxSubscriber received : " + data);
    }
}

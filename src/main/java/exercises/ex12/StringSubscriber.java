package main.java.exercises.ex12;

/**
 * A subscriber implementation that processes String data.
 * <p>
 * This class implements the Subscriber interface specialized with the String type.
 * When an update occurs, the received String data is printed to the console.
 */
public class StringSubscriber implements Subscriber<String> {

    @Override
    public void update(String data) {
        System.out.println("StringSubscriber received : " + data);
    }
}

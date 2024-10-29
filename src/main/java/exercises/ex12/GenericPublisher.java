package main.java.exercises.ex12;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic publisher class that manages and notifies subscribers.
 *
 * @param <T> the type of data that the publisher produces and sends to its subscribers
 */
public class GenericPublisher<T> {
    private final List<Subscriber<T>> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber<T> observer) {
        subscribers.add(observer);
    }

    public void removeSubscriber(Subscriber<T> observer) {
        subscribers.remove(observer);
    }

    public void notifyObservers(T data) {
        subscribers.forEach(observer -> observer.update(data));
    }

}

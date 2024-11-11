package main.java.exercises.ex13;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * GenericFactory is a class that allows for the creation of various types of objects using
 * registered Creator instances.
 * It maintains a registry of Creator objects that are responsible for creating instances of specified classes.
 */
public class GenericFactory {
    Map<Class<?>, Creator<?>> creators = new HashMap<>();

    /**
     * Creates an instance of the specified class using a registered creator.
     *
     * @param <T>   the type of object to create
     * @param clazz the class of the object to create
     * @return an instance of the specified class created by the registered creator
     * @throws IllegalArgumentException if no creator is registered for the specified class
     */
    public <T> T create(Class<T> clazz) {
        return Optional.ofNullable(creators.get(clazz))
                .map(creator -> clazz.cast(creator.create()))
                .orElseThrow(
                        () -> new IllegalArgumentException("No creator registered for " + clazz)
                );
    }

    public void register(Class<?> clazz, Creator<?> creator) {
        creators.put(clazz, creator);
    }
}

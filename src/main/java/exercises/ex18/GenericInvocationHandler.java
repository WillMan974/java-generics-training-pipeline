package main.java.exercises.ex18;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Optional;

/**
 * GenericInvocationHandler is a dynamic proxy handler that intercepts method calls
 * for a given target object and provides additional behavior.
 *
 * @param <T> the type of the target object
 */
public class GenericInvocationHandler<T> implements InvocationHandler {
    private final T target;

    public GenericInvocationHandler(T target) {
        this.target = Objects.requireNonNull(target, "Target object must not be null");
    }

    /**
     * Intercepts a method call on a proxy instance, logs the method name,
     * invokes the method on the target object, and returns the result or a default message if the result is null.
     *
     * @param proxy  the proxy instance that the method was invoked on
     * @param method the Method instance corresponding to the interface method invoked on the proxy instance
     * @param args   an array of objects containing the values of the arguments passed in the method invocation on the proxy instance
     * @return the result of invoking the method on the target object, or a default result message if the returned value is null
     * @throws Throwable if the method invocation on the target object throws an exception
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("Method %s is called%n", method.getName());
        Object result = method.invoke(target, args);
        return Optional.ofNullable(result)
                .orElse(String.format("Default result for method %s", method.getName()));
    }
}

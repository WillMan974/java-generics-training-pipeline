package main.java.exercises.ex18;

import main.java.common.AbstractExercise;

import java.lang.reflect.Proxy;
import java.util.Objects;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericProxyExercise extends AbstractExercise {

    public GenericProxyExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        System.out.println("Starting the run() method.");

        System.out.println("Creating proxy instance of MyInterface.");
        MyInterface proxyInstance = createProxy(new MyInterfaceImpl());

        System.out.println("Proxy instance created. Calling myMethod on the proxy instance.");
        proxyInstance.myMethod();

        System.out.println("Finished calling myMethod on the proxy instance.");
        System.out.println("Ending the run() method.");
    }

    /**
     * Creates a dynamic proxy instance for the given target object.
     * The proxy intercepts method calls on the target and can add additional behaviors.
     *
     * @param <T>    the type of the target object
     * @param target the target object for which the proxy should be created
     * @return the dynamic proxy instance that implements the same interfaces as the target object
     * @throws NullPointerException if the target object is null
     */
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T target) {
        Objects.requireNonNull(target, "Target object must not be null");
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new GenericInvocationHandler<>(target)
        );
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 18 : Proxy générique
                
                Objectif : Créer un proxy dynamique générique
                - Intercepter les appels de méthodes
                - Ajouter des comportements dynamiquement
                - Utiliser la réflexion de manière sûre
                """
                : """
                Exercise 18: Generic Proxy
                
                Objective: Create a generic dynamic proxy
                - Intercept method calls
                - Add behaviors dynamically
                - Use reflection safely
                """;
    }
}
package main.java.exercises.ex16;

import main.java.common.AbstractExercise;

import java.util.Optional;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class ObjectPoolExercise extends AbstractExercise {

    public ObjectPoolExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        ObjectPool<String> stringPool = new ObjectPool<>(() -> "New Object");

        System.out.println("ObjectPool created with a factory to produce 'New Object'");

        Optional<String> obj1 = stringPool.acquire();
        System.out.printf("Acquired: %s%n", obj1.orElse("None"));

        obj1.ifPresent(stringPool::release);
        System.out.println("Released acquired object back to the pool.");

        Optional<String> obj2 = stringPool.acquire();
        System.out.printf("Acquired: %s%n", obj2.orElse("None"));

        Optional<String> obj3 = stringPool.acquire();
        System.out.printf("Acquired: %s%n", obj3.orElse("None"));
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 16 : Pool d'objets générique
                
                Objectif : Implémenter un pool d'objets réutilisables
                - Gérer l'acquisition et le relâchement d'objets
                - Utiliser une factory pour la création paresseuse
                - Assurer la thread-safety
                """
                : """
                Exercise 16: Generic Object Pool
                
                Objective: Implement a pool of reusable objects
                - Manage object acquisition and release
                - Use a factory for lazy creation
                - Ensure thread-safety
                """;
    }
}
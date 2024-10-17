package main.java.exercises.ex16;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class ObjectPoolExercise extends AbstractExercise {

    public ObjectPoolExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        // ...
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
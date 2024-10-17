package main.java.exercises.ex06;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class ArrayUtilsExercise extends AbstractExercise {

    public ArrayUtilsExercise(String language) {
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
                Exercice 6 : Méthodes génériques statiques
                
                Objectif : Créer des méthodes utilitaires génériques
                - Implémenter swap pour échanger deux éléments
                - Ajouter une méthode de tri générique
                - Démontrer l'utilisation avec différents types
                """
                : """
                Exercise 6: Static Generic Methods
                
                Objective: Create generic utility methods
                - Implement swap to exchange two elements
                - Add a generic sort method
                - Demonstrate usage with different types
                """;
    }
}
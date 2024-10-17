package main.java.exercises.ex07;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericStackExercise extends AbstractExercise {

    public GenericStackExercise(String language) {
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
                Exercice 7 : Implémentation d'une Stack générique
                
                Objectif : Créer une implémentation complète d'une pile générique
                - Implémenter push, pop, peek
                - Gérer les exceptions appropriées
                - Ajouter des méthodes utilitaires (isEmpty, isFull, size)
                """
                : """
                Exercise 7: Implementation of a Generic Stack
                
                Objective: Create a complete implementation of a generic stack
                - Implement push, pop, peek
                - Handle appropriate exceptions
                - Add utility methods (isEmpty, isFull, size)
                """;
    }
}

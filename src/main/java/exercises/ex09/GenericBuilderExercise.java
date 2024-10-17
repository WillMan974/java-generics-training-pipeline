package main.java.exercises.ex09;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericBuilderExercise extends AbstractExercise {

    public GenericBuilderExercise(String language) {
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
                Exercice 9 : Génériques avec Builder Pattern
                
                Objectif : Implémenter un builder pattern générique
                - Créer un builder générique qui peut construire différents types d'objets
                """
                : """
                Exercise 9: Generics with Builder Pattern
                
                Objective: Implement a generic builder pattern
                - Create a generic builder that can construct different types of objects
                """;
    }
}
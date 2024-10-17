package main.java.exercises.ex08;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class StringGenericStackExercise extends AbstractExercise {

    public StringGenericStackExercise(String language) {
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
                Exercice 8 : Type Erasure et Bridge Methods
                
                Objectif : Comprendre le type erasure à travers un exemple pratique
                - Étendre une classe générique avec un type spécifique
                - Observer les bridge methods générés
                - Démontrer l'impact du type erasure
                """
                : """
                Exercise 8: Type Erasure and Bridge Methods
                
                Objective: Understand type erasure through a practical example
                - Extend a generic class with a specific type
                - Observe the generated bridge methods
                - Demonstrate the impact of type erasure
                """;
    }
}
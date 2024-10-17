package main.java.exercises.ex05;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class PairExercise extends AbstractExercise {

    public PairExercise(String language) {
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
                Exercice 5 : Types génériques multiples
                
                Objectif : Créer une classe Pair avec deux types génériques
                - Implémenter les getters et setters
                - Ajouter des méthodes de transformation
                - Démontrer l'utilisation avec différentes combinaisons de types
                """
                : """
                Exercise 5: Multiple Generic Type
                
                Objective: Create a Pair class with two generic types
                - Implement getters and setters
                - Add transformation methods
                - Demonstrate usage with different type combinations
                """;
    }
}
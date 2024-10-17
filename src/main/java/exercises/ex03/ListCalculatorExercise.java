package main.java.exercises.ex03;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class ListCalculatorExercise extends AbstractExercise {

    public ListCalculatorExercise(String language) {
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
                Exercice 3 : Wildcards avec bornes supérieures
                
                Objectif : Manipuler des listes de différents types numériques
                - Utiliser ? extends Number pour accepter tous les types numériques
                - Calculer la somme et la moyenne des éléments
                - Démontrer l'utilisation avec différents types de nombres
                """
                : """
                Exercise 3: Wildcards with Upper Bounds
                
                Objective: Manipulate lists of different numeric types
                - Use ? extends Number to accept all numeric types
                - Calculate the sum and average of the elements
                - Demonstrate usage with different types of numbers
                """;
    }
}
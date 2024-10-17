package main.java.exercises.ex02;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class NumberBoxExercise extends AbstractExercise {

    public NumberBoxExercise(String language) {
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
                Exercice 2 : NumberBox avec restrictions
                
                Objectif : Créer une classe NumberBox qui n'accepte que des nombres
                - Utiliser la restriction extends Number
                - Implémenter une méthode de somme
                - Démontrer l'utilisation avec différents types numériques
                """
                : """
                Exercise 2: NumberBox with constraints
                
                Objective: Create a NumberBox class that only accepts numbers
                - Use the extends Number constraint
                - Implement a sum method
                - Demonstrate usage with different numeric types
                """;
    }
}
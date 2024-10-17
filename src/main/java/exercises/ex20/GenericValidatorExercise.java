package main.java.exercises.ex20;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericValidatorExercise extends AbstractExercise {

    public GenericValidatorExercise(String language) {
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
                Exercice 20 : Pipeline de transformation générique
                
                Objectif : Créer un système de validation flexible et composable
                - Implémenter un validateur qui peut combiner différentes règles de validation
                """
                : """
                Exercise 20: Generic Transformation Pipeline
                
                Objective: Create a flexible and composable validation system
                - Implement a validator that can combine different validation rules
                """;
    }
}

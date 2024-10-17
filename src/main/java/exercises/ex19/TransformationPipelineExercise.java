package main.java.exercises.ex19;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class TransformationPipelineExercise extends AbstractExercise {

    public TransformationPipelineExercise(String language) {
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
                Exercice 19 : Pipeline de transformation générique
                
                Objectif : Créer un pipeline de transformations chaînées
                - Composer des transformations
                - Permettre l'enchaînement fluide
                - Assurer la type-safety
                """
                : """
                Exercise 19: Generic Transformation Pipeline
                
                Objective: Create a pipeline of chained transformations
                - Compose transformations
                - Allow fluent chaining
                - Ensure type-safety
                """;
    }
}
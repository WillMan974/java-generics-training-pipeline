package main.java.exercises.ex19;

import main.java.common.AbstractExercise;

import java.util.Objects;
import java.util.Optional;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class TransformationPipelineExercise extends AbstractExercise {

    public TransformationPipelineExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        System.out.println("Starting the transformation pipeline...");

        Pipeline<String> pipeline = Pipeline.of("Initial Value")
                .map(value -> {
                    System.out.printf("Transforming '%s' to 'Transformed Value'%n", value);
                    return "Transformed Value";
                })
                .map(value -> {
                    String result = value.toUpperCase();
                    System.out.printf("Converting '%s' to upper case resulting in '%s'%n", value, result);
                    return result;
                });

        Optional<String> finalValue = pipeline.getAsOptional();
        if (finalValue.isPresent()) {
            System.out.printf("Final Value: %s%n", finalValue.get());
        } else {
            System.out.println("No final value present.");
        }
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
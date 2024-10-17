package main.java.exercises.ex15;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericMapperExercise extends AbstractExercise {

    public GenericMapperExercise(String language) {
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
                Exercice 15 : Mapper générique
                
                Objectif : Créer un utilitaire de mapping entre différents types d'objets
                - Utiliser les génériques pour assurer la type-safety
                - Gérer les conversions complexes entre objets
                - Implémenter un système de mapping flexible
                """
                : """
                Exercise 15: Generic Mapper
                
                Objective: Create a mapping utility between different types of objects
                - Use generics to ensure type-safety
                - Handle complex conversions between objects
                - Implement a flexible mapping system
                """;
    }
}
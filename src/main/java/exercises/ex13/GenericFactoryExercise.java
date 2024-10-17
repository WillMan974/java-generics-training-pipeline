package main.java.exercises.ex13;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericFactoryExercise extends AbstractExercise {

    public GenericFactoryExercise(String language) {
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
                Exercice 13 : Factory générique
                
                Objectif : Créer une factory qui peut produire différents types d'objets
                - Utiliser les génériques pour assurer la type-safety
                - Implémenter un système d'enregistrement de créateurs
                - Démontrer la création flexible d'objets
                """
                : """
                Exercise 13: Generic Factory
                
                Objective: Create a factory that can produce different types of objects
                - Use generics to ensure type-safety
                - Implement a system for registering creators
                - Demonstrate flexible object creation
                """;
    }
}
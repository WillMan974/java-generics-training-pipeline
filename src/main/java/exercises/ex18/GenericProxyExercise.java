package main.java.exercises.ex18;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericProxyExercise extends AbstractExercise {

    public GenericProxyExercise(String language) {
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
                Exercice 18 : Proxy générique
                
                Objectif : Créer un proxy dynamique générique
                - Intercepter les appels de méthodes
                - Ajouter des comportements dynamiquement
                - Utiliser la réflexion de manière sûre
                """
                : """
                Exercise 18: Generic Proxy
                
                Objective: Create a generic dynamic proxy
                - Intercept method calls
                - Add behaviors dynamically
                - Use reflection safely
                """;
    }
}
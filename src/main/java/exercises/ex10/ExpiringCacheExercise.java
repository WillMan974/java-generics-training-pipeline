package main.java.exercises.ex10;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class ExpiringCacheExercise extends AbstractExercise {

    public ExpiringCacheExercise(String language) {
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
                Exercice 10 : Cache générique avec expiration
                
                Objectif : Créer un cache qui peut stocker n'importe quel type d'objet avec expiration
                - Implémenter un mécanisme de TTL (Time To Live)
                - Gérer le nettoyage automatique des entrées expirées
                - Utiliser les génériques pour stocker différents types de valeurs
                """
                : """
                Exercise 10: Generic Cache with Expiration
                
                Objective: Create a cache that can store any type of object with expiration
                - Implement a TTL (Time To Live) mechanism
                - Handle automatic cleanup of expired entries
                - Use generics to store different types of values
                """;
    }
}
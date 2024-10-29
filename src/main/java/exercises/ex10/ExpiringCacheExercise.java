package main.java.exercises.ex10;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class ExpiringCacheExercise extends AbstractExercise {

    public ExpiringCacheExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        System.out.println("Creating cache...");
        ExpiringCache<String, String> cache = new ExpiringCache<>();

        System.out.println("Adding entries to cache...");
        System.out.println("[key: key1, value: value1, ttl: 3s],");
        System.out.println("[key: key2, value: value2, ttl: 5s]");

        cache.put("key1", "value1", 3); // 3 seconds TTL
        cache.put("key2", "value2", 5); // 5 seconds TTL

        System.out.println("key1 immediately: " + cache.get("key1")); // should print "value1"
        System.out.println("key2 immediately: " + cache.get("key2")); // should print "value2"

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception: " + e.getMessage());
        }

        System.out.println("key1 after 4 seconds: " + cache.get("key1")); // should print "null" (expired)
        System.out.println("key2 after 4 seconds: " + cache.get("key2")); // should still print "value2"

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception: " + e.getMessage());
        }

        System.out.println("key2 after 6 seconds: " + cache.get("key2")); // should print "null" (expired)

        cache.shutdown();
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
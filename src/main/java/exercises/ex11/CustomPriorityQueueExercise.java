package main.java.exercises.ex11;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class CustomPriorityQueueExercise extends AbstractExercise {

    public CustomPriorityQueueExercise(String language) {
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
                Exercice 11 : File d'attente prioritaire générique
                
                Objectif : Créer une file d'attente qui peut gérer différents types avec priorités
                - Implémenter une structure de tas binaire
                - Utiliser Comparable pour gérer les priorités
                - Assurer un ordre de défilement correct
                """
                : """
                Exercise 11 : Generic Priority Queue
                
                Objective: Create a queue that can handle different types with priorities
                - Implement a binary heap structure
                - Use Comparable to manage priorities
                - Ensure correct dequeue order
                """;
    }
}
package main.java.exercises.ex01;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class BoxExercise extends AbstractExercise {

    public BoxExercise(String language) {
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
                Exercice 1 : Box Générique Simple
                
                Objectif : Créer une classe Box générique qui peut contenir n'importe quel type d'objet.
                - Implémenter les méthodes get/set
                - Ajouter une méthode isEmpty()
                - Démontrer l'utilisation avec différents types
                """
                : """
                Exercise 1: Simple Generic Box
                
                Objective: Create a generic Box class that can contain any type of object.
                - Implement the get/set methods
                - Add an isEmpty() method
                - Demonstrate usage with different types
                """;
    }
}
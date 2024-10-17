package main.java.exercises.ex17;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class StateManagerExercise extends AbstractExercise {

    public StateManagerExercise(String language) {
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
                Exercice 17 : État générique avec historique
                
                Objectif : Implémenter un gestionnaire d'état avec undo/redo
                - Gérer l'historique des états
                - Permettre l'annulation et la restauration
                - Assurer la consistance des états
                """
                : """
                Exercise 17: Generic State with History
                
                Objective: Implement a state manager with undo/redo functionality
                - Manage state history
                - Allow for undo and restore
                - Ensure state consistency
                """;
    }
}

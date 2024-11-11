package main.java.exercises.ex17;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class StateManagerExercise extends AbstractExercise {

    public StateManagerExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        StateManager<String> stateManager = new StateManager<>();

        // Initial state
        System.out.println("Setting initial state to 'State1'");
        stateManager.setState("State1");
        System.out.println("Current State: " + stateManager.getCurrentState().orElse("None"));

        // Setting new states
        System.out.println("Setting state to 'State2'");
        stateManager.setState("State2");
        System.out.println("Current State: " + stateManager.getCurrentState().orElse("None"));

        System.out.println("Setting state to 'State3'");
        stateManager.setState("State3");
        System.out.println("Current State: " + stateManager.getCurrentState().orElse("None"));

        // Undo operations
        System.out.println("Performing undo operation");
        stateManager.undo();
        System.out.println("Current State after 1st undo: " + stateManager.getCurrentState().orElse("None"));

        System.out.println("Performing another undo operation");
        stateManager.undo();
        System.out.println("Current State after 2nd undo: " + stateManager.getCurrentState().orElse("None"));

        // Redo operations
        System.out.println("Performing redo operation");
        stateManager.redo();
        System.out.println("Current State after 1st redo: " + stateManager.getCurrentState().orElse("None"));

        // Reverting by count
        System.out.println("Rolling back 1 more state");
        stateManager.revertStatesByCount(1);
        System.out.println("Current State after rollback: " + stateManager.getCurrentState().orElse("None"));

        // Clearing all states history
        System.out.println("Clearing all states");
        stateManager.clear();
        System.out.println("Current State after clearing: " + stateManager.getCurrentState().orElse("None"));

        // Display histories
        System.out.println("Undo history: " + stateManager.getUndoHistory());
        System.out.println("Redo history: " + stateManager.getRedoHistory());
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

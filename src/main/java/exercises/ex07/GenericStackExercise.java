package main.java.exercises.ex07;

import main.java.common.AbstractExercise;
import main.java.exercises.ex01.Box;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericStackExercise extends AbstractExercise {

    public GenericStackExercise(String language) {
        super(language);
    }

    @Override
    public void run() {

        // SIZED STACK
        GenericStack<String> sizeLimitedStack = new GenericStack<>(2);
        System.out.println("Stack is size limited: " + sizeLimitedStack.isSizeLimited());

        sizeLimitedStack.push("First added item");
        sizeLimitedStack.push("Second added item");

        System.out.println("Stack is full: " + sizeLimitedStack.isFull());

//        sizeLimitedStack.push("Third added item"); // Stack is full

        // DYNAMIC STACK
        GenericStack<Box<String>> stack = new GenericStack<>();
        System.out.println("Stack is size limited: " + stack.isSizeLimited());

        stack.push(new Box<>("First added item"));
        stack.push(new Box<>("Second added item"));
        stack.push(new Box<>("Third added item"));

        System.out.println("Stack is empty: " + stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop()); // Stack is empty
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 7 : Implémentation d'une Stack générique
                
                Objectif : Créer une implémentation complète d'une pile générique
                - Implémenter push, pop, peek
                - Gérer les exceptions appropriées
                - Ajouter des méthodes utilitaires (isEmpty, isFull, size)
                """
                : """
                Exercise 7: Implementation of a Generic Stack
                
                Objective: Create a complete implementation of a generic stack
                - Implement push, pop, peek
                - Handle appropriate exceptions
                - Add utility methods (isEmpty, isFull, size)
                """;
    }
}

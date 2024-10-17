package main.java.exercises.ex14;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class BinarySearchTreeExercise extends AbstractExercise {

    public BinarySearchTreeExercise(String language) {
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
                Exercice 14 : Arbre binaire de recherche générique
                
                Objectif : Implémenter un BST qui peut stocker n'importe quel type comparable
                - Utiliser les génériques avec la contrainte Comparable
                - Implémenter insertion et recherche
                - Démontrer les parcours d'arbre
                """
                : """
                Exercise 14: Generic Binary Search Tree
                
                Objective: Implement a BST that can store any comparable type
                - Use generics with the Comparable constraint
                - Implement insertion and search
                - Demonstrate tree traversals
                """;
    }
}
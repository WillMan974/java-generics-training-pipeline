package main.java.exercises.ex14;

import main.java.common.AbstractExercise;

import java.util.Optional;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class BinarySearchTreeExercise extends AbstractExercise {

    public BinarySearchTreeExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        System.out.println("Starting execution...");

        // Initialize the binary search tree for integers
        GenericBST<Integer> integerBST = new GenericBST<>();
        System.out.println("Binary search tree initialized.");

        // Insert elements into the tree
        integerBST.insert(10);
        System.out.println("Inserted: 10");
        integerBST.insert(5);
        System.out.println("Inserted: 5");
        integerBST.insert(15);
        System.out.println("Inserted: 15");
        integerBST.insert(3);
        System.out.println("Inserted: 3");
        integerBST.insert(7);
        System.out.println("Inserted: 7");
        integerBST.insert(12);
        System.out.println("Inserted: 12");
        integerBST.insert(18);
        System.out.println("Inserted: 18");

        // Display tree traversals
        System.out.println("\nIn-order Traversal:");
        integerBST.inOrderTraversal();

        System.out.println("\nPre-order Traversal:");
        integerBST.preOrderTraversal();

        System.out.println("\nPost-order Traversal:");
        integerBST.postOrderTraversal();

        // Search in the tree
        System.out.println("\nSearch for 7:");
        Optional<Integer> searchResult = integerBST.search(7);
        System.out.println("Search result: " + (searchResult.isPresent() ? searchResult.get() : "Not found"));

        System.out.println("\nSearch for 20:");
        Optional<Integer> searchResult2 = integerBST.search(20);
        System.out.println("Search result: " + (searchResult2.isPresent() ? searchResult2.get() : "Not found"));

        System.out.println("Execution finished.");
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
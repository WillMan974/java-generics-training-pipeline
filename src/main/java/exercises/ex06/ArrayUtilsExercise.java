package main.java.exercises.ex06;

import main.java.common.AbstractExercise;
import main.java.exercises.ex01.Box;
import main.java.exercises.ex02.NumberBox;

import java.util.Arrays;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class ArrayUtilsExercise extends AbstractExercise {

    public ArrayUtilsExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        // SWAP
        System.out.println("\n*** SWAP METHOD ***");
        NumberBox<Integer> integerNumberBox = new NumberBox<>(2);
        Box<String> stringBox = new Box<>("Hello");
        String aString = "Another String";

        Object[] array = {integerNumberBox, stringBox, aString};
        System.out.printf("Initial array : %s %n", Arrays.toString(array));

        System.out.println("Call swap method to swap objects in index 2 and index 0...");

        ArrayUtils.swap(array, 2, 0);
        System.out.printf("Array after swap : %s %n", Arrays.toString(array));


        // SORT
        System.out.println("\n*** SORT METHOD ***");
        ArrayUtils.swap(array, 2, 0); // Reinit items order

        System.out.printf("Array before sort: %s %n", Arrays.toString(array));
        try {
            ArrayUtils.sort(array, (o1, o2) -> {
                if (o1 instanceof Comparable && o2 instanceof Comparable) {
                    return ((Comparable) o1).compareTo(o2);
                }
                return o1.toString().compareTo(o2.toString());
            });
            System.out.printf("Array after sort: %s %n", Arrays.toString(array));
        } catch (ClassCastException e) {
            System.err.println("Sorting failed due to incompatible types: " + e.getMessage());
        }
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 6 : Méthodes génériques statiques
                
                Objectif : Créer des méthodes utilitaires génériques
                - Implémenter swap pour échanger deux éléments
                - Ajouter une méthode de tri générique
                - Démontrer l'utilisation avec différents types
                """
                : """
                Exercise 6: Static Generic Methods
                
                Objective: Create generic utility methods
                - Implement swap to exchange two elements
                - Add a generic sort method
                - Demonstrate usage with different types
                """;
    }
}
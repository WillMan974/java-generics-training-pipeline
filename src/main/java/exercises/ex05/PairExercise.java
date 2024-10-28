package main.java.exercises.ex05;

import main.java.common.AbstractExercise;
import main.java.exercises.ex01.Box;
import main.java.exercises.ex02.NumberBox;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class PairExercise extends AbstractExercise {

    public PairExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        // Pair<Box<String>, NumberBox<Integer>>
        Box<String> stringBox = new Box<>("Hello");
        NumberBox<Integer> integerNumberBox = new NumberBox<>(12);

        Pair<Box<String>, NumberBox<Integer>> boxNumberBoxPair = new Pair<>(stringBox, integerNumberBox);
        System.out.printf("Initial Pair : %s %n", boxNumberBoxPair);

        Pair<?, ?> transformedPair = boxNumberBoxPair.transform(pair -> pair.mapBoth(
                (a, b) -> {
                    a.setItem(a.getItem() + " world");
                    b.setItem(b.getItem() + 12);
                })
        );

        System.out.printf("Transformed Pair : %s %n", transformedPair);

        // Pair<String, String>
        Pair<String, String> stringStringPair = new Pair<>("Hello", "world");
        Pair<String, String> otherStringStringPair = new Pair<>("My name is", "John");
        System.out.printf("First Pair : %s %n", stringStringPair);
        System.out.printf("Second Pair : %s %n", otherStringStringPair);

        Pair<String, String> mergedPair = stringStringPair.transform(pair -> {
            pair.merge(otherStringStringPair, (pair1, pair2) -> {
                String newFirst = String.format("%s %s", pair1.getFirst(), pair1.getSecond());
                String newSecond = String.format("%s %s", pair2.getFirst(), pair2.getSecond());
                pair1.setFirst(newFirst);
                pair1.setSecond(newSecond);
            });
            return pair;
        });

        System.out.printf("Transformed Pair : %s %n", mergedPair);
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 5 : Types génériques multiples
                
                Objectif : Créer une classe Pair avec deux types génériques
                - Implémenter les getters et setters
                - Ajouter des méthodes de transformation
                - Démontrer l'utilisation avec différentes combinaisons de types
                """
                : """
                Exercise 5: Multiple Generic Type
                
                Objective: Create a Pair class with two generic types
                - Implement getters and setters
                - Add transformation methods
                - Demonstrate usage with different type combinations
                """;
    }
}
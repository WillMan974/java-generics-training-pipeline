package main.java.exercises.ex03;

import main.java.common.AbstractExercise;
import main.java.exercises.ex02.NumberBox;

import java.util.List;
import java.util.stream.Collectors;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class NumberConsumerExercise extends AbstractExercise {

    public NumberConsumerExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        NumberBox<Integer> integerNumberBox = new NumberBox<>(1);
        NumberBox<Float> floatNumberBox = new NumberBox<>(2f);
        NumberBox<Double> box3 = new NumberBox<>(3.0);
        NumberBox<Long> box4 = new NumberBox<>(4L);

        List<NumberBox<? extends Number>> numberBoxes =
                List.of(
                        integerNumberBox,
                        floatNumberBox,
                        box3,
                        box4
                );

        System.out.println("List of NumberBox: " +
                numberBoxes.stream()
                        .map(nb -> String.format("%s [%s]", nb.getItem(), nb.getItem().getClass().getSimpleName()))
                        .collect(
                                Collectors.joining(", ")
                        )
        );

        NumberConsumer consumer = new NumberConsumer(numberBoxes);
        System.out.println("NumberConsumer created with provided NumberBox list.");

        double sum = consumer.computeSum();
        System.out.println("Computed sum: " + sum);

        double average = consumer.computeAverage();
        System.out.println("Computed average: " + average);
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 3 : Wildcards avec bornes supérieures
                
                Objectif : Manipuler des listes de différents types numériques
                - Utiliser <? extends Number> pour accepter tous les types numériques
                - Calculer la somme et la moyenne des éléments
                - Démontrer l'utilisation avec différents types de nombres
                
                Contrainte : Le constructeur de ListCalculator doit prendre une liste de NumberBox.
                """
                : """
                Exercise 3: Wildcards with Upper Bounds
                
                Objective: Manipulate lists of different numeric types
                - Use <? extends Number> to accept all numeric types
                - Calculate the sum and average of the elements
                - Demonstrate usage with different types of numbers
                
                Constraint: The constructor of ListCalculator must take a list of NumberBox.
                """;
    }
}
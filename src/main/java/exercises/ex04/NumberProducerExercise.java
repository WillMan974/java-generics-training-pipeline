package main.java.exercises.ex04;

import main.java.common.AbstractExercise;
import main.java.exercises.ex01.Box;
import main.java.exercises.ex02.NumberBox;
import main.java.exercises.ex03.NumberConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class NumberProducerExercise extends AbstractExercise {

    public NumberProducerExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        // Demonstration of covariance using NumberConsumer
        List<NumberBox<? extends Number>> numberBoxes = List.of(
                new NumberBox<>(1),    // Integer
                new NumberBox<>(2f),   // Float
                new NumberBox<>(3.0),  // Double
                new NumberBox<>(4L)    // Long
        );

        // Initialize NumberConsumer with a covariant list
        NumberConsumer consumer = new NumberConsumer(numberBoxes);

        // Compute sum and average
        double sum = consumer.computeSum();
        double average = consumer.computeAverage();

        // Displaying results
        System.out.println("\nList of NumberBox with covariance:\n" +
                numberBoxes.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(",\n"))
        );
        System.out.println("Computed sum: " + sum);
        System.out.println("Computed average: " + average);

        // Demonstration of contravariance using NumberProducer
        List<Box<? super Integer>> integerBoxList = new ArrayList<>(
                List.of(
                        new NumberBox<>(1),
                        new Box<>(2)
                )
        );

        // Initialize NumberProducer with a contravariant list
        NumberProducer producer = new NumberProducer(integerBoxList);

        // Adding integers via NumberProducer
        producer.addBox(new Box<>(3));  // Integer
        producer.addBox(new Box<>(4));  // Integer

        // Displaying elements of the list
        System.out.println("\nList of Box with contravariance (used by NumberProducer):\n" +
                producer.getNumberBoxes().stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(",\n"))
        );

        // Handling different types of lists
        // List of NumberBox
        List<NumberBox<Double>> doubleNumberBoxes = new ArrayList<>(List.of(
                new NumberBox<>(5.5),
                new NumberBox<>(6.6)
        ));

        // List of Box
        List<Box<Number>> numberBoxList = List.of(
                new Box<>(7),
                new NumberBox<>(8f)
        );

        // Displaying the lists
        System.out.println("\nList of specific NumberBox (Double):\n" +
                doubleNumberBoxes.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(",\n"))
        );

        System.out.println("\nList of generic Box (Number):\n" +
                numberBoxList.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(",\n"))
        );
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 4 : Wildcards avec bornes inférieures
                
                Objectif : Comprendre l'utilisation de super dans les wildcards
                - Utiliser <? super Integer> pour permettre l'ajout d'entiers
                - Démontrer la covariance et la contravariance
                - Manipuler différents types de listes
                """
                : """
                Exercise 4: Wildcards with Lower Bounds
                Objective: Understand the use of super in wildcards
                - Use <? super Integer> to allow adding integers
                - Demonstrate covariance and contravariance
                - Manipulate different types of lists
                """;
    }
}
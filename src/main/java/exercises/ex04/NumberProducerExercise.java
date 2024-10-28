package main.java.exercises.ex04;

import main.java.common.AbstractExercise;
import main.java.exercises.ex01.Box;
import main.java.exercises.ex02.NumberBox;

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
        // Démonstration de la covariance
        List<NumberBox<? extends Number>> numberBoxes = List.of(
                new NumberBox<>(1),    // Integer
                new NumberBox<>(2f),   // Float
                new NumberBox<>(3.0),  // Double
                new NumberBox<>(4L)    // Long
        );

        System.out.println("Liste de NumberBox avec covariance:\n" +
                numberBoxes.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(",\n"))
        );


        // Démonstration de la contravariance
        List<Box<? super Integer>> integerBoxList = new ArrayList<>(
                List.of(
                        new NumberBox<>(1),
                        new Box<>(2)
                )
        );


        integerBoxList.add(new Box<>(3)); // Integer
        integerBoxList.add(new Box<>(4L)); // Long

        // Affichage des éléments de la liste
        System.out.println("Liste de Box avec contravariance:\n" +
                integerBoxList.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(",\n"))
        );

        // Manipulation de différents types de listes
        // Liste de NumberBox
        List<NumberBox<Double>> doubleNumberBoxes = new ArrayList<>(List.of(
                new NumberBox<>(5.5),
                new NumberBox<>(6.6)
        ));

        // Liste de Box
        List<Box<Number>> numberBoxList = List.of(
                new Box<>(7),
                new NumberBox<>(8f)
        );

        // Affichage des listes
        System.out.println("Liste de NumberBox spécifiques (Double):\n" +
                doubleNumberBoxes.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(",\n"))
        );

        System.out.println("Liste de Box génériques (Number):\n" +
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
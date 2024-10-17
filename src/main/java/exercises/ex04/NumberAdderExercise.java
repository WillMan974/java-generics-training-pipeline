package main.java.exercises.ex04;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class NumberAdderExercise extends AbstractExercise {

    public NumberAdderExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        // Covariance (? extends T): Permet de lire des éléments en tant que T, mais pas d'ajouter.
        // Utile pour des types qui sont des sous-classes de T.

        // Contravariance (? super T): Permet d'ajouter des éléments de type T ou sous-type de T,
        // mais la lecture se fait en tant que type de super-classe.
        // Utile pour des types qui sont des super-classes de T.
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 4 : Wildcards avec bornes inférieures
                
                Objectif : Comprendre l'utilisation de super dans les wildcards
                - Utiliser ? super Integer pour permettre l'ajout d'entiers
                - Démontrer la covariance et la contravariance
                - Manipuler différents types de listes
                """
                : """
                Exercise 4: Wildcards with Lower Bounds
                Objective: Understand the use of super in wildcards
                - Use ? super Integer to allow adding integers
                - Demonstrate covariance and contravariance
                - Manipulate different types of lists
                """;
    }
}


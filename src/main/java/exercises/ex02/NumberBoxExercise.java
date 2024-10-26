package main.java.exercises.ex02;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class NumberBoxExercise extends AbstractExercise {

    public NumberBoxExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        Number boxNumber; // Created with Number type for test the number box element type at each step

        /* INTEGER */
        System.out.println("\n*** INTEGER NUMBER BOX ***");

        int intNumber = 12;
        NumberBox<Integer> integerNumberBox = new NumberBox<>(intNumber);

        boxNumber = integerNumberBox.getNumber();

        System.out.println("Box element : ".concat(boxNumber.toString()));
        System.out.println("Box element type : ".concat(boxNumber.getClass().getName()));
        System.out.println("Box is empty : ".concat(
                Boolean.toString(integerNumberBox.isEmpty()))
        );

        Number sum = integerNumberBox.sum(21);

        System.out.println("Sum : ".concat(sum.toString()));
        System.out.println("Sum type : ".concat(sum.getClass().getName()));

        integerNumberBox.setNumber(null);

        System.out.println("Box is empty : ".concat(
                Boolean.toString(integerNumberBox.isEmpty()))
        );


        /* DOUBLE */
        System.out.println("\n*** DOUBLE NUMBER BOX ***");

        double doubleNumber = 12.5;
        NumberBox<Double> doubleNumberBox = new NumberBox<>(doubleNumber);

        boxNumber = doubleNumberBox.getNumber();

        System.out.println("Box element: " + boxNumber);
        System.out.println("Box element type: " + boxNumber.getClass().getName());
        System.out.println("Box is empty: " + doubleNumberBox.isEmpty());

        Number sumDouble = doubleNumberBox.sum(10.5);

        System.out.println("Sum: " + sumDouble);
        System.out.println("Sum type: " + sumDouble.getClass().getName());

        /* FLOAT */
        System.out.println("\n*** FLOAT NUMBER BOX ***");

        float floatNumber = 12.5f;
        NumberBox<Float> floatNumberBox = new NumberBox<>(floatNumber);

        boxNumber = floatNumberBox.getNumber();

        System.out.println("Box element: " + boxNumber);
        System.out.println("Box element type: " + boxNumber.getClass().getName());
        System.out.println("Box is empty: " + floatNumberBox.isEmpty());

        Number sumFloat = floatNumberBox.sum(10.5f);

        System.out.println("Sum: " + sumFloat);
        System.out.println("Sum type: " + sumFloat.getClass().getName());

        /* LONG */
        System.out.println("\n*** LONG NUMBER BOX ***");

        long longNumber = 12L;
        NumberBox<Long> longNumberBox = new NumberBox<>(longNumber);

        Long boxNumberLong = longNumberBox.getNumber();

        System.out.println("Box element: " + boxNumberLong);
        System.out.println("Box element type: " + boxNumberLong.getClass().getName());
        System.out.println("Box is empty: " + longNumberBox.isEmpty());

        Number sumLong = longNumberBox.sum(10L);

        System.out.println("Sum: " + sumLong);
        System.out.println("Sum type: " + sumLong.getClass().getName());


        /* NULL TEST */
        longNumberBox.setNumber(null);
        System.out.println("Box is empty: " + longNumberBox.isEmpty());

    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 2 : NumberBox avec restrictions
                
                Objectif : Créer une classe NumberBox qui n'accepte que des nombres
                - Utiliser la restriction extends Number
                - Implémenter une méthode retournant l'instance nombre en type primitif double
                - Implémenter une méthode retournant l'instance nombre. Cette méthode sera appelée par la méthode somme.
                - Implémenter une méthode de somme
                - Démontrer l'utilisation avec différents types numériques
                """
                : """
                Exercise 2: NumberBox with constraints
                
                Objective: Create a NumberBox class that only accepts numbers
                - Use the extends Number constraint
                - Implement a method returning the number instance in primitive double type
                - Implement a method returning the number instance. This method will be called by the sum method.
                - Implement a sum method
                - Demonstrate usage with different numeric types
                """;
    }
}
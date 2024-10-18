package main.java.exercises.ex01;

import main.java.common.AbstractExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class BoxExercise extends AbstractExercise {

    public BoxExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        Object boxElement; // Created with Object type for test the box element type at each step

        System.out.println("\n*** STRING BOX ***");

        String helloWordString = "Hello World !!!";
        Box<String> stringBox = new Box<>(helloWordString);

        boxElement = stringBox.getElement(); // String strElement = stringBox.getElement(); --> Possible here.

        System.out.println("Box element : ".concat(boxElement.toString()));
        System.out.println("Box element type : ".concat(boxElement.getClass().getName()));
        System.out.println("Box is empty : ".concat(
                Boolean.toString(stringBox.isEmpty()))
        );


        System.out.println("\n*** INTEGER BOX ***");

        Box<Integer> integerBox = new Box<>(12);
        boxElement = integerBox.getElement(); // Integer strElement = intBox.getElement(); --> Possible here.

        System.out.println("Box element : ".concat(boxElement.toString()));
        System.out.println("Box element type : ".concat(boxElement.getClass().getName()));
        System.out.println("Box is empty : ".concat(
                Boolean.toString(integerBox.isEmpty()))
        );


        System.out.println("\n*** LIST BOX ***");

        ArrayList<Object> itemList = new ArrayList<>();
        itemList.add("John Doe");
        itemList.add(38);

        Box<List<?>> listBox = new Box<>(itemList);
        boxElement = listBox.getElement(); // List<?> listBoxElement = listBox.getElement(); --> Possible here.

        System.out.println("Box element : ".concat(boxElement.toString()));
        System.out.println("Box element type : ".concat(boxElement.getClass().getName()));
        System.out.println("Box is empty : ".concat(
                Boolean.toString(listBox.isEmpty()))
        );


        System.out.println("\n*** EMPTY TEST ***");

        listBox.setElement(null);
        boxElement = listBox.getElement();

        System.out.println("Box element : ".concat(
                Objects.isNull(boxElement) ? "[NULL]" : boxElement.toString()
        ));
        System.out.println("Box is empty : ".concat(
                Boolean.toString(listBox.isEmpty())
        ));
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 1 : Box Générique Simple
                
                Objectif : Créer une classe Box générique qui peut contenir n'importe quel type d'objet.
                - Implémenter les méthodes get/set
                - Ajouter une méthode isEmpty()
                - Démontrer l'utilisation avec différents types
                """
                : """
                Exercise 1: Simple Generic Box
                
                Objective: Create a generic Box class that can contain any type of object.
                - Implement the get/set methods
                - Add an isEmpty() method
                - Demonstrate usage with different types
                """;
    }
}
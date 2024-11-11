package main.java.exercises.ex13;

import main.java.common.AbstractExercise;
import main.java.exercises.ex09.Car;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericFactoryExercise extends AbstractExercise {

    public GenericFactoryExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        System.out.println("Starting run method...");

        // Initialize the generic factory
        GenericFactory factory = new GenericFactory();
        System.out.printf("Factory initialized: %s%n", factory);

        // Create a specific creator for Car objects
        CarCreator carCreator = new CarCreator();
        System.out.printf("CarCreator created: %s%n", carCreator);

        // Register the CarCreator with the factory
        factory.register(Car.class, carCreator);
        System.out.printf("CarCreator registered for class: %s%n", Car.class);

        // Use the factory to create a Car object
        Car createdCar = factory.create(Car.class);
        System.out.printf("Car created: %s%n", createdCar);

        System.out.println("Run method completed");
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """  
                Exercice 13 : Factory générique
                
                Objectif : Créer une factory qui peut produire différents types d'objets
                - Utiliser les génériques pour assurer la type-safety
                - Implémenter un système d'enregistrement de créateurs
                - Démontrer la création flexible d'objets
                """
                : """
                Exercise 13: Generic Factory
                
                Objective: Create a factory that can produce different types of objects
                - Use generics to ensure type-safety
                - Implement a system for registering creators
                - Demonstrate flexible object creation
                """;
    }
}
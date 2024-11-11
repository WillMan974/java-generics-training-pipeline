package main.java.exercises.ex15;

import main.java.common.AbstractExercise;
import main.java.exercises.ex09.Car;

import java.util.Optional;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericMapperExercise extends AbstractExercise {

    public GenericMapperExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        System.out.println("Starting the mapping exercise...");

        // Creating an instance of ObjectMapperUtil
        ObjectMapperUtil objectMapperUtil = new ObjectMapperUtil();

        // Register a mapper from Car to CarDTO
        objectMapperUtil.register(Car.class, CarDTO.class, GenericMapperExercise::mapCarToDTO);

        // Creating a Car instance using the builder
        Car car = Car.builder()
                .brand("Tesla")
                .model("Model S")
                .year(2022)
                .mileage(20000)
                .color("Red")
                .licencePlate("ABC-123")
                .engine("Electric")
                .build();

        System.out.println("Original car object:");
        System.out.println(car);

        // Mapping the Car instance to CarDTO
        Optional<CarDTO> carDTOOptional = objectMapperUtil.map(car, CarDTO.class);

        // Checking if the mapping was successful
        if (carDTOOptional.isPresent()) {
            CarDTO carDTO = carDTOOptional.get();
            System.out.println("Mapped car DTO object:");
            System.out.println(carDTO);
        } else {
            System.out.println("Mapping failed!");
        }

        System.out.println("Mapping exercise completed.");
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                private static CarDTO mapCarToDTO(Car car) {
                    return new CarDTO(car.getBrand(), car.getModel(), car.getYear(), car.getMileage());
                }         Exercice 15 : Mapper générique
                
                Objectif : Créer un utilitaire de mapping entre différents types d'objets
                - Utiliser les génériques pour assurer la type-safety
                - Gérer les conversions complexes entre objets
                - Implémenter un système de mapping flexible
                """
                : """
                Exercise 15: Generic Mapper
                
                Objective: Create a mapping utility between different types of objects
                - Use generics to ensure type-safety
                - Handle complex conversions between objects
                - Implement a flexible mapping system
                """;
    }

    private static CarDTO mapCarToDTO(Car car) {
        return new CarDTO(car.getBrand(), car.getModel(), car.getYear(), car.getMileage());
    }
}
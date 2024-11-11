package main.java.exercises.ex13;

import main.java.exercises.ex09.Car;

/**
 * The CarCreator class implements the Creator interface specifically for creating instances of the Car class.
 * This class provides the create method which returns a new Car object using the builder pattern.
 */
public class CarCreator implements Creator<Car> {
    @Override
    public Car create() {
        return Car.builder().build();
    }
}

package main.java.exercises.ex09;

import java.util.Objects;

import static java.util.Objects.*;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private String color;
    private String licencePlate;
    private String engine;

    private Car() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return String.format("""
                Car {
                    brand = %s,
                    model = %s,
                    year = %d,
                    mileage = %d,
                    color = %s,
                    licencePlate = %s,
                    engine = %s
                }""",
                nonNull(brand) ? brand : "null",
                nonNull(model) ? model : "null",
                year, mileage,
                nonNull(color) ? color : "null",
                nonNull(licencePlate) ? licencePlate : "null",
                nonNull(engine) ? engine : "null"
        );
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends GenericBuilder<Car, Builder> {
        private final Car car = new Car();

       public Builder brand(String brand) {
           car.brand = brand;
           return self();
       }

       public Builder model(String model) {
           car.model = model;
           return self();
       }

       public Builder year(int year) {
           car.year = year;
           return self();
       }

       public Builder mileage(int mileage) {
           car.mileage = mileage;
           return self();
       }

       public Builder color(String color) {
           car.color = color;
           return self();
       }

       public Builder licencePlate(String licencePlate) {
           car.licencePlate = licencePlate;
           return self();
       }

       public Builder engine(String engine) {
           car.engine = engine;
           return self();
       }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Car build() {
            return car;
        }
    }
}

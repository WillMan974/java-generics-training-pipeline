package main.java.exercises.ex15;

class CarDTO {
    private String brand;
    private String model;
    private int year;
    private int mileage;

    public CarDTO(String brand, String model, int year, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return String.format("CarDTO { brand = %s, model = %s, year = %d, mileage = %d }",
                brand, model, year, mileage);
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
}
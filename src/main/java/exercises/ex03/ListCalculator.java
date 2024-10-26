package main.java.exercises.ex03;

import main.java.exercises.ex02.NumberBox;

import java.util.List;

public class ListCalculator {
    private List<NumberBox<? extends Number>> numberBoxes;

    public ListCalculator(List<NumberBox<? extends Number>> numberBoxes) {
        this.numberBoxes = numberBoxes;
    }

    public List<NumberBox<? extends Number>> getNumberBoxes() {
        return numberBoxes;
    }

    public void setNumberBoxes(List<NumberBox<? extends Number>> numberBoxes) {
        this.numberBoxes = numberBoxes;
    }

    // Create computeSum method
    public double computeSum() {
        return numberBoxes
                .stream()
                .map(NumberBox::toDouble)
                .reduce(0.0, Double::sum);
    }

    // Create computeAverage method
    public double computeAverage() {
        return computeSum() / numberBoxes.size();
    }
}
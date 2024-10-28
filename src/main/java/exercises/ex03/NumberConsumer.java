package main.java.exercises.ex03;

import main.java.exercises.ex02.NumberBox;

import java.util.List;

public record NumberConsumer(
        List<NumberBox<? extends Number>> numberBoxes
) {
    public double computeSum() {
        return numberBoxes
                .stream()
                .map(NumberBox::toDouble)
                .reduce(0.0, Double::sum);
    }

    public double computeAverage() {
        return computeSum() / numberBoxes.size();
    }
}
package main.java.exercises.ex03;

import main.java.exercises.ex02.NumberBox;

import java.util.List;

/**
 * A class that consumes a list of NumberBox elements, which can hold any type that extends from the Number class.
 * It provides functionality to compute the sum and average of the numeric values contained within the boxes.
 *
 * @param numberBoxes a list of NumberBox elements containing numbers of various types extending from Number
 */
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
package main.java.exercises.ex04;

import main.java.exercises.ex01.Box;

import java.util.List;

public record NumberProducer(List<? super Box<Integer>> numberBoxes) {

    public void addBox(Box<Integer> box) {
        numberBoxes.add(box);
    }

    public List<? super Box<Integer>> getNumberBoxes() {
        return numberBoxes;
    }
}

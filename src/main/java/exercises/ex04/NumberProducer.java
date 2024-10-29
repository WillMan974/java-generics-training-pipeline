package main.java.exercises.ex04;

import main.java.exercises.ex01.Box;

import java.util.List;

/**
 * NumberProducer is a record that maintains a list of number boxes, where each box can hold
 * elements that are either of type Box<Integer> or a super type of Box<Integer>.
 * This enables adding elements that are instances of Box<Integer> to the list.
 *
 * @param numberBoxes a list of boxes that support storing Integer values
 */
public record NumberProducer(List<? super Box<Integer>> numberBoxes) {

    public void addBox(Box<Integer> box) {
        numberBoxes.add(box);
    }

    public List<? super Box<Integer>> getNumberBoxes() {
        return numberBoxes;
    }
}

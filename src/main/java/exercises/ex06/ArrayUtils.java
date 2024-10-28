package main.java.exercises.ex06;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T> void sort(T[] array, Comparator<? super T> comparator) {
        Arrays.sort(array, comparator);
    }

}

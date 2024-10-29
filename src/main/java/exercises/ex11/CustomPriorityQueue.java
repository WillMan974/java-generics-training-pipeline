package main.java.exercises.ex11;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * CustomPriorityQueue is a priority queue implementation using a binary heap.
 * It supports operations for adding elements, removing the minimum element,
 * peeking at the minimum element, checking if the queue is empty, and getting
 * the size of the queue.
 *
 * @param <E> the type of elements held in this queue
 */
public class CustomPriorityQueue<E extends Comparable<E>> {

    private final ArrayList<E> heap;
    private final Comparator<E> comparator;

    public CustomPriorityQueue() {
        this(Comparator.naturalOrder());
    }

    public CustomPriorityQueue(Comparator<E> comparator) {
        this.heap = new ArrayList<>();
        this.comparator = comparator;
    }

    public ArrayList<E> getHeap() {
        return heap;
    }

    public void offer(E element) {
        heap.add(element);
        siftUp(heap.size() - 1);
    }

    /**
     * Retrieves and removes the head element of the queue, or returns null if the queue is empty.
     *
     * @return the head element of the queue, or null if the queue is empty
     */
    public E poll() {
        if (isEmpty()) return null;

        E root = heap.get(0);
        E lastElement = heap.remove(heap.size() - 1);

        if (!isEmpty()) {
            heap.set(0, lastElement);
            siftDown(0);
        }
        return root;
    }

    public E peek() {
        return isEmpty() ? null : heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    /**
     * Sifts the element at the given index up the heap to restore the heap property.
     *
     * @param index the index of the element to sift up
     */
    private void siftUp(int index) {
        E element = heap.get(index);
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            E parent = heap.get(parentIndex);
            if (comparator.compare(element, parent) >= 0) {
                break;
            }
            heap.set(index, parent);
            index = parentIndex;
        }
        heap.set(index, element);
    }

    /**
     * Sifts the element at the given index down the heap to restore the heap property.
     *
     * @param index the index of the element to sift down
     */
    private void siftDown(int index) {
        int size = heap.size();
        E element = heap.get(index);
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            if (leftChildIndex >= size) {
                break;
            }
            int minChildIndex = leftChildIndex;
            if (rightChildIndex < size &&
                    comparator.compare(heap.get(rightChildIndex), heap.get(leftChildIndex)) < 0) {
                minChildIndex = rightChildIndex;
            }
            if (comparator.compare(element, heap.get(minChildIndex)) <= 0) {
                break;
            }
            heap.set(index, heap.get(minChildIndex));
            index = minChildIndex;
        }
        heap.set(index, element);
    }
}
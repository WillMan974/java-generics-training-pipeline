package main.java.exercises.ex07;

import java.util.Objects;

/**
 * A generic stack implementation that supports typical stack operations such as push, pop, and peek.
 * This stack can optionally have a size limit, beyond which no more elements can be pushed.
 *
 * @param <T> the type of elements in the stack
 */
public class GenericStack<T> {

    private Node<T> top;
    private Integer size;
    private final Integer sizeLimit;

    public GenericStack() {
        this.top = null;
        this.size = 0;
        this.sizeLimit = null;
    }

    public GenericStack(int sizeLimit) {
        this.top = null;
        this.size = 0;
        this.sizeLimit = sizeLimit;
    }

    public void push(T item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        Node<T> tNode = new Node<>(item);
        tNode.next = top;
        top = tNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return Objects.equals(size, 0);
    }

    public boolean isFull() {
        return Objects.equals(size, sizeLimit);
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public Boolean isSizeLimited() {
        return Objects.nonNull(sizeLimit);
    }

    protected static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}

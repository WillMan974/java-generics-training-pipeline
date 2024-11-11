package main.java.exercises.ex14;

import java.util.Optional;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * A generic Binary Search Tree (BST) implementation that can store any type
 * that extends the Comparable interface.
 *
 * @param <T> the type of elements maintained by the tree, must be a subtype of Comparable
 */
public class GenericBST<T extends Comparable<T>> {

    private Node root;

    /**
     * Inserts a value into the binary search tree. If the tree is empty,
     * the value becomes the root. Otherwise, it is inserted recursively
     * in the appropriate position maintaining the BST properties.
     *
     * @param value the value to be inserted into the binary search tree
     */
    public void insert(T value) {
        if (isNull(root)) {
            root = new Node(value);
        } else {
            insertRecursively(root, value);
        }
    }

    /**
     * Recursively inserts a new value into the binary search tree starting from the current node.
     * It maintains the properties of a binary search tree, ensuring that values less than
     * the current node's value are placed in the left subtree and values greater than the
     * current node's value are placed in the right subtree.
     *
     * @param currentNode the current node from which the insertion process will start
     * @param newValue    the new value to be inserted into the binary search tree
     */
    private void insertRecursively(Node currentNode, T newValue) {
        if (newValue.compareTo(currentNode.value) < 0) {
            if (isNull(currentNode.leftChild)) {
                currentNode.leftChild = new Node(newValue);
            } else {
                insertRecursively(currentNode.leftChild, newValue);
            }
        } else if (newValue.compareTo(currentNode.value) > 0) {
            if (isNull(currentNode.rightChild)) {
                currentNode.rightChild = new Node(newValue);
            } else {
                insertRecursively(currentNode.rightChild, newValue);
            }
        }
    }

    public Optional<T> search(T searchValue) {
        return searchRecursively(root, searchValue);
    }

    /**
     * Searches for a specific value in the binary search tree starting from the given node.
     * This method is called recursively to traverse the tree.
     *
     * @param currentNode the current node from which the search starts
     * @param searchValue the value to search for
     * @return an Optional containing the found value, or empty if the value is not found
     */
    private Optional<T> searchRecursively(Node currentNode, T searchValue) {
        if (isNull(currentNode)) {
            return Optional.empty();
        }
        if (searchValue.equals(currentNode.value)) {
            return Optional.of(currentNode.value);
        }
        return searchValue.compareTo(currentNode.value) < 0
                ? searchRecursively(currentNode.leftChild, searchValue)
                : searchRecursively(currentNode.rightChild, searchValue);
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursively(root);
    }

    /**
     * Performs an in-order traversal of the binary search tree starting from the given node.
     * In an in-order traversal, the nodes are recursively visited in ascending order:
     * the left subtree, the current node, and then the right subtree.
     *
     * @param currentNode the current node from which the in-order traversal starts
     */
    private void inOrderTraversalRecursively(Node currentNode) {
        if (nonNull(currentNode)) {
            inOrderTraversalRecursively(currentNode.leftChild);
            System.out.printf("Node: %s%n", currentNode.value);
            inOrderTraversalRecursively(currentNode.rightChild);
        }
    }

    public void preOrderTraversal() {
        preOrderTraversalRecursively(root);
    }

    /**
     * Performs a pre-order traversal of the binary search tree starting from the given node.
     * In a pre-order traversal, the nodes are recursively visited in the following order:
     * the current node, the left subtree, and then the right subtree.
     *
     * @param currentNode the current node from which the pre-order traversal starts
     */
    private void preOrderTraversalRecursively(Node currentNode) {
        if (nonNull(currentNode)) {
            System.out.printf("Node: %s%n", currentNode.value);
            preOrderTraversalRecursively(currentNode.leftChild);
            preOrderTraversalRecursively(currentNode.rightChild);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversalRecursively(root);
    }

    /**
     * Performs a post-order traversal of the binary search tree starting from the given node.
     * In a post-order traversal, the nodes are recursively visited in the following order:
     * the left subtree, the right subtree, and then the current node.
     *
     * @param currentNode the current node from which the post-order traversal starts
     */
    private void postOrderTraversalRecursively(Node currentNode) {
        if (nonNull(currentNode)) {
            postOrderTraversalRecursively(currentNode.leftChild);
            postOrderTraversalRecursively(currentNode.rightChild);
            System.out.printf("Node: %s%n", currentNode.value);
        }
    }

    protected class Node {
        T value;
        Node leftChild;
        Node rightChild;

        Node(T value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
}
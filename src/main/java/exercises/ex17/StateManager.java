package main.java.exercises.ex17;

import java.util.Optional;
import java.util.Stack;

import static java.util.Optional.empty;

/**
 * StateManager is a class that manages states with undo and redo functionality.
 * It maintains a history of states and allows reverting to previous states or
 * redoing undone states.
 *
 * @param <T> the type of state being managed
 */
public class StateManager<T> {
    private final Stack<T> stateHistory = new Stack<>();
    private final Stack<T> undoHistory = new Stack<>();
    private final Stack<T> redoHistory = new Stack<>();
    private T currentState;

    public Optional<T> getCurrentState() {
        return Optional.ofNullable(currentState);
    }

    public Stack<T> getUndoHistory() {
        return undoHistory;
    }

    public Stack<T> getRedoHistory() {
        return redoHistory;
    }

    /**
     * Updates the current state to the specified new state.
     * The previous state is saved to a history stack for potential undo operations.
     *
     * @param newState the new state to be set
     */
    public void setState(T newState) {
        getCurrentState().ifPresent(stateHistory::push);
        currentState = newState;
    }

    /**
     * Reverts the current state to the previous state in the state history.
     * The current state is pushed to the undo history before being updated.
     *
     * @return an Optional containing the reverted state, or an empty Optional if there is no state to revert to.
     */
    public Optional<T> undo() {
        if (stateHistory.isEmpty()) {
            return empty();
        }
        undoHistory.push(currentState);
        currentState = stateHistory.pop();
        return getCurrentState();
    }

    /**
     * Redoes the last undone state, restoring the current state to the most recently undone state.
     * This method pops the last state from the undo history stack, if available, and updates
     * the current state to that state.
     *
     * @return an Optional containing the redone state, or an empty Optional if there is no state to redo.
     */
    public Optional<T> redo() {
        if (undoHistory.isEmpty()) {
            return empty();
        }
        redoHistory.push(currentState);
        setState(undoHistory.pop());

        return getCurrentState();
    }

    public void clear() {
        stateHistory.clear();
        undoHistory.clear();
        redoHistory.clear();
        currentState = null;
    }

    /**
     * Reverts the state to a point in history by the given count. This method will call the `undo`
     * method multiple times, as specified by the count, to revert back to a previous state.
     *
     * @param count the number of states to revert.
     * @return an Optional containing the current state after the reversion.
     */
    public Optional<T> revertStatesByCount(int count) {
        for (int i = 0; i < count; i++) {
            undo();
        }
        return getCurrentState();
    }

    @Override
    public String toString() {
        return String.format("Current State: %s, History: %s", currentState, stateHistory);
    }
}
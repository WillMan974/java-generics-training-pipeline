package main.java.common;

public interface Exercise {
    /**
     * Executes the exercise defined by the implementing class.
     * Each class that implements the Exercise interface will provide its own
     * specific implementation of this method, which contains the logic and
     * instructions to run the particular exercise.
     */
    void run();

    /**
     * Retrieves a description of the exercise.
     *
     * @return a string containing the description of the exercise
     */
    String getDescription();
}
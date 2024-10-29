package main.java.exercises.ex11;

import main.java.common.AbstractExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class CustomPriorityQueueExercise extends AbstractExercise {


    public CustomPriorityQueueExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        CustomPriorityQueue<Integer> queue = new CustomPriorityQueue<>();

        // Adding elements to the queue
        System.out.println("Adding elements:");
        queue.offer(10);
        logHeapState(queue, "After adding 10");
        queue.offer(5);
        logHeapState(queue, "After adding 5");
        queue.offer(30);
        logHeapState(queue, "After adding 30");
        queue.offer(2);
        logHeapState(queue, "After adding 2");

        System.out.println("\nPeek: " + queue.peek());

        // Removing elements from the queue
        System.out.println("\nRemoving elements:");
        System.out.println("Poll: " + queue.poll());
        logHeapState(queue, "After polling an element");
        System.out.println("Poll: " + queue.poll());
        logHeapState(queue, "After polling an element");
        System.out.println("Poll: " + queue.poll());
        logHeapState(queue, "After polling an element");
        System.out.println("Poll: " + queue.poll());
        logHeapState(queue, "After polling an element");

        System.out.println("\nIs the queue empty? " + queue.isEmpty());
    }

    private static void logHeapState(CustomPriorityQueue<?> queue, String message) {
        System.out.println(message + " => " + queue.getHeap());
    }


    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """  
                Exercice 11 : File d'attente prioritaire générique
                
                Objectif : Créer une file d'attente qui peut gérer différents types avec priorités
                - Implémenter une structure de tas binaire
                - Utiliser Comparable pour gérer les priorités
                - Assurer un ordre de défilement correct
                """
                : """
                Exercise 11 : Generic Priority Queue
                
                Objective: Create a queue that can handle different types with priorities
                - Implement a binary heap structure
                - Use Comparable to manage priorities
                - Ensure correct dequeue order
                """;
    }
}
package main.java.exercises.ex12;

import main.java.common.AbstractExercise;
import main.java.exercises.ex02.NumberBox;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericObservableExercise extends AbstractExercise {

    public GenericObservableExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        GenericPublisher<String> stringPublisher = new GenericPublisher<>();
        Subscriber<String> stringSubscriber = new StringSubscriber();

        stringPublisher.addSubscriber(stringSubscriber);

        stringPublisher.notifyObservers(
                "This is an update !!!"
        );


        GenericPublisher<NumberBox<Integer>> integerNumberBoxPublisher = new GenericPublisher<>();
        Subscriber<NumberBox<Integer>> integerNumberBoxSubscriber = new IntegerNumberBoxSubscriber();
        integerNumberBoxPublisher.addSubscriber(integerNumberBoxSubscriber);

        integerNumberBoxPublisher.notifyObservers(
                new NumberBox<>(10)
        );
    }

    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """  
                Exercice 12 : Observable générique
                
                Objectif : Implémenter le pattern Observer avec des génériques
                - Créer un système d'observateur flexible
                - Permettre l'observation de différents types d'événements
                - Utiliser les lambda pour simplifier l'implémentation
                
                Voir: https://refactoring.guru/fr/design-patterns/observer/java/example
                """
                : """
                Exercise 12: Generic Observable
                
                Objective: Implement the Observer pattern with generics
                - Create a flexible observer system
                - Allow observation of different types of events
                - Use lambdas to simplify the implementation
                
                See: https://refactoring.guru/design-patterns/observer
                """;
    }
}
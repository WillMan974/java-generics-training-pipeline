package main.java.exercises.ex20;

import main.java.common.AbstractExercise;

import java.util.Objects;
import java.util.function.Predicate;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class GenericValidatorExercise extends AbstractExercise {

    public GenericValidatorExercise(String language) {
        super(language);
    }

    @Override
    public void run() {
        System.out.println("Démarrage du validateur générique...");

        Predicate<String> notNull = s -> {
            boolean result = Objects.nonNull(s);
            System.out.println("Validité de notNull: " + result);
            return result;
        };

        Predicate<String> notEmpty = s -> {
            boolean result = s != null && !s.isEmpty();
            System.out.println("Validité de notEmpty: " + result);
            return result;
        };

        Predicate<String> validLength = s -> {
            boolean result = s != null && s.length() <= 100;
            System.out.println("Validité de validLength: " + result);
            return result;
        };

        System.out.println("Combinaison des règles de validation...");
        Validator<String> stringValidator = Validator.from(notNull)
                .and(notEmpty)
                .and(validLength);

        String testStr = "test";
        System.out.printf("Valeur à valider: '%s'%n", testStr);
        boolean isValid = stringValidator.test(testStr);
        System.out.printf("Résultat de la validation pour '%s': %s%n", testStr, isValid);

        System.out.println("Fin du validateur générique...");
    }


    @Override
    public String getDescription() {
        return isFrenchLanguage(language)
                ? """
                Exercice 20 : Validateur générique
                
                Objectif : Créer un système de validation flexible et composable
                - Implémenter un validateur qui peut combiner différentes règles de validation
                """
                : """
                Exercise 20: Generic validator
                
                Objective: Create a flexible and composable validation system
                - Implement a validator that can combine different validation rules
                """;
    }
}

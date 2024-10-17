package main.java.common;


import main.java.exercises.ex01.BoxExercise;
import main.java.exercises.ex02.NumberBoxExercise;
import main.java.exercises.ex03.ListCalculatorExercise;
import main.java.exercises.ex04.NumberAdderExercise;
import main.java.exercises.ex05.PairExercise;
import main.java.exercises.ex06.ArrayUtilsExercise;
import main.java.exercises.ex07.GenericStackExercise;
import main.java.exercises.ex08.StringGenericStackExercise;
import main.java.exercises.ex09.GenericBuilderExercise;
import main.java.exercises.ex10.ExpiringCacheExercise;
import main.java.exercises.ex11.CustomPriorityQueueExercise;
import main.java.exercises.ex12.GenericObservableExercise;
import main.java.exercises.ex13.GenericFactoryExercise;
import main.java.exercises.ex14.BinarySearchTreeExercise;
import main.java.exercises.ex15.GenericMapperExercise;
import main.java.exercises.ex16.ObjectPoolExercise;
import main.java.exercises.ex17.StateManagerExercise;
import main.java.exercises.ex18.GenericProxyExercise;
import main.java.exercises.ex19.TransformationPipelineExercise;
import main.java.exercises.ex20.GenericValidatorExercise;

import static main.java.common.CommonUtils.isFrenchLanguage;

public class ExerciseRunner {
    private final static String EXERCISE_FR = "Exercice";
    private final static String EXERCISE_EN = "Exercise";
    private final static String EXERCISE_NOT_FOUND_FR = EXERCISE_FR + " non trouvé : ";
    private final static String EXERCISE_NOT_FOUND_EN = EXERCISE_EN + " not found : ";
    private final static String EXERCISE_EXECUTION_FR = "Exécution de l'exercice :";
    private final static String EXERCISE_EXECUTION_EN = "Exercise execution :";

    public void runExercise(int number, String language) {
        Exercise exercise = switch (number) {
            case 1 -> new BoxExercise(language);
            case 2 -> new NumberBoxExercise(language);
            case 3 -> new ListCalculatorExercise(language);
            case 4 -> new NumberAdderExercise(language);
            case 5 -> new PairExercise(language);
            case 6 -> new ArrayUtilsExercise(language);
            case 7 -> new GenericStackExercise(language);
            case 8 -> new StringGenericStackExercise(language);
            case 9 -> new GenericBuilderExercise(language);
            case 10 -> new ExpiringCacheExercise(language);
            case 11 -> new CustomPriorityQueueExercise(language);
            case 12 -> new GenericObservableExercise(language);
            case 13 -> new GenericFactoryExercise(language);
            case 14 -> new BinarySearchTreeExercise(language);
            case 15 -> new GenericMapperExercise(language);
            case 16 -> new ObjectPoolExercise(language);
            case 17 -> new StateManagerExercise(language);
            case 18 -> new GenericProxyExercise(language);
            case 19 -> new TransformationPipelineExercise(language);
            case 20 -> new GenericValidatorExercise(language);

            default -> throw new IllegalArgumentException(
                    (isFrenchLanguage(language)
                            ? EXERCISE_NOT_FOUND_FR
                            : EXERCISE_NOT_FOUND_EN
                    ) + number
            );
        };

        displayExerciseExecutionPrompt(number, language, exercise);

        exercise.run();
    }

    private static void displayExerciseExecutionPrompt(int number, String language, Exercise exercise) {
        System.out.println("\n=== " + (isFrenchLanguage(language) ? EXERCISE_FR : EXERCISE_EN).toUpperCase() + number + " ===");
        System.out.println(exercise.getDescription());
        System.out.println("\n" + (isFrenchLanguage(language) ? EXERCISE_EXECUTION_FR : EXERCISE_EXECUTION_EN) + "\n");
    }

}
package main.java;

import main.java.common.ExerciseRunner;

import java.util.Scanner;

import static main.java.common.CommonUtils.isFrenchLanguage;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExerciseRunner runner = new ExerciseRunner();
        String language = getLanguage(scanner);

        while (true) {
            displayPrompt(language);

            int choice = scanner.nextInt();
            if (choice == 0) break;
            runner.runExercise(choice, language);

            promptForContinuation(scanner, language);
        }
        scanner.close();
    }

    private static String getLanguage(Scanner scanner) {
        System.out.println("\nPlease choose a language (fr or en) : ");
        return scanner.nextLine();
    }

    private static void promptForContinuation(Scanner scanner, String language) {
        if ("fr".equalsIgnoreCase(language)) {
            System.out.println("\nAppuyez sur Entrée pour continuer...");
        } else {
            System.out.println("\nPress Enter to continue...");
        }
        scanner.nextLine();
        scanner.nextLine();
    }

    private static void displayPrompt(String language) {
        if (isFrenchLanguage(language)) {
            displayFrenchPrompt();
        } else {
            displayEnglishPrompt();
        }
    }

    private static void displayFrenchPrompt() {
        System.out.println("\n=== Exercices sur la Généricité en Java ===");
        System.out.println("1. Création d'une classe générique simple");
        System.out.println("2. Méthodes génériques avec restrictions");
        System.out.println("3. Wildcards avec bornes supérieures");
        System.out.println("4. Wildcards avec bornes inférieures");
        System.out.println("5. Types génériques multiples");
        System.out.println("6. Méthodes génériques statiques");
        System.out.println("7. Implémentation d'une Stack générique");
        System.out.println("8. Type Erasure et Bridge Methods");
        System.out.println("9. Génériques avec Builder Pattern");
        System.out.println("10. Cache générique avec expiration");
        System.out.println("11. File d'attente prioritaire générique");
        System.out.println("12. Observable générique");
        System.out.println("13. Factory générique");
        System.out.println("14. Arbre binaire générique");
        System.out.println("15. Mapper générique");
        System.out.println("16. Pool d'objets générique");
        System.out.println("17. État générique avec historique");
        System.out.println("18. Proxy générique");
        System.out.println("19. Pipeline de transformation générique");
        System.out.println("20. Validateur générique avec composition");
        System.out.println("0. Quitter");

        System.out.print("\nChoisissez un exercice (0-20) : ");
    }

    private static void displayEnglishPrompt() {
        System.out.println("\n=== Java Generics Exercises ===");
        System.out.println("1. Creating a Simple Generic Class");
        System.out.println("2. Generic Methods with Restrictions");
        System.out.println("3. Upper Bounded Wildcards");
        System.out.println("4. Lower Bounded Wildcards");
        System.out.println("5. Multiple Generic Types");
        System.out.println("6. Static Generic Methods");
        System.out.println("7. Implementing a Generic Stack");
        System.out.println("8. Type Erasure and Bridge Methods");
        System.out.println("9. Generics with Builder Pattern");
        System.out.println("10. Generic Cache with Expiration");
        System.out.println("11. Generic Priority Queue");
        System.out.println("12. Generic Observable");
        System.out.println("13. Generic Factory");
        System.out.println("14. Generic Binary Tree");
        System.out.println("15. Generic Mapper");
        System.out.println("16. Generic Object Pool");
        System.out.println("17. Generic State with History");
        System.out.println("18. Generic Proxy");
        System.out.println("19. Generic Transformation Pipeline");
        System.out.println("20. Generic Validator with Composition");
        System.out.println("0. Quit");

        System.out.print("\nChoose an exercise (0-20): ");
    }
}
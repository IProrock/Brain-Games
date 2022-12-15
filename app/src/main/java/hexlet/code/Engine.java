package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUNDS = 3;


    public static void buildGame(String[][] gameData, String rules) {

        Scanner scanner = new Scanner(System.in);
        String userName = greeting();

        System.out.println(rules);

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {

            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (!answer.equals(gameData[i][1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gameData[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;

            } else {
                System.out.println("Correct!");
            }
        }
        scanner.close();

        System.out.println("Congratulations, " + userName + "!");

    }

    private static String greeting() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
}


package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void gameEngine(String[][] gameData) {

        final int numberOfRounds = 3;

        String[][] gameSet = gameData;
        Scanner scanner = new Scanner(System.in);
        String userName = greeting();

        System.out.println(gameSet[0][0]);

        for (var i = 0; i < numberOfRounds; i++) {

            System.out.println("Question: " + gameSet[i][1]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (!answer.equals(gameSet[i][2])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gameSet[i][2] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;

            } else {
                System.out.println("Correct!");
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }

    public static String greeting() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
}


package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    public static int getRandomNum(int max) {
        return  (int) (Math.random() * max);
    }

    public static int getRandomNum() {
        int stdMaxLimit = 500;
        return getRandomNum(stdMaxLimit);
    }


    public static void gameEngine(int gameNum, String userName) {

        int numberOfRounds = 3;
        int gameParameters = 3;

        String[][] gameSet = new String[numberOfRounds][gameParameters];
        switch (gameNum) {
            case 2:
                for (var round = 0; round < numberOfRounds; round++) {
                    gameSet[round] = Even.gameEven();
                }
                break;
            case 3:
                for (var round = 0; round < numberOfRounds; round++) {
                    gameSet[round] = Calc.gameCalc();
                }
                break;
            case 4:
                for (var round = 0; round < numberOfRounds; round++) {
                    gameSet[round] = Gcd.gameGcd();
                }
                break;
            case 5:
                for (var round = 0; round < numberOfRounds; round++) {
                    gameSet[round] = Progression.gameProgression();
                }
                break;
            case 6:
                for (var round = 0; round < numberOfRounds; round++) {
                    gameSet[round] = Prime.gamePrime();
                }
            default:
                System.out.println("Incorrect input.");
        }

        System.out.println(gameSet[0][0]);

        for (var i = 0; i < numberOfRounds; i++) {
            Scanner scanner = new Scanner(System.in);
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
}


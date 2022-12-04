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

        final int stdMaxValue = 500;

        return getRandomNum(stdMaxValue);
    }


    public static void gameEngine(int gameNum, String userName) {

        final int numberOfRounds = 3;
        final int gameParametersQty = 3;
        final int evenGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4;
        final int progressionGame = 5;
        final int primeGame = 6;

        String[][] gameSet = new String[numberOfRounds][gameParametersQty];
        switch (gameNum) {
            case evenGame:
                for (var round = 0; round < numberOfRounds; round++) {
                    gameSet[round] = Even.gameEven();
                }
                break;
            case calcGame:
                for (var round = 0; round < numberOfRounds; round++) {
                    gameSet[round] = Calc.gameCalc();
                }
                break;
            case gcdGame:
                for (var round = 0; round < numberOfRounds; round++) {
                    gameSet[round] = Gcd.gameGcd();
                }
                break;
            case progressionGame:
                for (var round = 0; round < numberOfRounds; round++) {
                    gameSet[round] = Progression.gameProgression();
                }
                break;
            case primeGame:
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


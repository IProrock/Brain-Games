package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {

    public static int getRandomNum(int max) {
        return  (int) (Math.random() * max);
    }

    public static int getRandomNum() {
        return getRandomNum(500);
    }


    public static void gameEngine(int gameNum, String userName) {

        String[][] gameSet = new String[3][4];
        switch (gameNum) {
            case 2:
                for (var round = 0; round < 3; round++) {
                    gameSet[round] = Even.gameEven();
                }
                break;
            case 3:
                for (var round = 0; round < 3; round++) {
                    gameSet[round] = Calc.gameCalc();
                }
                break;
            case 4:
                for (var round = 0; round < 3; round++) {
                    gameSet[round] = Gcd.gameGcd();
                }
                break;
            case 5:
                for (var round = 0; round < 3; round++) {
                    gameSet[round] = Progression.gameProgression();
                }
                break;
            case 6:
                for (var round = 0; round < 3; round++) {
                    gameSet[round] = Prime.gamePrime();
                }
        }

        System.out.println(gameSet[0][0]);

        for (var i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + gameSet[i][1]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(gameSet[i][2])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gameSet[i][2] + "'");
                break;
            } {
                System.out.println("Correct!");
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }

        }
    }
}


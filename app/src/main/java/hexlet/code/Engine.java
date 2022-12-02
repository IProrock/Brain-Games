package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

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
        }

        System.out.println(gameSet[0][0]);

        for (var i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(gameSet[i][1]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(gameSet[i][2])) {
                System.out.println("'" + answer + "'" + gameSet[i][3]);
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }

        }
    }
}


package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static void gameGcd() {

        final int returnParametersQty = 3;
        final int gameRoundCount = 3;
        final int numMinLimitation = 1;
        final int numMaxLimitation = 500;
        final String rules = "Find the greatest common divisor of given numbers.";

        String[][] gameSet = new String[gameRoundCount][returnParametersQty];

        for (var i = 0; i < gameRoundCount; i++) {
            int firstNum = Utils.getRandomNum(numMinLimitation, numMaxLimitation);
            int secondNum = Utils.getRandomNum(numMinLimitation, numMaxLimitation);

            int first = Math.max(firstNum, secondNum);
            int second = Math.min(firstNum, secondNum);
            int gcd = second;

            while (first % second != 0) {
                second = first % second;
                first = gcd;
                gcd = second;
            }

            gameSet[i][0] = rules;
            gameSet[i][1] = firstNum + " " + secondNum;
            gameSet[i][2] = Integer.toString(gcd);
        }

        Engine.gameEngine(gameSet);

    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void gamePrime() {

        final int returnParametersQty = 3;
        final int gameRoundCount = 3;
        final int numMinLimitation = 2;
        final int numMaxLimitation = 50;
        final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] gameSet = new String[gameRoundCount][returnParametersQty];

        for (var n = 0; n < gameRoundCount; n++) {

            String question = "";
            String answer = "yes";
            int currentValue = Utils.getRandomNum(numMinLimitation, numMaxLimitation);
            question = Integer.toString(currentValue);

            for (var i = 2; i <= (int) Math.sqrt(currentValue); i++) {
                if (currentValue % i == 0 && currentValue != 2) {
                    answer = "no";
                    break;
                }
            }

            gameSet[n][0] = rules;
            gameSet[n][1] = question;
            gameSet[n][2] = answer;
        }

        Engine.gameEngine(gameSet);

    }
}

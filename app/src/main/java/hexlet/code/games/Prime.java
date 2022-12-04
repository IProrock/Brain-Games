package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static String[] gamePrime() {
        static final int RETURNPARAMETERSQTY = 3;
        String[] gameSet = new String[RETURNPARAMETERSQTY];
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String question = "";
        String answer = "";
        int currentValue = Engine.getRandomNum();
        question = Integer.toString(currentValue);

        for (var i = 2; i <= (int) Math.sqrt(currentValue); i++) {
            if (currentValue % i == 0 && currentValue != 2) {
                answer = "no";
                break;
            } else {
                answer = "yes";
            }
        }
        gameSet[0] = rules;
        gameSet[1] = question;
        gameSet[2] = answer;

        return gameSet;

    }
}

package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static String[] gameGcd() {

        final int RETURN_PARAMETERS_QTY = 3;

        String[] gameSet = new String[RETURN_PARAMETERS_QTY];

        String rules = "Find the greatest common divisor of given numbers.";
        int firstNum = Engine.getRandomNum();
        int secondNum = Engine.getRandomNum();

        int first = Math.max(firstNum, secondNum);
        int second = Math.min(firstNum, secondNum);
        int gcd = second;

        while (first % second != 0) {
            second = first % second;
            first = gcd;
            gcd = second;
        }

        gameSet[0] = rules;
        gameSet[1] = firstNum + " " + secondNum;
        gameSet[2] = Integer.toString(gcd);

        return gameSet;
    }
}

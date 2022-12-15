package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int NUM_MIN_LIMITATION = 1;
    private static final int NUM_MAX_LIMITATION = 500;
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int NUMBER_OF_ROUNDS = Engine.NUMBER_OF_ROUNDS;


    public static void runGame() {

        String[][] gameSet = new String[NUMBER_OF_ROUNDS][1];

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            gameSet[i] = generateRoundData();
        }

        Engine.buildGame(gameSet, RULES);
    }


    private static String[] generateRoundData() {
        int firstNum = Utils.getRandomNum(NUM_MIN_LIMITATION, NUM_MAX_LIMITATION);
        int secondNum = Utils.getRandomNum(NUM_MIN_LIMITATION, NUM_MAX_LIMITATION);
        int gcd = findGcd(firstNum, secondNum);

        String question = firstNum + " " + secondNum;
        String answer = Integer.toString(gcd);

        return new String[] {question, answer};
    }


    private static int findGcd(int firstNum, int secondNum) {

        int first = Math.max(firstNum, secondNum);
        int second = Math.min(firstNum, secondNum);
        int gcd = second;

        while (first % second != 0) {
            second = first % second;
            first = gcd;
            gcd = second;
        }

        return gcd;
    }
}

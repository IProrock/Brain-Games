package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int NUM_MIN_LIMITATION = 2;
    private static final int NUM_MAX_LIMITATION = 50;
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int NUMBER_OF_ROUNDS = Engine.NUMBER_OF_ROUNDS;


    public static void runGame() {

        String[][] gameSet = new String[NUMBER_OF_ROUNDS][1];

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            gameSet[i] = generateRoundData();
        }

        Engine.run(gameSet, RULES);
    }


    public static String[] generateRoundData() {

        int currentValue = Utils.getRandomNum(NUM_MIN_LIMITATION, NUM_MAX_LIMITATION);
        String question = Integer.toString(currentValue);
        String answer = isPrime(currentValue) ? "yes" : "no";

        return new String[] {question, answer};
    }


    private static boolean isPrime(int currentValue) {

        for (var i = 2; i <= (int) Math.sqrt(currentValue); i++) {
            if (currentValue % i == 0 && currentValue != 2) {
                return false;
            }
        }
        return true;
    }
}

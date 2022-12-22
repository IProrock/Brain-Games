package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int NUM_MIN_LIMITATION = 0;
    private static final int NUM_MAX_LIMITATION = 500;
    private static final int NUMBER_OF_ROUNDS = Engine.NUMBER_OF_ROUNDS;


    public static void runGame() {

        String[][] gameSet = new String[NUMBER_OF_ROUNDS][1];

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            gameSet[i] = generateRoundData();
        }

        Engine.run(gameSet, RULES);
    }


    private static String[] generateRoundData() {
        int questionNum = Utils.getRandomNum(NUM_MIN_LIMITATION, NUM_MAX_LIMITATION);
        String answer = isEven(questionNum) ? "yes" : "no";

        return new String[] {Integer.toString(questionNum), answer};
    }


    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}



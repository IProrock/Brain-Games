package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void gameEven() {

        final int returnParametersCount = 3;
        final int gameRoundCount = 3;
        final int numMinLimitation = 0;
        final int numMaxLimitation = 500;
        final String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] gameSet = new String[gameRoundCount][returnParametersCount];
        String answer = "";

        for (var i = 0; i < gameRoundCount; i++) {

            int questionNum = Utils.getRandomNum(numMinLimitation, numMaxLimitation);
            answer = isEven(questionNum) ? "yes" : "no";

            gameSet[i][0] = rules;
            gameSet[i][1] = Integer.toString(questionNum);
            gameSet[i][2] = answer;
        }

        Engine.gameEngine(gameSet);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}



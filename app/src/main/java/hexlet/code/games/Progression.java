package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {

    private static final String RULES = "What number is missing in the progression?";
    private static final int NUMBER_OF_ROUNDS = Engine.NUMBER_OF_ROUNDS;


    public static void runGame() {

        String[][] gameSet = new String[NUMBER_OF_ROUNDS][1];

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            gameSet[i] = generateRoundData();
        }

        Engine.buildGame(gameSet, RULES);
    }


    private static String[] generateRoundData() {

        final int arrayLengthPlusLimitation = 7;
        final int numIncrinmentLimitation = 4;
        final int arrayMinLength = 5;
        final int arrayStartpointLimitation = 20;

        StringJoiner questionArray = new StringJoiner(" ");
        int questionPlusLength = Utils.getRandomNum(0, arrayLengthPlusLimitation);
        int progressionDiff = Utils.getRandomNum(1, numIncrinmentLimitation);
        int progressionCurrentValue = Utils.getRandomNum(0, arrayStartpointLimitation);
        int secretNumPosition = Utils.getRandomNum(1, arrayMinLength + questionPlusLength);
        String answer = "";

        for (int i = 1; i <= arrayMinLength + questionPlusLength; i++) {

            if (i == secretNumPosition) {
                questionArray.add("..");
                answer = Integer.toString(progressionCurrentValue);
            } else {
                questionArray.add(Integer.toString(progressionCurrentValue));
            }
            progressionCurrentValue = progressionCurrentValue + progressionDiff;
        }

        String question = questionArray.toString();

        return new String[] {question, answer};
    }
}


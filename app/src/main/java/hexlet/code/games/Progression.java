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
        final int incrinmentLimitation = 4;
        final int arrayMinLength = 5;
        final int arrayStartPointLimitation = 20;

        int arrayAdditionalLength = Utils.getRandomNum(0, arrayLengthPlusLimitation);

        int firstElement = Utils.getRandomNum(0, arrayStartPointLimitation);
        int arrayLength = arrayMinLength + arrayAdditionalLength;
        int increment = Utils.getRandomNum(1, incrinmentLimitation);
        int hiddenElementPosition = Utils.getRandomNum(1, arrayLength);

        return makeProgression(firstElement, arrayLength, increment, hiddenElementPosition);
    }


    private static String[] makeProgression(int firstElement, int arrayLength, int increment, int hiddenElement) {

        StringJoiner questionArray = new StringJoiner(" ");
        String answer = "";

        for (int i = 1; i <= arrayLength; i++) {

            if (i == hiddenElement) {
                questionArray.add("..");
                answer = Integer.toString(firstElement);
            } else {
                questionArray.add(Integer.toString(firstElement));
            }
            firstElement = firstElement + increment;
        }

        String question = questionArray.toString();

        return new String[] {question, answer};
    }
}


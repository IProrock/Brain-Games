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

        Engine.run(gameSet, RULES);
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
        int hiddenElementPosition = Utils.getRandomNum(0, arrayLength - 1);
        StringJoiner question = new StringJoiner(" ");

        String[] progression =  makeProgression(firstElement, arrayLength, increment);
        String answer = progression[hiddenElementPosition];
        progression[hiddenElementPosition] = "..";
        for (String element : progression) {
            question.add(element);
        }

        return new String[] {question.toString(), answer};

    }


    private static String[] makeProgression(int firstElement, int arrayLength, int increment) {

        String[] progression = new String[arrayLength];
        int currentElement = firstElement;

        for (int i = 0; i < arrayLength; i++) {
            progression[i] = Integer.toString(currentElement);
            currentElement = currentElement + increment;
        }

        return progression;
    }


}


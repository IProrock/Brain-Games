package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {
    public static String[] gameProgression() {

        final int RETURN_PARAMETERS_QTY = 3;
        final int LENGTH_PLUS_LIMITATION = 7;
        final int INCRINMENT_LIMITATION = 4;
        final int ARRAY_MIN_LENGTH = 5;
        final int ARRAY_STARTPOINT_LIMITATION = 20;


        String[] gameSet = new String[RETURN_PARAMETERS_QTY];

        String rules = "What number is missing in the progression?";
        String question = "";
        StringJoiner questionArray = new StringJoiner(" ");
        String answer = "";
        int questionPlusLength = Engine.getRandomNum(LENGTH_PLUS_LIMITATION);
        int progressionDiff = Engine.getRandomNum(INCRINMENT_LIMITATION) + 1;
        int progressionCurrentValue = Engine.getRandomNum(ARRAY_STARTPOINT_LIMITATION);
        int secretNumPosition = Engine.getRandomNum(ARRAY_MIN_LENGTH - 1 + questionPlusLength) + 1;

        for (int i = 1; i <= ARRAY_MIN_LENGTH + questionPlusLength; i++) {
            if (i == secretNumPosition) {
                questionArray.add("..");
                answer = Integer.toString(progressionCurrentValue);
            } else {
                questionArray.add(Integer.toString(progressionCurrentValue));
            }
            progressionCurrentValue = progressionCurrentValue + progressionDiff;
        }

        question = questionArray.toString();

        gameSet[0] = rules;
        gameSet[1] = question;
        gameSet[2] = answer;

        return gameSet;

    }
}


package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {
    public static String[] gameProgression() {

        final int RETURN_PARAMETERS_QTY = 3;

        String[] gameSet = new String[RETURN_PARAMETERS_QTY];

        String rules = "What number is missing in the progression?";
        String question = "";
        StringJoiner questionArray = new StringJoiner(" ");
        String answer = "";
        final int LENGTHPLUSLIMITATION = 7;
        int questionPlusLength = Engine.getRandomNum(LENGTHPLUSLIMITATION);
        final int INCRINMENTLIMITATION = 4;
        int progressionDiff = Engine.getRandomNum(INCRINMENTLIMITATION) + 1;
        final int ARRAYSTARTPOINTLIMITATION = 20;
        int progressionCurrentValue = Engine.getRandomNum(ARRAYSTARTPOINTLIMITATION);
        final int ARRAYMINLENGTH = 5;
        int secretNumPosition = Engine.getRandomNum(ARRAYMINLENGTH - 1 + questionPlusLength) + 1;

        for (int i = 1; i <= ARRAYMINLENGTH + questionPlusLength; i++) {
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


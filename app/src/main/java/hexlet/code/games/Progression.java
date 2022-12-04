package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {
    public static String[] gameProgression() {

        final int returnParametersQty = 3;
        final int lengthPlusLimitation = 7;
        final int incrinmentLimitation = 4;
        final int arrayMinLength = 5;
        final int arrayStartpointLimitation = 20;


        String[] gameSet = new String[returnParametersQty];

        String rules = "What number is missing in the progression?";
        String question = "";
        StringJoiner questionArray = new StringJoiner(" ");
        String answer = "";
        int questionPlusLength = Engine.getRandomNum(lengthPlusLimitation);
        int progressionDiff = Engine.getRandomNum(incrinmentLimitation) + 1;
        int progressionCurrentValue = Engine.getRandomNum(arrayStartpointLimitation);
        int secretNumPosition = Engine.getRandomNum(arrayMinLength - 1 + questionPlusLength) + 1;

        for (int i = 1; i <= arrayMinLength + questionPlusLength; i++) {
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


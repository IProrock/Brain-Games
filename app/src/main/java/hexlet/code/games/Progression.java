package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {
    public static String[] gameProgression() {

        int returnParametersQty = 3;

        String[] gameSet = new String[returnParametersQty];

        String rules = "What number is missing in the progression?";
        String question = "";
        StringJoiner questionArray = new StringJoiner(" ");
        String answer = "";
        int lengthPlusLimitation = 7;
        int questionPlusLength = Engine.getRandomNum(lengthPlusLimitation);
        int incrementLimitation = 4;
        int progressionDiff = Engine.getRandomNum(incrementLimitation) + 1;
        int arrayStartPointLimitation = 20;
        int progressionCurrentValue = Engine.getRandomNum(arrayStartPointLimitation);
        int arrayMinLength = 5;
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


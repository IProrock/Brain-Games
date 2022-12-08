package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    public static void gameProgression() {

        final int returnParametersQty = 3;
        final int gameRoundCount = 3;
        final int lengthPlusLimitation = 7;
        final int incrinmentLimitation = 4;
        final int arrayMinLength = 5;
        final int arrayStartpointLimitation = 20;
        final String rules = "What number is missing in the progression?";

        String[][] gameSet = new String[gameRoundCount][returnParametersQty];
        String question = "";

        String answer = "";

        for (var n = 0; n < gameRoundCount; n++) {

            StringJoiner questionArray = new StringJoiner(" ");
            int questionPlusLength = Utils.getRandomNum(0, lengthPlusLimitation);
            int progressionDiff = Utils.getRandomNum(1, incrinmentLimitation);
            int progressionCurrentValue = Utils.getRandomNum(0, arrayStartpointLimitation);
            int secretNumPosition = Utils.getRandomNum(1, arrayMinLength + questionPlusLength);

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

            gameSet[n][0] = rules;
            gameSet[n][1] = question;
            gameSet[n][2] = answer;
        }

        Engine.gameEngine(gameSet);

    }
}


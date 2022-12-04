package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {
    public static String[] gameProgression() {
        String[] gameSet = new String[3];

        String rules = "What number is missing in the progression?";
        String question = "";
        StringJoiner questionArray = new StringJoiner(" ");
        String answer = "";
        int questionPlusLength = Engine.getRandomNum(7);
        int progressionDiff = Engine.getRandomNum(4) + 1;
        int progressionCurrentValue = Engine.getRandomNum(20);
        int secretNumPosition = Engine.getRandomNum(4 + questionPlusLength) + 1;

        for (int i = 1; i <= 5 + questionPlusLength; i++) {
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


package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    public static String[] gameEven() {

        String[] gameSet = new String[4];

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int questionNum = Engine.getRandomNum();
        String question = "Question: " + questionNum;
        String answer;
        String wrongAnswer;

        if (questionNum % 2 == 0) {
                answer = "yes";
                } else {
                answer = "no";
            }

        wrongAnswer = " is wrong. Correct answer was " + "'" + answer + "'";

        gameSet[0] = rules;
        gameSet[1] = question;
        gameSet[2] = answer;
        gameSet[3] = wrongAnswer;

        return gameSet;
    }
}



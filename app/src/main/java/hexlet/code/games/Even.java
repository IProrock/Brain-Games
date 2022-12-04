package hexlet.code.games;
import hexlet.code.Engine;

public class Even {

    public static String[] gameEven() {

        String[] gameSet = new String[3];

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int questionNum = Engine.getRandomNum();
        String answer;

        if (questionNum % 2 == 0) {
                answer = "yes";
                } else {
                answer = "no";
            }

        gameSet[0] = rules;
        gameSet[1] = Integer.toString(questionNum);
        gameSet[2] = answer;

        return gameSet;
    }
}



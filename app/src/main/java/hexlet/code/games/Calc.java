package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static String[] gameCalc() {

        final int RETURN_PARAMETERS_QTY = 3;
        String[] gameSet = new String[RETURN_PARAMETERS_QTY];

        String rules = "What is the result of the expression?";
        final int NUM_MAX_LIMITATION = 50;
        final int POSSIBLE_FUNCTIONS_QTY = 3; // + or - or *
        int firstNum = Engine.getRandomNum(NUM_MAX_LIMITATION);
        int secondNum = Engine.getRandomNum(NUM_MAX_LIMITATION);
        int function = Engine.getRandomNum(POSSIBLE_FUNCTIONS_QTY);
        String answer = "";
        String textFunction = "";

        switch (function) {
            case 1:
                textFunction = "+";
                answer = Integer.toString((firstNum + secondNum));
                break;
            case 2:
                textFunction = "-";
                answer = Integer.toString((firstNum - secondNum));
                break;
            default:
                textFunction = "*";
                answer = Integer.toString((firstNum * secondNum));
        }
        String question = firstNum + " " + textFunction + " " + secondNum;

        gameSet[0] = rules;
        gameSet[1] = question;
        gameSet[2] = answer;

        return gameSet;
    }
}

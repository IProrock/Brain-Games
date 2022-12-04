package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static String[] gameCalc() {
        String[] gameSet = new String[3];

        String rules = "What is the result of the expression?";
        int firstNum = Engine.getRandomNum(50);
        int secondNum = Engine.getRandomNum(50);
        int function = Engine.getRandomNum(3);
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

package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static String[] gameCalc() {

        int returnParametersQty = 3;
        String[] gameSet = new String[returnParametersQty];

        String rules = "What is the result of the expression?";
        int numMaxLimitation = 50;
        int possibleFunctionsQty = 3; // + or - or *
        int firstNum = Engine.getRandomNum(numMaxLimitation);
        int secondNum = Engine.getRandomNum(numMaxLimitation);
        int function = Engine.getRandomNum(possibleFunctionsQty);
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

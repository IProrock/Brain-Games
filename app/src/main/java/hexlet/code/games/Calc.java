package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static String[] gameCalc() {

        int RETURNPARAMETERSQTY = 3;
        String[] gameSet = new String[RETURNPARAMETERSQTY];

        String rules = "What is the result of the expression?";
        int NUMMAXLIMITATION = 50;
        int POSSIBLEFUNCTIONSQTY = 3; // + or - or *
        int firstNum = Engine.getRandomNum(NUMMAXLIMITATION);
        int secondNum = Engine.getRandomNum(NUMMAXLIMITATION);
        int function = Engine.getRandomNum(POSSIBLEFUNCTIONSQTY);
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

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void gameCalc() {

        final int numMinLimitation = 0;
        final int numMaxLimitation = 50;
        final int possibleFunctionsQty = 3; // + or - or *
        final int returnParametersQty = 3;
        final int gameRoundCount = 3;
        final String rules = "What is the result of the expression?";

        String[][] gameSet = new String[gameRoundCount][returnParametersQty];
        String answer = "";
        String textFunction = "";

        for (var i = 0; i < gameRoundCount; i++) {
            int firstNum = Utils.getRandomNum(numMinLimitation, numMaxLimitation);
            int secondNum = Utils.getRandomNum(numMinLimitation, numMaxLimitation);
            int function = Utils.getRandomNum(0, possibleFunctionsQty);

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

            gameSet[i][0] = rules;
            gameSet[i][1] = question;
            gameSet[i][2] = answer;
        }

        Engine.gameEngine(gameSet);
    }
}

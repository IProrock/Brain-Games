package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String RULES = "What is the result of the expression?";
    private static final int NUM_MIN_LIMITATION = 0;
    private static final int NUM_MAX_LIMITATION = 50;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final int NUMBER_OF_ROUNDS = Engine.NUMBER_OF_ROUNDS;


    public static void runGame() {

        String[][] gameSet = new String[NUMBER_OF_ROUNDS][1];

        try {
            for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
                gameSet[i] = generateRoundData();
            }
            Engine.run(gameSet, RULES);
        } catch (Exception e) {
            System.out.println("Calc game internal error\n Method calculate: " + e.getMessage());
        }
    }

    private static String[] generateRoundData() throws Exception {

        int firstNum = Utils.getRandomNum(NUM_MIN_LIMITATION, NUM_MAX_LIMITATION);
        int secondNum = Utils.getRandomNum(NUM_MIN_LIMITATION, NUM_MAX_LIMITATION);
        char operator = OPERATORS[Utils.getRandomNum(0, OPERATORS.length - 1)];
        String answer = null;

        String question = firstNum + " " + operator + " " + secondNum;
        answer = calculate(firstNum, secondNum, operator);

        return new String[] {question, answer};
    }


    private static String calculate(int firstNum, int secondNum, char operator) throws Exception {

        switch (operator) {
            case '+':
                return Integer.toString(firstNum + secondNum);

            case '-':
                return Integer.toString(firstNum - secondNum);

            case '*':
                return Integer.toString( firstNum * secondNum);

            default:
                throw new Exception(String.format("Operator \"" + operator + "\" is not valid."));

        }
    }
}

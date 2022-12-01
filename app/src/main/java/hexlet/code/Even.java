package hexlet.code;
import java.util.Scanner;

public class Even {

    public static void game(String userName) {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            String answer;
            int question = getRandom();
            boolean isEven = (question % 2 == 0);

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            answer = scanner.next();

            if (((isEven) && answer.equals("yes")) || (!isEven) && answer.equals("no")) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + userName);
                }
            } else {
                System.out.println("'" + answer + "'" + " is wrong. Correct answer was " + (isEven ? "'yes'." : "'no'."));
                break;
            }
        }


    }

    public static int getRandom(int min, int max) {
        return  (int) (Math.random() * (max - min) + min);
    }
    public static int getRandom() {
        return getRandom(1, 500);
    }
}

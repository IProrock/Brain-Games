package hexlet.code;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter"
                + "\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");

        choice = scanner.nextInt();

        if (choice == 1) {
            greetingNew();
        } else {
            String userName = greetingNew();
            Engine.gameEngine(choice, userName);
        }
    }

    public static String greetingNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}

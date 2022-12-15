package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        final String greeting = "1";
        final String evenGame = "2";
        final String calcGame = "3";
        final String gcdGame = "4";
        final String progressionGame = "5";
        final String primeGame = "6";

        String choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        System.out.print("Your choice: ");

        choice = scanner.next();

        switch (choice) {
            case "0":
                break;
            case greeting:
                Cli.greeting();
                break;
            case evenGame:
                Even.runGame();
                break;
            case calcGame:
                Calc.runGame();
                break;
            case gcdGame:
                Gcd.runGame();
                break;
            case progressionGame:
                Progression.runGame();
                break;
            case primeGame:
                Prime.runGame();
                break;
            default:
                System.out.println("Incorrect input. Please restart the game.");
        }
        scanner.close();
    }
}

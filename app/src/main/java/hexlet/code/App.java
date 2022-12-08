package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        final int greeting = 1;
        final int evenGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4;
        final int progressionGame = 5;
        final int primeGame = 6;

        int choice;
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

        choice = scanner.nextInt();

        switch (choice) {
            case greeting:
                Engine.greeting();
                break;
            case evenGame:
                Even.gameEven();
                break;
            case calcGame:
                Calc.gameCalc();
                break;
            case gcdGame:
                Gcd.gameGcd();
                break;
            case progressionGame:
                Progression.gameProgression();
                break;
            case primeGame:
                Prime.gamePrime();
                break;
            default:

        }

    }

}

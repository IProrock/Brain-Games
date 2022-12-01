package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter"
                + "\n1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");

        choice = scanner.nextInt();

        if (choice == 1) {
            greetingNew();
        } else if (choice ==2) {
            String userName = greetingNew();
            Even.game(userName);
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

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {

        higherLower(randomNumGenerator(), playerGuess());

    }

    public static int randomNumGenerator() {
        Random rand = new Random();
        double number = Math.ceil(rand.nextInt(100));
        int numberToGuess = (int) number;
        System.out.println(numberToGuess);
        return numberToGuess;
    }

    public static int playerGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 - 100");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static int guessAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess again!!");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static String higherLower(int num, int guess) {
        String winner = "Good Guess";
        int tries = 0;
        if (!(num == guess)){
            do {
                if (num == guess) {
                    System.out.printf("%s, it only took you %s tries!", winner, tries);
                    return winner;
                }
                else if (num > guess) {
                    System.out.println("Higher!");
                } else if (num < guess) {
                    System.out.println("Lower!");
                }
                tries += 1;
                guess = guessAgain();
                System.out.println(tries);
            } while (tries <= 3);
        }
        System.out.print("You Lose!");
        return "You Lose";
    }
}

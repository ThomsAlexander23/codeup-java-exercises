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
        if (num == guess) {
            System.out.printf("%s, it only took you %s tries!", winner, tries);
            return winner;
        } else {
            do {
                if (num > guess) {
                    tries += 1;
                    System.out.println("Higher!");
                    num = guessAgain();
                    if (num == guess){
                        System.out.printf("%s, it only took you %s tries!", winner, tries);
                        return winner;
                    }
                } else {
                    tries += 1;
                    System.out.println("Lower!");
                    num = guessAgain();
                    if (num == guess){
                        System.out.printf("%s, it only took you %s tries!", winner, tries);
                        return winner;
                    }
                }
            } while (num != guess);
            return winner;
        }
    }
}

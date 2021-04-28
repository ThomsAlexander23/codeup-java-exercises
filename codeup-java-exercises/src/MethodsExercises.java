import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(addMethod(3, 5));
//        System.out.println(subtractMethod(3, 5));
//        System.out.println(multiplyMethod(3, 5));
//        System.out.println(divideMethod(3, 5));
//        System.out.println(modulusMethod(3, 1));
//        System.out.println(modulusMethod(3, 0));
//        System.out.println("Hey");
//        System.out.println(multiplyNoAsteriskMethod(3, 5));
//        System.out.println(getInteger(3,5));
//        System.out.println(getFactorialForLoop(getInteger(1,20)));
//        System.out.println(getFactorialWhile(getInteger(1,20)));
//        System.out.println(getFactorialRecursive(getInteger(1, 20)));
        System.out.println(diceRoll(getInteger(1,6)));
    }


    public static long addMethod(long x, long y) {
        return x + y;
    }

    public static long subtractMethod(long x, long y) {
        return x - y;
    }

    public static long multiplyMethod(long x, long y) {
        return x * y;
    }

    public static long divideMethod(long x, long y) {
        return x / y;
    }

    public static long modulusMethod(long x, long y) {
        if (y != 0) {
            return x % y;
        }
        long z = 0;
        return z;
    }

    public static int multiplyNoAsteriskMethod(int x, int y) {
        if (y == 0)
            return 0;
        if (y > 0)
            return x + multiplyNoAsteriskMethod(x, y - 1);
        else if (y < 0)
            return x + multiplyNoAsteriskMethod(x, -y);
        return -1;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min) {
            if (userInput <= max) {
                return userInput;
            }
        }
        return getInteger(min, max);
    }

    public static long getFactorialForLoop(int num) {
        Scanner scanner = new Scanner(System.in);
        int userInput = num;
        long total = 1;
        for (int i = 1; i <= userInput; i++) {
            total *= i;
        }
        System.out.printf("The factorial of %s is: %s\n", userInput, total);
        System.out.printf("Yes to continue, No to exit");
        String userAnswer = scanner.next().toUpperCase();
        if (userAnswer.equals("YES")) {
            return getFactorialForLoop(getInteger(1, 20));
        }
        System.out.println("Thanks for using this method!!");
        return total;
    }

    public static long getFactorialWhile(int num) {
        Scanner scanner = new Scanner(System.in);
        int userInput = num;
        long total = 0;
        while (num > 1) {
            total += (multiplyMethod(userInput, num - 1));
            num = num - 1;
        }
        System.out.printf("The factorial of %s is: %s\n", userInput, total);
        System.out.print("Yes to continue, No to exit");
        String userAnswer = scanner.next().toUpperCase();
        if (userAnswer.equals("YES")) {
            return getFactorialWhile(getInteger(1, 20));
        }
        System.out.println("Thanks for using this method!!");
        return total;
    }

    public static long getFactorialRecursive(int num) {
        Scanner scanner = new Scanner(System.in);
        int userInput = num;
        while (userInput > 1){
            System.out.println("looping");
            return userInput * getFactorialRecursive(userInput-1);

        }
        return userInput;
    }

    public static int diceRoll(int dieSides){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ready to roll the dice? Yes to roll. No to leave.");
        String userInput = scanner.next();
        if (userInput.toLowerCase().equals("yes")){
            Random rand = new Random();
            int upperbound = dieSides;
            int dieRollValue1 = rand.nextInt(upperbound);
            int dieRollValue2 = rand.nextInt(upperbound);
            int total = dieRollValue1 + dieRollValue2;
            System.out.printf("First die value rolled: %s\nSecond die value rolled: %s\nTotal die value: %s\n", dieRollValue1, dieRollValue2, total);
            return total;
        }
        System.out.println("Sorry to see you go, young adventurer!!!");
        return dieSides;
    }
}

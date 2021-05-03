package util;
import java.util.Scanner;
import java.lang.String;

public class Input {
    private static Scanner scanner;

    static String getString(){
        System.out.println("Please Enter Text");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static boolean yesNo(){
        System.out.println("Yes or No?");
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       return input.contains("y");
    }

    static int getInt(){
        System.out.println("Please Enter a whole number");
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    static int getInt(int min, int max){
        System.out.printf("Please enter a whole number between %s and %s", min, max);
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return (input <= max && input >= min)? input : getInt(min,max);
    }

    static double getDouble(){
        System.out.printf("Please enter a number");
        scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        return input;
    }

    static double getDouble(double min, double max){
        System.out.printf("Please enter a number between %.0f and %.0f", min, max);
        scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        return (input <= max && input >= min)? input : getDouble(min,max);
    }
}

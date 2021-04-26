import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f \n", pi);
//
//        System.out.print("please enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//        System.out.print("please enter an 3 words: \n");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.printf("User entered: %s, %s, %s", word1, word2, word3);
//
//          System.out.println("Please write a sentence");
//          String UserInput = scanner.nextLine();
//          System.out.printf("%s", UserInput);
            System.out.println("Enter the measurements please?");
            String lengthString = scanner.next();
            String widthString = scanner.next();
            int length = Integer.parseInt(lengthString);
            int width = Integer.parseInt(widthString);
            int area = length * width;
            int perimeter = (length + width) * 2;
            System.out.printf("The perimeter and area for a room with those measurements: %s and %s", perimeter, area);

    }
    }


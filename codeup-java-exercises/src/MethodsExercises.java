import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(addMethod(3, 5));
        System.out.println(subtractMethod(3, 5));
        System.out.println(multiplyMethod(3, 5));
        System.out.println(divideMethod(3, 5));
        System.out.println(modulusMethod(3, 1));
        System.out.println(modulusMethod(3, 0));
        System.out.println("Hey");
        System.out.println(multiplyNoAsteriskMethod(3, 5));
        System.out.println(getInteger(3,5));
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
                return x + multiplyNoAsteriskMethod(x, y-1);
            else if (y < 0)
                return x + multiplyNoAsteriskMethod(x, -y);
        return -1;
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min){
            if (userInput <= max){
                return userInput;
            }
        }
        return getInteger(min, max);
    }
}

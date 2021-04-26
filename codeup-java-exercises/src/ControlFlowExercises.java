import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%s ", i);
//            i++;
//        }
//        int y = 0;
//        do {
//            y += 2;
//            System.out.printf("%s\n", y);
//
//        } while (y < 100);
//        do {
//            y -= 5;
//            System.out.printf("%s\n", y);
//        } while (y > -10);
//        float z = 2;
//        do {
//            System.out.printf("%.0f\n", z);
//            z *= z;
////        } while (z < 100000);
//        for (int a = 5; a <= 15; a++){
//            System.out.printf("%s ", a);
//        }
//        for (int a = 2; a <= 100; a++){
//            System.out.printf("%s\n", a);
//        }
//        for (int a = 100; a >= -10; a -= 5){
//            System.out.printf("%s\n", a);
//        }
//        for (float a = 2; a <= 100000; a *= a){
//            System.out.printf("%.0f\n", a);
//        }
//        for (int i = 0; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.printf("FizzBuzz\n");
//            }
//            else if (i % 5 == 0) {
//                System.out.printf("Buzz\n");
//            }
//            else if (i % 3 == 0) {
//                System.out.printf("Fizz\n");
//            }   else {
//
//                System.out.printf("%s\n", i);
//            }
//        }
        System.out.print("What number would you like to go up to?");
        int userNum = scanner.nextInt();
        System.out.print("Here is your table!\n\nnumber | squared | cubed\n------ | ------  | ------\n");
        String lineOne = "1      | 1       | 1       \n";
        String lastLine = "%s      | %s       | %s       \n";
        System.out.printf(lineOne);
        for (int i = 2; i <= userNum; i++){
            int number = i;
            int square = i * i;
            int cube = i * i * i;
            if (square >= 100000){
                lastLine = "%s|%s|%s\n";
                System.out.printf(lastLine, number,square, cube);
            }
            if (square >= 10000){
                lastLine = "%s     | %s   | %s\n";
                System.out.printf(lastLine, number,square, cube);
            }
            else if (square >= 1000){
                lastLine = "%s     | %s    | %s\n";
                System.out.printf(lastLine, number,square, cube);
            }
            else if (square >= 100){
                lastLine = "%s     | %s     | %s\n";
                System.out.printf(lastLine, number,square, cube);
            }
            else if (square >= 10){
                lastLine = "%s      | %s      | %s\n";
                System.out.printf(lastLine, number,square, cube);
            }
            else if (square > 9){
                System.out.printf(lastLine, number,square, cube);
            }
        }



    }
}

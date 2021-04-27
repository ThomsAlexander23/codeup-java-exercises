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
//        String playAgain;
//        do {
//        System.out.print("What number would you like to go up to?");
//        int userNum = scanner.nextInt();
//        System.out.print("Here is your table!\n\nnumber | squared | cubed\n------ | ------  | ------\n");
//        String lineOne = "1      | 1       | 1       \n";
//        String lastLine = "%s      | %s       | %s       \n";
//        System.out.printf(lineOne);
//        for (int i = 2; i <= userNum; i++){
//            int number = i;
//            int square = i * i;
//            int cube = i * i * i;
//            if (square >= 100000){
//                lastLine = "%s|%s|%s\n";
//                System.out.printf(lastLine, number,square, cube);
//            }
//            if (square >= 10000){
//                lastLine = "%s     | %s   | %s\n";
//                System.out.printf(lastLine, number,square, cube);
//            }
//            else if (square >= 1000){
//                lastLine = "%s     | %s    | %s\n";
//                System.out.printf(lastLine, number,square, cube);
//            }
//            else if (square >= 100){
//                lastLine = "%s     | %s     | %s\n";
//                System.out.printf(lastLine, number,square, cube);
//            }
//            else if (square >= 10){
//                lastLine = "%s      | %s      | %s\n";
//                System.out.printf(lastLine, number,square, cube);
//            }
//            else if (square > 9){
//                System.out.printf(lastLine, number,square, cube);
//            }
//        }
//            System.out.println("Enter True to play some more");
//            playAgain = scanner.next();
//        } while (playAgain.equalsIgnoreCase("True"));
//
//        System.out.println("What a fun thing to do!!");
          System.out.println("What is your grade for this semester?");
          int userGrade = scanner.nextInt();
          String[] letters = {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F"};
          int[] percentageCutoff = {97,93,90,87,83,80,77,73,70,67,65,62,59};
          for (int i = 0; i <= percentageCutoff.length; i++){
              if (i == percentageCutoff.length){
                  System.out.print("Would you like to enter another grade? (only Yes will continue!)");
                  String confirm = scanner.next();
                  if (confirm.equals("Yes")){
                      i = 0;
                      System.out.println("What is your grade for this semester?");
                      userGrade = scanner.nextInt();
                  }
                  else {
                      System.out.print("Finished grading conversion, see you later!");
                      break;
                  }
              }
              else if (userGrade >= percentageCutoff[i]){
                  System.out.printf("Your letter grade is: %s\n", letters[i]);
                  i = percentageCutoff.length-1;
              }
              else if (userGrade <= 59){
                  System.out.printf("Your letter grade is: %s\n", letters[letters.length-1]);
                  i = percentageCutoff.length-1;
              }

          }




    }
}

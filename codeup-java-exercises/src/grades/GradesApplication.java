package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class GradesApplication {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();

    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();
        Student alex = new Student("Alex", "Thoms");
        Student olesia = new Student("Olesia", "Thoms");
        Student vasya = new Student("Vasya", "Thoms");
        Student rhaegar = new Student("Rhaegar", "Thoms");
        alex.addGrade(66).addGrade(67).addGrade(69).addGrade(100);
        olesia.addGrade(90).addGrade(97).addGrade(94).addGrade(100);
        vasya.addGrade(80).addGrade(80).addGrade(99).addGrade(55);
        rhaegar.addGrade(88).addGrade(87).addGrade(90).addGrade(86);

        students.put("imperator", alex);
        students.put("tsaritsa", olesia);
        students.put("whoopsie", vasya);
        students.put("sabaka", rhaegar);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:");
        for (String key : students.keySet()){
            System.out.printf("| %s |",key);
        }
        System.out.println("\nWhat Student would you like to see?");





    }
}

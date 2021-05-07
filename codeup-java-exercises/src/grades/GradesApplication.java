package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;

public class GradesApplication {


    public static void main(String[] args) {
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
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (Object key : students.keySet()) {
            System.out.printf("| %s |", key);
        }

        do {
            System.out.println("\nEnter the students username\n");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (students.containsKey(input)) {
                System.out.printf("Name: %s\n", students.get(input).getName());
                System.out.printf("Username: %s\n", input);
                System.out.printf("Average Grade: %.2f\n", students.get(input).getGradeAverage());
            }
        } while (Input.yesNo());
    }
}
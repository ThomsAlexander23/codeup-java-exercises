package grades;

import java.util.ArrayList;


public class Student {
    private ArrayList<Integer> grades;
    private String name;
    public Student(String firstName, String lastName){
        this.name = firstName + " " + lastName;
        grades = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }

    public Student addGrade(int grade){
        grades.add(grade);
        return this;
    }

    public double getGradeAverage(){
        double average = 0;
        for (int grade : grades){
            average += grade;
        }
        return average/grades.size();
    }

    public static void main(String[] args){
        Student one = new Student("Alex", "Thoms");
        one.addGrade(98).addGrade(88).addGrade(92);

        System.out.println(one.getName());
        System.out.printf("%.2f",one.getGradeAverage());

    }
}

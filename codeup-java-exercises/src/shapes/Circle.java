package shapes;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args){
        Circle myCircle = new Circle();
        System.out.println(myCircle.radius);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.circumference());
    }

    Scanner scanner = new Scanner(System.in);
    private double radius;

    public Circle(){
        System.out.println("Enter a radius for the circle\n");
        radius = scanner.nextDouble();
    }

    public double getArea(){
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double circumference(){
        return Math.PI * 2 * this.radius;
    }
}

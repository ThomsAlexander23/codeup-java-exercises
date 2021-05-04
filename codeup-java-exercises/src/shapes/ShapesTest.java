package shapes;

public class ShapesTest {

    public static void main(String[] args){
        Rectangle boxOne = new Rectangle(4,5);
        Rectangle boxTwo = new Square(5);

        System.out.println(boxOne.getArea());
        System.out.println(boxOne.getPerimeter());
        System.out.println(boxTwo.getArea());
        System.out.println(boxTwo.getPerimeter());
    }
}

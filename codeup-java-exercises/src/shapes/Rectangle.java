package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }



    public int getPerimeter(){
        return (2 * this.width) + (2 * this.length);
    }

    public int getArea(){
        return (this.width * this.length);
    }
}

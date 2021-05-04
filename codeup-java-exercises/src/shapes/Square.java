package shapes;

public class Square extends Rectangle {
    protected int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }

    public int getArea(){
        return (int) Math.pow(this.side, 2);
    }

    public int getPerimeter(){
        return this.side * 4;
    }
}

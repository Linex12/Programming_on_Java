package Practice5.Task123;

public class Square extends Rectangle{
    public Square() {
        width = 100;
        length = 100;
    }
    public Square(double side) {
        width = side;
        length = side;
    }
    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        width = side;
        length = side;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side) {
        width = side;
        length = side;
    }
    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setLength(double side) {
        width = side;
        length = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+this.width+", color: "+this.color+", filled: "+this.filled;
    }
}

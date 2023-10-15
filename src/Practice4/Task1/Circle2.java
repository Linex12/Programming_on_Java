package Practice4.Task1;

public class Circle2 {
    private double radius;
    public Circle2() {
        this.radius = 10;
    }
    public Circle2(int radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getDiameter() {
        return radius*2;
    }
    public double getLength() {
        return 2*Math.PI*radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return getRadius() + " " +getDiameter() + " " +getLength();
    }
}

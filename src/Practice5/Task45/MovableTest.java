package Practice5.Task45;

public class MovableTest {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0,0,10,3,1);
        circle.moveUp();
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);
        MovableRectangle rectangle = new MovableRectangle(1,4,3,2,5,7);
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println(rectangle);
    }
}

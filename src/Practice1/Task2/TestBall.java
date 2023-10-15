package Practice1.Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Basketball",18);
        Ball ball2 = new Ball("Baseball", 5);
        System.out.println(ball1);
        System.out.println(ball2.getType());
    }
}

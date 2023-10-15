package Practice3.Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        ball.move(88, 10);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        System.out.println(ball);
        ball.setY(90);
        System.out.println(ball);
        ball.move(-8, 10);
        System.out.println(ball);
    }
}

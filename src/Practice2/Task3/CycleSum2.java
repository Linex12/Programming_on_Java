package Practice2.Task3;

public class CycleSum2 {

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 11; i++) {
            double i2 = i;
            sum += 1.0 / i2;
        }
        System.out.println(sum);
    }
}

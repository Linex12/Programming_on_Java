package Practice2.Task5;

public class CycleFactorial {
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int f = factorial(5);
        System.out.println(f);
    }
}

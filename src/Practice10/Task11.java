package Practice10;
import java.util.Scanner;
public class Task11 {
    public static int numbers() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 0;
        if (a == 0) {
            b = in.nextInt();
            if (b == 0) {
                return 0;
            }
        }
        if (a == 1) {
            if (b == 1)
                return 2 + numbers();
            else {
                return 1 + numbers();
            }
        }
        else if (b == 1) {
            return 1 + numbers();
        }
        return numbers();
    }
    public static void main(String[] args) {
        System.out.println(numbers());
    }
}

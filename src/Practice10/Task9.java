package Practice10;

import java.util.Scanner;

public class Task9 {
    public static int combination(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if ((a == 0) || (b == 0)) {
            return 1;
        }
        return combination(a, b-1) + combination(a-1,b-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(combination(a, b));
    }

}

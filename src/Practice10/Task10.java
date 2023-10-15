package Practice10;

import java.util.Scanner;

public class Task10 {
    public static int reverse(int n, int p) {
        if (n == 0) {
            return p;
        }
        return reverse(n/10,p*10+n%10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(reverse(a,0));
    }
}

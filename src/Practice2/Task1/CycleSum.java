package Practice2.Task1;

import java.util.Scanner;

public class CycleSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println("For result: " + sum);
        sum = 0;
        int i = 0;
        while (i < 10) {
            sum += arr[i];
            i++;
        }
        i = 0;
        System.out.println("While result: " + sum);
        sum = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < 10);
        System.out.println("Do while result: " + sum);
    }
}

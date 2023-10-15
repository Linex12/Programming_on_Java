package Practice17.Task1;

import java.util.Scanner;

public class INNChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write fio");
        String fio = in.next();
        System.out.println("Write an INN");
        String inn = in.next();
        if (inn.length() != 12) {
            throw new NullPointerException("Inn is incorrect");
        }
        int[] numbers = new int[12];
        char[] inn_chars = inn.toCharArray();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(inn_chars[i] - '0');
        }
        int control1 = ((7 * numbers[0] + 2 * numbers[1] + 4 * numbers[2] + 10 * numbers[3] + 3 * numbers[4] +
                5 * numbers[5] + 9 * numbers[6] + 4 * numbers[7] + 6 * numbers[8] + 8 * numbers[9]) % 11) % 10;
        int control2 = ((3 * numbers[0] + 7 * numbers[1] + 2 * numbers[2] + 4 * numbers[3] + 10 * numbers[4] +
                3 * numbers[5] + 5 * numbers[6] + 9 * numbers[7] + 4 * numbers[8] + 6 * numbers[9] + 8 * numbers[10]) % 11) % 10;
        if ((numbers[10] == control1) && (numbers[11] == control2)) {
            System.out.println("Accepted!!!");
        }
        else {
            throw new NullPointerException("Inn is incorrect");
        }
    }
}

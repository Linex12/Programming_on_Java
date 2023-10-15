package Practice16.Task3;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Non-integer input detected");
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}

package Practice16.Task2;
import java.util.Scanner;

public class Exception20 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }
    // Qwerty: NumberFormatException
    // 0: ArithmeticException
    // 1.2: NumberFormatException
}

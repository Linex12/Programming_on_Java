package Practice16.Task7;
import java.util.Scanner;
public class Exception71 {
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getDetails(String key) {
        if (key.compareTo("") == 0) {
            try {
                throw new Exception("key set to empty string");
            } catch (Exception e) {
                System.out.println(e + " catched");
            }
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}

package Practice16.Task8;
import java.util.Scanner;
public class Exception8 {
    public static void getKey() {
        while (true) {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                continue;
            }
        }
    }

    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getDetails(String key) throws Exception {
        if (key.compareTo("") == 0) {
            throw new Exception("key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}

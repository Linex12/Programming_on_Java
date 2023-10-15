package Practice16.Task6;

public class Exception6 {
    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public static String getDetails(String key) {
        if (key == null) {
            try {
                throw new NullPointerException("null key in getDetails");
            } catch (NullPointerException e) {
                key = "null";
            }
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        printMessage(null);
    }
}

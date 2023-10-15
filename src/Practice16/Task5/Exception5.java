package Practice16.Task5;

public class Exception5 {
    public static void getDetails(String key) {
        if (key == null) {
            try {
                throw new NullPointerException("null key in getDetails");
            } catch (NullPointerException e) {
                System.out.println("key is null");
            }
        }
    }
    public static void main(String[] args) {
        getDetails(null);
    }
}

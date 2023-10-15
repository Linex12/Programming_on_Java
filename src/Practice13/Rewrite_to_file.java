package Practice13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Rewrite_to_file {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try(FileWriter fout = new FileWriter("C:\\Users\\Liann\\IdeaProjects\\Programming_on_Java\\" +
                "src\\Practice13\\out.txt", false)) {
            fout.write(in.next());
            fout.append('\n');
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

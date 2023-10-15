package Practice13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read_from_file {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try(FileReader fin = new FileReader("C:\\Users\\Liann\\IdeaProjects\\Programming_on_Java\\" +
                "src\\Practice13\\out.txt")) {
            int c;
            while((c=fin.read()) != -1){
                System.out.print((char)c);
            }
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

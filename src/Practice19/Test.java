package Practice19;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static <T> List<T> convert(T array[])
    {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }
    public static void filecount() {
        File dir = new File("C:\\Users\\artem\\IdeaProjects\\Programming on Java\\src");
        if(dir.isDirectory())
            for (int i = 0; i < 5; i++)
                System.out.println(dir.listFiles()[i].getName());
    }

    public static void main(String[] args) {
        AnyMassive anyMassive = new AnyMassive();
        System.out.println(anyMassive);
        System.out.println(convert(anyMassive.getObjects()));
        System.out.println(anyMassive.getObject(1));
        filecount();
    }
}

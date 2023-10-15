package Practice11;
import java.util.Scanner;
public class TestStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setiDNumber(in.nextInt());
            students[i].setTestResults(in.nextInt());
        }
        Sorts.insertionSort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
        }
        System.out.println("____________________");
        Sorts.quickSort(students, 0, students.length - 1);
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
        }
        Student[] students2 = new Student[5];
        for (int i = 0; i < students2.length; i++) {
            students2[i] = new Student();
            students2[i].setiDNumber(in.nextInt());
            students2[i].setTestResults(in.nextInt());
        }
        students = Sorts.mergeSort(students);
        students2 = Sorts.mergeSort(students2);
        students = Sorts.merge(students, students2);
        System.out.println("____________________");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
        }
    }
}

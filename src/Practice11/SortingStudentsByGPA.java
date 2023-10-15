package Practice11;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getTestResults() > o2.getTestResults()) {
            return 1;
        }
        else if (o1.getTestResults() < o2.getTestResults()) {
            return -1;
        }
        return 0;
    }
}

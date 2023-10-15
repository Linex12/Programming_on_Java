package Practice17.Task2;

public class Student implements Comparable<Student> {
    private String fio;
    private int iDNumber;
    private int testResults;
    Student() {
        iDNumber = 0;
        testResults = 0;
        fio = "Not given";
    }
    Student(int iDNumber, String fio, int testResults) {
        this.iDNumber = iDNumber;
        this.testResults = testResults;
        this.fio = fio;
        checkFio();
    }
    public int getiDNumber() {
        return iDNumber;
    }
    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }
    public int getTestResults() {
        return testResults;
    }

    public void setTestResults(int testResults) {
        this.testResults = testResults;
    }

    public String getFio() {
        return fio;
    }
    public void checkFio() {
        if (fio.compareTo("") == 0)
            throw new EmptyStringException("Fio is empty");
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public int compareTo(Student o) {
        if (testResults == o.testResults)
            return 0;
        else if (testResults > o.testResults)
            return 1;
        else
            return -1;
    }

    @Override
    public boolean equals(Object obj) {
        return fio.compareTo(((Student)obj).fio) == 0;
    }

    @Override
    public String toString() {
        return fio + " " + testResults + "\n";
    }
}

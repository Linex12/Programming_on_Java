package Practice11;

public class Student {
    private int iDNumber;
    private int testResults;
    Student() {
        iDNumber = 0;
        testResults = 0;
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

    @Override
    public String toString() {
        return getiDNumber() + " " + getTestResults() + "\n";
    }
}

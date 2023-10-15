package Practice11;

public class Sorts {
    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student cur = arr[i];
            int j = i - 1;
            while ((j >= 0) && (cur.getiDNumber() < arr[j].getiDNumber())) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = cur;
        }
    }
    public static void quickSort(Student[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private static int partition(Student[] arr, int begin, int end) {
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (sortingStudentsByGPA.compare(arr[j],arr[end]) >= 0) {
                i++;
                Student swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Student swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
    public static Student [] mergeSort(Student[] arrayA) {
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        Student [] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        Student [] arrayC = new Student[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = mergeSort(arrayB);
        arrayC = mergeSort(arrayC);

        return merge(arrayB, arrayC);
    }
    public static Student[] merge(Student[] arrayA, Student[] arrayB) {
        Student[] arrayC = new Student[arrayA.length + arrayB.length];
        int positionA = 0;
        int positionB = 0;
        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA].getiDNumber() < arrayB[positionB].getiDNumber()) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }
}

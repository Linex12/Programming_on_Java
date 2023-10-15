package Practice17.Task2;

public class LabClass {
    public static void Sort(Comparable[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            Sort(arr, begin, partitionIndex-1);
            Sort(arr, partitionIndex+1, end);
        }
    }
    public static void Sort(Comparable[] arr) {
        Sort(arr, 0, arr.length-1);
    }
    private static int partition(Comparable[] arr, int begin, int end) {
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(arr[end]) >= 0) {
                i++;
                Comparable swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Comparable swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
    public static Comparable Search(Comparable[] list,Comparable target) {
        int index = 0;
        boolean found = false;
        while (!found && index < list.length) {
            if (list[index].equals(target))
                found = true;
            else
                index++;
        }
        if (found)
            return list[index];
        else
            throw new StudentNotFoundException("Student not found");
    }
}

package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10,23,4,42,32,5,6,11,26,16};
        selectionSort(arr);
        for(int i : arr) {
            System.out.print(i + "  ");
        }
    }
    public static void selectionSort (int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
}

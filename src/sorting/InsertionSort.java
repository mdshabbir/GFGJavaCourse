package sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 10, 24, 98, 34, 12, 2, 89, 15 };

        // sort this array using insertion sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }
            arr[j + 1] = key;
        }
//        System.out.println(java.util.Arrays.toString(arr));
    }

}

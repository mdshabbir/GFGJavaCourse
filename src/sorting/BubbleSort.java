package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,23,4,42,32,5,6,11,26,16};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
//

    }
    public static void bubbleSort (int[] arr) {
        // trasverse throught n-1 in the array
        for (int i = 0; i <arr.length - 1; i++) { //10,23,4,42,32,5,6,11,26,16
             for (int j = i; j < arr.length - 1; j++) {
                 if (arr[j] > arr[j+1]) {
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j + 1] = temp;
                 }
             }

        }

    }

}

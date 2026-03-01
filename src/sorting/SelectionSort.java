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
    public static void selecSort (int[] arr , int n , String order) {
        for (int i = 0; i < n - 2; i++) {
            int smallest = i;
            if (order == "asc") {
                for (int j = i; j < n - 1; j++) {
                    if (arr[j] < arr[smallest]) {
                        smallest = j;
                    }
                }

            } else {
                for (int j = i; j < n - 1; j++) {
                    if (arr[j] > arr[smallest]) {
                        smallest = j;
                    }
                }

            }


            int temp = i;
            arr[i] = arr[smallest];
            arr[smallest] = arr[temp];
        }
    }
}

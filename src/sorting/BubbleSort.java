package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,23,4,42,32,5,6,11,26,16};

//        bubbleSort(arr);
        bublleSort(arr,arr.length,"desc");
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

    public static void bublleSort (int[] arr , int n , String order) {
        // sort element using bubble sort
        for (int i = 0; i< n - 1; i++) {
            boolean flag = false;
            // traverse to Entire array and compare the adjacent element if first element is greater than
            // second than swap the elements
            for (int j = 0; j < n - 1; j++) {
                if (order == "asc") {
                    if (arr[j] > arr[j + 1]) {
                        // swap the elements
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        flag = true;

                    }
                } else {
                    if (arr[j] < arr[j + 1]) {
                        // swap the elements
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        flag = true;

                    }

                }
            }
            if (!flag) {
                break;
            }
        }
    }

}

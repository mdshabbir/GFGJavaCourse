package problem;

import sorting.SortingUtils;

public class PractiseProblem {
    public static void main(String[] args) {
        int[] arr = {1, 5, 20, 2, 1, 20, 11,4, 5};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.print("The second largest element is: " + secondLargest(arr));
    }

    // find second largest element in array.
    // to find second largest element we can use first brute force
    /*
    Steps to find second largest element
    1. Sort the Array using any algorithm
    2. last element is the largest element
    3. check if the second last element is same as the last element if yes then decresse the point to second largest and
    compare the third last element with second last and so on until the element will not be different if the element is
    not same then that element is the second largest elemnt.
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            // Changed condition to prevent IndexOutOfBounds and optimize
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            // Check if array is already sorted
            if (!flag) {
                break;
            }
        }
    }

    // find the second largest
    public static int secondLargest(int[] arr) {
        int secondLargest = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] != arr[j - 1]) {
                    secondLargest = arr[j - 1];
                    break;
                }
            }
        }
        return secondLargest;
    }
}

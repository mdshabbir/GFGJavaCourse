package arrayExample;

import java.util.*;

public class ArrayExample {
    public static void main(String[] args) {
        // you have to find the largest element from an array
        int[] num = {10, 5, 2, 7, 1, 9};
        int sum = 15;
//        System.out.println("The largest element in the array is: " + findLargest(arr));
// find the second-largest element
//        System.out.println("The largest element in the array is: " + secondLargest(arr));

        // check if array is sorted or not?

//        System.out.println("The array is " + (isSorted(arr) ? "sorted" : "not sorted"));
//
//        // Remove duplicate from sorted Array.
//        for(int i: removeDuplicate(arr)) {
//            System.out.println(i);
//        }

//        System.out.println("Left rotated array along first element is: ");
//        for (int i: rotateArray(arr)) {
//            System.out.println(i);
//        }
        // move zero to end .
//        System.out.println("The new array with zero at the ending is : ");
//        for (int i: moveZeroToEnd(arr)) {
//            System.out.println(i);
//        }
//        System.out.println("Moving the zero to the last using two pointer Optimizatoin:");
//        for(int i: moveZero(arr)) {
//            System.out.println(i);
//        }

        // linear search find the position of element present in the array
//        System.out.println("The position of the element present in thea array is: " + (findElement(arr,4) + 1));

        // mrege two sorted array :
//        System.out.println("Merged array is:" + Arrays.toString(mergeTwoArray(arr1, arr2)));

        // find the number that apperas One
//        System.out.println(findNumberAppearsOnes(arr));
    }

//    {
//        public static int findLargest ( int[] arr){
//        int largest = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }
//        return largest;
//    }
//
//        public static int secondLargest ( int[] arr){
//        int largest = arr[0];
//        int secondLargest = arr[1];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//
//            } else if (arr[i] > secondLargest && arr[i] != largest) {
//                secondLargest = arr[i];
//            }
//
//        }
//        return secondLargest;
//    }
//
//        public static boolean isSorted ( int[] arr){
//        boolean sorted = false;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] <= arr[i + 1]) {
//                sorted = true;
//            } else {
//                sorted = false;
//                break;
//            }
//        }
//        return sorted;
//    }
//
//        public static int[] removeDuplicate ( int[] arr){
//        int[] newArray = new int[8];
//        int j = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                newArray[j] = arr[i];
//                j++;
//            }
//        }
//        return newArray;
//    }
//
//        public static int[] rotateArray ( int[] arr){
//        int[] rotatedArr = new int[arr.length];
//        int val = arr[0];
//        System.arraycopy(arr, 1, rotatedArr, 0, arr.length - 1);
//        rotatedArr[arr.length - 1] = arr[0];
//        return rotatedArr;
//    }
//
//        public static int[] moveZeroToEnd ( int[] arr){
//        int[] newArray = new int[arr.length];
//        int j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                newArray[j] = arr[i];
//                j++;
//            }
//        }
//        return newArray;
//    }
//
//        public static int[] moveZero ( int[] arr){
//        int j = -1;
//        // find first zero value postion in the array
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                j = i;
//                break;
//            }
//        }
//        for (int i = j + 1; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//            }
//        }
//        return arr;
//    }
//
//        public static int findElement ( int[] arr, int element){
//        int pos = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == element) {
//                pos = i;
//                break;
//            }
//        }
//        return pos;
//    }
//
//public static int findNumberAppearsOnes(int[] arr) {
//    int freq = 0;
//    for (int i = 0; i < arr.length; i++) {
//        freq = 0;
//
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[i] == arr[j]) {
//                freq++;
//            }
//        }
//        if(freq == 1) {
//            return  arr[i];
//        }
//    }
//    return  -1;
//}
//
//    // find the lognes subarry with the given sum
//    public static  int[] subArray(int[] arr , int sum) {
//
//    }


}
//}

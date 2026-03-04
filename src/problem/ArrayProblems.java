package problem;

import sorting.SortingUtils;

import java.util.*;


public class ArrayProblems {
    public static void main(String[] args) {
        // q1 find largest element in array
        // optimize this solution
//        int[] arr = { 12,324,23,54,64,23};
//        SortingUtils.insertionSort(arr);
//        isSorted(arr);
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
//        leftRoatebyK(arr,2 , "left");
        removeZero(arr);


    }

    public static int largest(int[] arr) {
        SortingUtils.insertionSort(arr);
        return arr[arr.length - 1];
    }

    public static int greatestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        return largest;
    }

    // find second largest element in array
    public static int secondLargest(int[] arr) {
        SortingUtils.insertionSort(arr);
        int largest = arr[arr.length - 1];
//        System.out.println(largest);
        int secondlargest = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != largest) {
                secondlargest = arr[i];
                break;
            }
        }
        return secondlargest;
    }

    // Optimal Solution to find Second largest element and largest element
    public static int[] secondlargestElement(int[] arr) {
        int largest = arr[0];
        int second_largest = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        return new int[]{largest, second_largest};
    }

    // check if array is sorted or not
    public static void isSorted(int[] arr) {
        // you have to check weater array is sorted or not.
        if (SortingUtils.isSorted(arr)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    //  remove duplicate element from the array
    public static int removeDuplicate(int[] arr, String approach) {
        // first of all take a set
        int count = 0;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        List<Integer> list = new ArrayList<>(st);
        for (int i = 0; i < st.size(); i++) {
            count++;
            arr[i] = list.get(i);
        }
        for (int i : list) {
            System.out.print(i + " ");
        }

        return count;
    }

    // remove duplicate element form the array with better solution
    public static int remove_duplicate(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    // Left Rotate the Array by One
    public static void leftRotate(int[] arr) {
        int len = arr.length;
        int[] rotatedArr = new int[len];
        for (int i = 0; i < len - 1; i++) {
            rotatedArr[i] = arr[i + 1];
        }
        rotatedArr[len - 1] = arr[0];
        for (int i : rotatedArr) {
            System.out.print(i + " ");
        }
    }

    // optimal solution for this problem
    public static void leftRotate(int[] arr, boolean flag) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // 1, 2, 3, 4, 5, 6, 7
    // Output  6,7,1,2,3,4,5
    // left rotate to any array by k place
    public static void leftRoatebyK(int[] arr, int k, String direction) {
        if (direction == "left") {
            for (int i = 0; i < k; i++) {
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        } else {
            for (int i = 0; i < k; i++) {
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    //Move all Zeros to the end of the array
    //  Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
    //  Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

    public static void removeZero(int[] arr) {
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i : arr) {
            list.add(i);
        }
        for (int i : arr) {
            ll.add(i);
        }

        Collections.sort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll.pop());
        System.out.println(ll.removeLast());
        System.out.println(ll);

        System.out.println();

            int insertPos = 0;
            // move non-zero elements forward
            for (int v : arr) {
                if (v != 0) {
                    arr[insertPos++] = v;
                }
            }
            // fill remaining positions with zeros
            while (insertPos < arr.length) {
                arr[insertPos++] = 0;
            }
            for (int i : arr) {
                System.out.print(i + " ");

            }
        }







}


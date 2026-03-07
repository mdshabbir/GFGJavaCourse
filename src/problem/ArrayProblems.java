package problem;

import sorting.InsertionSort;
import sorting.SortingUtils;

import java.util.*;


public class ArrayProblems {
    public static void main(String[] args) {
        // q1 find largest element in array
        // optimize this solution
//        int[] arr = { 12,324,23,54,64,23};
//        SortingUtils.insertionSort(arr);
//        isSorted(arr);
//        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
//       int[]    arr1= {1,2,3,4,5,6,7,8,9,10};
//       int[]    arr2= {2,3,4,4,5,11,12};
//        Set<Integer> unionset  = unionOfArray(arr1,arr2);
//        System.out.println();
//        for (int i : unionset) {
//            System.out.print(i + " ");
//        }
//        leftRoatebyK(arr,2 , "left");
//        removeZero(arr);
//        System.out.println(searchElement(arr,4));
//       int[] arr = {8, 2, 4, 5, 3, 7, 1};
//        System.out.println(findMissingNumber(arr));
//        int[] arr = {1,0,1,1,1,0,1,1};
////        System.out.println(consecutiveOnes(arr));
        int[] arr = {4,1,2,1,2};
        System.out.println(findNumberOccur1s(arr));

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
        // we want to find element in array
    public static int searchElement(int[] arr , int n) {
        int pos = -1;
        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return  pos;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                pos = i;
            }
        }
        return  pos;
    }

// find the union of two sorted array.

    /*
    Input:n = 5,m = 5 arr1[] = {1,2,3,4,5}  arr2[] = {2,3,4,4,5}
Output: {1,2,3,4,5}
Explanation: Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5}

Input:n = 10,m = 7,arr1[] = {1,2,3,4,5,6,7,8,9,10}arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}
Explanation: Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1,6,7,8,9,10
Distnict Elemennts in arr2 are : 11,12
Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12}
     */
   public static Set<Integer> unionOfArray(int[] arr1, int[] arr2) {
       Set<Integer> union = new HashSet<>();
       if (arr1 != null) {
           for (int v : arr1) union.add(v);
       }
       if (arr2 != null) {
           for (int v : arr2) union.add(v);
       }
       for (int v : union) {
           System.out.print(v + " ");
       }
       return union;
   }
   /*
   Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. This array represents a permutation of the integers from 1 to n with one element missing. Find the missing element in the array.

Examples:

Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
    */

  public static int findMissingNumber(int[] arr) {
//      SortingUtils.insertionSort(arr);
      // expected length of the array is equal to 1 more then the current length
      int n = arr.length + 1;
      int realsum = 0;
      // sum of all natural number from 1 to n is n*(n+1)/2
      int expectedSum = (n*(n+1))/2;
      for (int i : arr) {
          realsum+=i;
      }
      System.out.println(expectedSum + " " + realsum);
      return expectedSum - realsum;
  }
  /*
  Count Maximum Consecutive One's in the array
  Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Example 2:
Input: prices = {1, 0, 1, 1, 0, 1}
Output: 2
Explanation: There are two consecutive 1's in the array.
   */
    public static int consecutiveOnes(int[] arr) {
    int count  = 0;
    int maxi = 0;
     for (int i = 0; i < arr.length; i++) {
         if (arr[i] == 1) {
             count++;
         } else {
             count = 0;
         }
         // if count is greater then maxi update maxi
         maxi = Math.max(maxi,count);
     }
     return maxi;
    }

    /*
    Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.


Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
     */
    static int findNumberOccur1s(int[] arr) {
        int count = 1;
        int resutl = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] == arr[j+1]) {
                    count++;

                }
            }
            if (count == 1) {
                resutl = arr[i];
                break;
            }
        }
        return  resutl;
    }

}


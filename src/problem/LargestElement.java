package problem;

public class LargestElement {
    // find the largest Element from the array
    public static void main(String[] args) {
//      int[] arr = {1,2,3,5,7,10,11,15};
    int[] arr  = {1, 2, 4, 7, 7, 7};
//    sort(arr);
//    for(int i: arr) {
//        System.out.println(i);
//    }
//        System.out.println("largest Element is:"+ arr[arr.length-1]);
//        System.out.println("The max value in the array is: " + maxValue(arr));
//        System.out.println("The second largest element is " + secondLargest(arr);
//        System.out.print("The two number whose sum is 15: " );
//        for (int i : twoSum(arr,15)) System.out.print(i+" ");
        findElement(arr);
    }

    // how to proceed
    // first apporach sort this array
    static  void sort(int[] arr) {
        boolean isSorted = false;
        for (int i =0; i < arr.length; i++) {
            for (int j= 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = true;
                }
            }
            if(!isSorted) {
                break;
            }
        }
    }

    // second approach
    static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // find second largest element in the arry
    // approach 1 sort the array time complexity O(n)
    static int secondLargest(int[] arr) {
        // check the last element before the second largest until it is not same to the last element if
        // not same return the element
        int secondLargest = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == arr[i-1]) {
                continue;
            }
            secondLargest = arr[i - 1];
            break;
        }
        return secondLargest;
    }

    // optimal solution to find second largest Element
    // two understand two pointer technique let do some problem
    // array of two element equal to a specific value.
    static int[] twoSum(int[] arr, int targer) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if(currentSum == targer) {
                return new int[]{arr[left], arr[right]};
            }
            else if (currentSum < targer) {
                left++;
            } else {
                right--;
            }

        }
        return new int[]{left, right};
    }
    // find smallest , second smallest largest and second largest
    static void findElement(int[] arr) {
        // here i have to find smallelst , second smallest , largest , second largest
        int small = Integer.MAX_VALUE, second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;

        // First pass: Find the absolute largest and smallest
        for (int i =  0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            } 
            if (arr[i] < small) {
                small = arr[i];
            }
        }

        System.out.println("Largest Element is : " + large + " Smallest Element is: " + small);
        
        // Second pass: Find the second smallest and second largest
        for (int num : arr) {
            // update second minimums
            if (num < second_small && num > small) {
                second_small = num;
            }

            // update second maximums
            if (num > second_large && num < large) {
                second_large = num;
            }
        }
        
        // Handle edge cases where a second largest or second smallest doesn't exist
        if (second_small == Integer.MAX_VALUE) System.out.println("No second smallest exists.");
        else System.out.println("Second small number is: " + second_small);
        
        if (second_large == Integer.MIN_VALUE) System.out.println("No second largest exists.");
        else System.out.println("Second Large Number is: " + second_large);
    }

}
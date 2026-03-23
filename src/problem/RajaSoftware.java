package problem;

import java.util.Scanner;

public class RajaSoftware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");

        int n = sc.nextInt();
        int[] nums = new  int[n];
        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

//        int[] arr1 = {2,2,1};
//        System.out.println("Output: " + singleNumber(arr1) );
//        // second array
//        int [] arr2 = {4,1,2,1,2};
//        System.out.println("Output: " + singleNumber(arr2));
        System.out.println("Output: "+ singleNumber(nums));
    }
    // Determine the element that appers only once.
    public static int singleNumber (int[] nums) {
        int result  = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

}

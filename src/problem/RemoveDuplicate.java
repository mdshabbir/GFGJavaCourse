package problem;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take user input as array of number in String
        String[] st = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[st.length];

         for (int i = 0; i < arr.length; i++) {
             arr[i] = Integer.parseInt(st[i]);
         }
         int[] newArr = removeDuplicate(arr);
         // Note: newArr might contain trailing zeros if duplicates were removed.
         // You might want to print only up to the number of unique elements.
         for(int i: newArr) System.out.println(i);


    }
    // first method to remove duplicate by taking new array
    public  static int[] removeDuplicate (int[] arr ) {
        if (arr.length == 0) return new int[0];
        
        int[] number = new int[arr.length];
        int curr = arr[0];
        number[0] = arr[0];
        int index = 1; // Need an independent index to insert into the new array
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != curr) {
                number[index] = arr[i];
                curr = arr[i];
                index++;
            }
        }
        
        // Optional: If you want to return an array of exactly the right size
        // int[] result = new int[index];
        // System.arraycopy(number, 0, result, 0, index);
        // return result;
        
        return number;
    }
}
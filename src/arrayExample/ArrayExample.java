package arrayExample;

import java.util.Scanner;
public class ArrayExample {
    public static void main(String[] args) {
        // create an array get input form the user.
        Scanner sc = new Scanner(System.in);
        // get the lenght of the array
        System.out.println("Please Enter the lenght of the Array");
        int len = sc.nextInt();
        // take the arrayElement input from the user:
        // declar and intialize an array with 0 element
        int [] arr = new int[len];

        for(int i=0; i<len; i++){
            System.out.println("Please Enter the "+i+"element");
            arr[i] = sc.nextInt();

        }
        // please get the first index of the the array
        System.out.println("Please enter the firstIndex");
        int firstIndex = sc.nextInt();
        // please get the second index from the user;
        System.out.println("Please Enter the second index");
        int secondIndex = sc.nextInt();
        // muliply the element of array with the corresponding index;
        int result = arr[firstIndex]*arr[secondIndex];
        System.out.println(result);
    }
}

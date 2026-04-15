package oneDArray;

import sorting.SortingUtils;

import java.util.Scanner;

public class Main {
    // please gake input from the user to input the marks of  the studnet
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        getUserMarks(size);

    }
    public static void getUserMarks(int size) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the " + (i + 1) + "Student marks: ");
            marks[i] = sc.nextInt();
        }
        for (int n : marks) {
                int i = 1;
                System.out.println("The " + i + " stuent marks: " + n);
                i++;
        }
    }

}

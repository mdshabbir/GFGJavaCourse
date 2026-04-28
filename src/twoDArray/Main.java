package twoDArray;

import java.util.Random;
import java.util.Scanner;

public class Main {

    // 2D array is an array of array in which we store the data in table like format
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number of Student: ");
        int student = sc.nextInt();
        System.out.println("Please Enter the number of Subject: ");
        int totalSubject = sc.nextInt();
        for (int i = 0; i < totalSubject; i++) {
            System.out.println("Please Enter the " + (i + 1) + " Subject");
//            String
        }
        // take marks from the user user in each subject sscore by the student :
//        String[] subject = {sub1,sub2,sub3,sub4};
        int[][] marks = new int[student][totalSubject];
        int max = 100;
        int min = 30;
        for (int i = 0; i<student; i++) {
            // use 2d array store the marks of each subject of each student
                for (int j  = 0; j < totalSubject; j++) {
                    System.out.println("Please Enter the marks socre by: " + (i + 1) + " Student " + "in " );
                    marks[i][j] = (int)(Math.random() * ((max - min) + 1)) + min;
                }
        }
//        printMarks(subject, marks);
    }
    public static void printMarks(String[] subject, int[][] marks) {
        System.out.print("          ");
        for (String sub : subject) {
            System.out.print(sub + "  " + "\t");
        }
        System.out.println();

        int studentNumber = 1;
        for (int[] studentMarks : marks) {
            System.out.print("Student " + studentNumber + " : ");
            for (int mark : studentMarks) {
                System.out.print(mark + "   "   + "\t");
            }
            System.out.println();
            studentNumber++;
        }
    }
}

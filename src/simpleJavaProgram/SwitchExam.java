package simpleJavaProgram;

import java.util.Scanner;

public class SwitchExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int number = sc.nextInt();
            System.out.println(Utility(number));

        }
        sc.close();

    }

    public static String Utility(int number){
        switch (number){
            case 1: return "One";
            case 2: return "Two";
            default: return "Unknown";


        }


    }
}

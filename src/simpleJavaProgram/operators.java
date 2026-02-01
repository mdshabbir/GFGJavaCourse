package simpleJavaProgram;

import java.util.Scanner;

public class operators {

    public static void main(String[] args) {
        // bitwise operators
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int a = sc.nextInt();
        System.out.println("Please Enter the second number");
        int b = sc.nextInt();
        var result = a | b;
        System.out.println(result);

    }
}

package simpleJavaProgram;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class Stringexam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // scanner class is used to get input from user
        // here we are creating an object of scanner class to apply diffrent method
        // availabl in the scanner class.
        System.out.println("Please Enter the first number");
        String num1 = sc.next();
        System.out.println("Please Enter the second number:");
        String num2 = sc.next();
        sc.close();
        System.out.println(sum(num1, num2));

    }

    public static String sum(String a, String b) {
        int sum = 0;
        int l1 = a.length();
        int l2 = b.length();
        int size = Math.max(l1, l2);
        System.out.println(size);
        StringBuilder result = new StringBuilder();
        // System.out.println(result);

        int carry = 0;
        try {
            for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry != 0; i--, j--) {
                sum = a.charAt(i) - '0' + b.charAt(j) - '0' + carry;
                carry = 0;
                // System.out.println(sum);
                if (sum >= 10) {
                    carry = sum / 10;
                    sum = sum % 10;
                    // System.out.println("Carry" + carry);
                    result.append(sum);

                } else {
                    result.append(sum);

                }

            }
        } catch (Error e) {

            System.out.println(e);

        }

        return result.reverse().toString();
    }
}

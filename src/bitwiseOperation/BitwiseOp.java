package bitwiseOperation;

import java.util.Scanner;

class BitwiseOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the first Number:");
        var a = sc.nextInt();
        System.out.println("Please Enter the second Number:");
        var b = sc.nextInt();
        int result = a & b;
        System.out.println(result);
    }
}
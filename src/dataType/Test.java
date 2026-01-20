package dataType;

import java.util.Scanner;

class defualtValue {
    boolean instanceBoolean;

 void printValue( ){
        System.out.println(instanceBoolean);
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a);
//        float b = sc.nextFloat();
//        System.out.println(b);
//        double c = sc.nextDouble();
//        int ce = (int)c;
//        System.out.println(ce);
//        byte d = sc.nextByte();
//        System.out.println(d);
        System.out.println("Please Enter the String");
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();
    }
}

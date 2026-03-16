package problem;

import java.util.*;

// merge and sort unique element in array
public class Problem2 {

    // you have to take two array
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // take input of first array usint string
    String[] input1 = sc.nextLine().trim().split("\\s+");
    String[] input2 = sc.nextLine().trim().split("\\s+");
    TreeSet<Integer> set = new TreeSet<>();
    for(String s: input1) set.add(Integer.parseInt(s));
    for(String s: input2) set.add(Integer.parseInt(s));
    System.out.print("Merged and sorted Unique array: " + set.toString().replace("{","[").replace("}","]"));
    }

}

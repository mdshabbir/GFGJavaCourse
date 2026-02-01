package collectionExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareValue {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<Integer>();
        for(int i=0; i<5; i++){
            // Add item to the list
            System.out.println("Pleasae Enter the "+(i+1)+"Number");
            l1.add(sc.nextInt());
        }
        // print the smallest and largest number from list
        int smallestNum =l1.get(0);
        int largestNum = l1.get(0);
        for(int i: l1){
            if(i>smallestNum){
                
            }
        }
    }
}

package collectionExam;

import java.util.*;

public class ArrayLIst {
    public static void main(String[] args) {
        // create and print arrayList and add some color in the String format
        // Collections is a helping tool class for collection framework which provide many function which is used to
        // calculate the max, sort the  collection and many more thing.
        List<String>  color = new ArrayList<String>();
        String arr [] = {"Red","Blue","Grenn","Orange","Pink"};
        Collections.addAll(color,arr);
        for(String col : color){
            System.out.println(col);
        }
       color.add(0,"Yellow");
        color.add(color.size(),"Black");
        System.out.println(color);
        System.out.println(color.get(color.size() - 1));
        System.out.println(color.set(0,"Brown"));
        System.out.println(color);
        System.out.println(color.contains("Green"));
        System.out.println(color.contains("Black"));
        Collections.sort(color);
        System.out.println(color);
        Integer[] num = { 1, 2, 3, 5, 10,200,30,40};
        List<Integer> num1 = new ArrayList<Integer>();

//        for (int n : num){
//            num1.add(n);
//        }
//        System.out.println(num1);
     Collections.addAll(num1,num) ;
        System.out.println(num1);
       num1.toString();

        List<String> str = new ArrayList<>(
                num1.stream().map(String::valueOf).toList()
        )  ;
        System.out.println(str);


        color.addAll(str);
        System.out.println(color);
        System.out.println();
        Collections.shuffle(color);
        System.out.println(color);
        Collections.sort(color);
        System.out.println(color);
        System.out.println(color.subList(1,10));
        Collections.shuffle(color);
        System.out.println(color.subList(3,10));
         Collections.sort(color);
         Collections.reverse(color);

        System.out.println(color);
        Collections.swap(str,1,2);
        System.out.println(str);
        List<String>  join = new ArrayList<>();
        join.addAll(str);
        join.addAll(color);
        System.out.println(join);




    }

}

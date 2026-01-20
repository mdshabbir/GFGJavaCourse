package collectionExam;


import java.util.ArrayList;
import java.util.Collection;

public class MyCollection {

    static public  void main(String[] args) {
        // different type of Collection present in Java Collection framework
        // what is difference between collection and Collections
        /*
               iterable (I)
                  | 
                  |
             Collection(I)
                  |
         _________|_________________________
        |                  |               |
       List (I)           Set(I)       (I)Queue
      1. ArrayList       1.Hashset
      2. LinkedList      2.LinkeHashSet
      3. Vector          3.



         */
        Collection c1 = new ArrayList();
        c1.add(10);
        c1.add("Tree");
        c1.add(true);
        System.out.println(c1);
        for (int i = 0; i < c1.size(); i++) {
            System.out.println(c1);
        }


    }
}

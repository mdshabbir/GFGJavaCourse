package collectionExam;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l1 = new LinkedList<>();
        String[] name = { "Shabbir", "Tauqir", "Rizwana", "Safura", "amal" };

        // for(int i=0; i<10; i++){
        // l1.add(sc.next());
        // }
        Collections.addAll(l1, name);

        System.out.println(l1);
        for (String st : l1) {
            System.out.println(st);
        }
        for (int i = 2; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println("Iterator method is working.");
        Iterator p = l1.listIterator(2);
        while (p.hasNext()) {
            System.out.println(p.next());
        }
        System.out.println("Print all alement using Iterator");

        Iterator<String> name1 = l1.listIterator();
        for (String st1 : name) {

        }
    }
}

package collectionExam;

import java.util.*;

public class LinkedListImp {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        // System.out.println(l1);
        Collections.shuffle(l1);
        System.out.println(l1);
        Node n = new Node(l1.getFirst());
        System.out.println(n.next);

    }

    public static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

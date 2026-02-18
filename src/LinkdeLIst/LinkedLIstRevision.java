package LinkdeLIst;

import java.util.LinkedList;
import java.util.List;

public class LinkedLIstRevision {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 3, 59, 399, 289 };
        Node head = new Node(arr[0]);
        System.out.println(head.data);
        head = createLinkedList(head, arr);
        print(head);
        List<Integer> l1 = new LinkedList<Integer>();
        System.out.println(head);

    }

    // create a function to create a linkedlist
    public static Node createLinkedList(Node head, int[] arr) {
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;

        }
        return head;
    }

    // create a method to print this linked List
    public static void print(Node head) {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
            if (temp.next == null) {
                System.out.println(temp.data);
            }
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
}

package collectionExam;

import java.util.Scanner;

public class DeleteLL {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60 };
        Node head = new Node(arr[0]);
        Node curr = head;
        // System.out.println(curr.data);
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
            // System.out.println(curr.data);

        }
        // System.out.println(head.data);
        head = deleteLL(head);
        printLL(head);

    }

    static void printLL(Node n) {
        Node curNode = n;
        while (curNode != null) {
            System.out.println(curNode.data);
            curNode = curNode.next;

        }

    }

    static Node deleteLL(Node head) {
        Node temp = head;
        head = head.next;
        return head;
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
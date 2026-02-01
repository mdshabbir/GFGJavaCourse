package collectionExam;

import java.util.Collections;

class LinkedListCreation {
    public static void main(String[] args) {
        // create a linked list from an array or from input
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node current = head;
        // while (current != null) {
        // System.out.println(current.data);
        // current = current.next;
        // }
        // System.out.println(length(head));
        // System.out.println(checkElement(head, 50));
        // System.out.println(head.next);
        // head = delLastLL(head);
        // head = delFirstLL(head);
        //
        // head = deleteKNode(head, 3);
        printLL(head);

    }

    static Node delFirstLL(Node head) {
        Node temp = head;
        if (temp == null || temp.next == null) {
            return temp;
        }
        temp = temp.next;
        return temp;

    }

    static void printLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;

        }
    }

    static int length(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
            count++;
        }
        return count;
    }

    static int checkElement(Node head, int a) {
        Node current = head;
        while (current != null) {
            if (current.data == a) {
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }

    static Node deleteKNode(Node head, int k) {
        int count = 0;
        if (k == 1) {
            head = delFirstLL(head);
        }
        Node temp = head;
        while (temp.next != null) {
            count++;
            if (count == k) {
                temp.next = temp.next.next;

            }
            temp = temp.next;

        }

        return head;
    }

    static Node delLastLL(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
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
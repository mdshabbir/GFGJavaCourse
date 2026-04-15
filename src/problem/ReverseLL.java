package problem;

import java.util.Scanner;

public class ReverseLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] st = sc.nextLine().trim().split("\\s+");
        Node head = null , tail = null;
        for(String s : st) {
            Node newNode = new Node(Integer.parseInt(s));
            if(head == null) {
                head = newNode;
                tail = newNode;

            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
      head = reverseLL(head);

        printLL(head);



    }
    public static Node reverseLL (Node head) {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public static Node createLL(Node head , int[] arr) {
        Node temp = head;
         int i = 1;
        while(temp != null && i < arr.length) {
          temp.next = new Node(arr[i]);
          i++;
          temp = temp.next;
        }
        return  head;
    }
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

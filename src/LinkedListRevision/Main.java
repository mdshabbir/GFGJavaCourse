package LinkedListRevision;

public class Main {
    static int[] arr = {1,23,32,4,23,45};
    // i have to convert this into linked list;
    public static void main(String[] args) {
        Node head = convertToLL(arr);
//        printlLL(head);
        System.out.println("The length of the linkedList is: " + lengthOfLL(head));
        System.out.println("1 is present in the linkedlist or not: "  + isPresent(head,64));

        // deletetion and insertion in linked list:

    }
    public static Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    public static void printlLL(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static int lengthOfLL(Node head) {
        int len = 0;
        while (head != null) {
            len ++;
            head = head.next;
        }
        return len;
    }
    // check if element is present in the linkedlist or not
    public static boolean isPresent(Node head, int data) {
        while (head != null) {
            if(head.data == data)  return  true;
            head = head.next;
        }
        return  false;
    }
}
class Node {
    int data;
    Node next;
    Node(int data1 , Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

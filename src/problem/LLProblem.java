package problem;

public class LLProblem {
    public static void main(String[] args) {
        // Question no 1 write a program to remove kth node of a linkedList
        // let take an array and convert it into linkedList
        // Question no 2 : Find the middle node of the linked list;
        // Question no 3 : count occourance of element

        int[] arr = {10,40,80,23,52,43,40,10,80};
        Node head = new Node(arr[0]);
        head = createLL(head,arr);
//        System.out.println(size(head));
//        head = deleteKthNode(head,5);
        System.out.println(findMiddle(head));
//        printLL(head);
        System.out.println(count(head,80));
    }
  static   Node createLL (Node head , int[] arr) {
        Node temp = head;

        for(int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
//            System.out.println(temp.data);
            temp = temp.next;
        }
      return  head;
    }
    static int size(Node head) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return  size;
    }
    static void printLL (Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    static Node deleteKthNode (Node head , int k) {
        Node temp = head;
        int i = 1;
        Node prev = temp;
        if(temp == null) {
            System.out.println("Node is Empty!");
            return  null;
        }
        if(k == 1) {
            return  temp = temp.next;
        }
        while (temp != null) {
            i++;
            temp = temp.next;
           if (i == k) {
              prev.next = temp.next;
              break;
           }
           prev = prev.next;


        }
        return  head;
    }
    // to find middle node of linkedlist let create a method
    static int findMiddle(Node head) {
        Node temp = head;
        int count = 1;
        int mid = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if(count % 2 == 0) {
            mid = count/2;
        }
        else {
            mid = count/2 + 1;
        }

        return  Nodedata(head,mid);
    }
    static int Nodedata ( Node head,int k) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if(count == k) {

                break;
            }
            temp = temp.next;

        }
        return  temp.data;

    }
    // define a method to count occurrence of element in linkedList
    static int count (Node head , int key ) {
        if(head == null) {
            return  0;
        }
        int ans = count(head.next , key);
        if(head.data == key) {
            ans++;
        }
        return  ans;
    }
}
class Node {
    int data;
    Node next;
    Node( int data) {
        this.data = data;
        this.next = null;
    }
}

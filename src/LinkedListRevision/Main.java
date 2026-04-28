package LinkedListRevision;

public class Main {
    static int[] arr = {1,23,32,4,23,45};
    // i have to convert this into linked list;
    public static void main(String[] args) {
        Node head = convertToLL(arr);
//        printlLL(head);
        Node head1 = deletKthNode(head,5);
        printlLL(head1);
//        printlLL(tail);
        // deletetion and insertion in linked list:

        // delete the Kth node of the LinkedList


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
    public static int sizeOfLL(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return  count;
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
    // delete head
    public static  Node deleteHead(Node head) {
        Node temp = head;
        return  temp.next;
    }
    // delete tail
    public static Node deleteTail(Node head) {
        Node temp = head;
        while (temp!= null) {
            if(temp.next.next == null) {
              temp.next = null;
                break;
            }
            temp = temp.next;
        }
        return  head;
    }

    public static Node deletKthNode(Node head, int pos) {
        Node temp = head;
        for (int i = 1; i < sizeOfLL(head); i++) {
            if(i == pos-1) {
               temp.next = temp.next.next;
               continue;
            }
            temp = temp.next;
        }
        return  head;
    }

}
class Node {
    int data;
    Node next;
    Node prev;
    Node(int data1 , Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

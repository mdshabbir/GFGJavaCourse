package LinkedListRevision;
import DoublyLL.DoublyLLRevision;

import java.util.Stack;

public class Main {
    static int[] arr = {1, 23, 32, 4, 23, 45};

    // i have to convert this into linked list;
    public static void main(String[] args) {
        Node head = convertToLL(arr);
         DoublyLL.Node head1 = new DoublyLL.Node(arr[0]);

         DoublyLLRevision dl = new DoublyLLRevision();
      dl.createDoublyLL(head1,arr);
         dl.printDLL(head1);
//         isPalindrome(head1,arr);


//       Node head1= insertAtKthNode(head,6,100);
//        printlLL(head1);
//        printlLL(tail);
        // deletetion and insertion in linked list:

        // delete the Kth node of the LinkedList
        // insert element at head.

//        System.out.println(middleOfLL(head));
//        Node head1 = reverseLinkList(head);
//        printlLL(head1);

//        System.out.println(isPalindrome(head));



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
        return count;
    }

    public static int lengthOfLL(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    // check if element is present in the linkedlist or not
    public static boolean isPresent(Node head, int data) {
        while (head != null) {
            if (head.data == data) return true;
            head = head.next;
        }
        return false;
    }

    // delete head
    public static Node deleteHead(Node head) {
        Node temp = head;
        return temp.next;
    }

    // delete tail
    public static Node deleteTail(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.next.next == null) {
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node deletKthNode(Node head, int pos) {
        Node temp = head;
        for (int i = 1; i < sizeOfLL(head); i++) {
            if (i == pos - 1) {
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node insertAtHead(Node head, int value) {

        Node temp = new Node(value);
        temp.next = head;
        return temp;
    }

    public static Node insertAtTail(Node head, int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                temp.next = new Node(value);
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node insertAtKthNode(Node head, int pos, int value) {
        Node temp = head;
        Node mover = temp.next;
        for (int i = 1; i < lengthOfLL(head); i++) {
            if (i == pos - 1) {
                temp.next = new Node(value);
                temp.next.next = mover;
                continue;
            }
            mover = mover.next;
            temp = temp.next;
        }
        return head;
    }

//    public static int middleOfLL(Node head) {
//        // middle of the linked list if the length of the ll is odd is n/2 + 1
//        // middle of the linked list if  the length of the ll is even is n/2
//        int middle;
//        if (lengthOfLL(head) % 2 == 0) {
//            middle = findMidle(head, lengthOfLL(head) / 2);
//        } else {
//            middle = findMidle(head, (lengthOfLL(head) / 2 + 1));
//        }
//        return middle;
//    }

    public static Node findMidle(Node head, int n) {
        Node temp = head;
        for (int i = 1; i < n; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // reverse a linkedlist iterative.
    public static Node reverseLL(Node head) {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (!stack.isEmpty()) {
            temp.data= stack.pop();
            temp = temp.next;
        }
        return head;
    }
    public static Node reverseLinkList(Node head) {
        Node temp = head;
        Node prev = null;
        Node front;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return  prev;
    }

    // check if linkedList is palindrome or not.
    public static boolean isPalindrome(Node head1, int arr) {
        boolean result;
        if(lengthOfLL(head1) == 0 || lengthOfLL(head1) % 2 == 0) {
            return false;
        }
        Node middle = findMidle(head1,arr);
        Node secondHalfhead = middle.next;
        middle.next = null;
        Node reverseLLHead = reverseLL(head1);
        printlLL(head1);
        printlLL(reverseLLHead);

        return true;
    }
}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

package LinkdeLIst;

public class SumOfLinkedList extends LinkedLIstRevision {
    public static void main(String[] args) {

        // first of all create two linked list with my own linkedList class not java
        // linked List class

        int[] num1 = {2, 4, 6};
        int[] num2 = {3, 8, 7};

        // create a linkedList by using two head
        Node head1 = new Node(num1[0]);
        Node head2 = new Node(num2[0]);
        createLinkedList(head1, num1);
        createLinkedList(head2, num2);
        // print(head2);
        // print(head1);
        Node head = SumofTwoLL(head1, head2);
        System.out.println(head.data);
        print(head);

    }

    // @SuppressWarnings("null")
    public static Node SumofTwoLL(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummy = new Node(-1);
        Node curr = dummy;
        int carry = 0;
        // Node newNode = new Node((temp1.data+temp2.data)%10);
        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }
//            carry = sum/10;
//            if (temp1.next == null && temp2.next == null) {
//                newNode = new Node(carry);
//                curr.next = newNode;
//                break;
//            }
            curr.next = new Node(sum % 10);
            curr = curr.next;

        }

        return dummy.next;
    }

}

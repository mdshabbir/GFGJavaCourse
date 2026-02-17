package DoublyLL;

import java.util.Stack;

public class DLLOperation extends  DoublyLLRevison {
    public void printArray() {
        int[] arr = getNumbers();

    }
        public static void main (String[]args){
             DLLOperation  dl = new DLLOperation();
             Node head = new Node(dl.arr[0]);
          head = createDoublyLL(head,dl.arr);
//            head = reverseDLL(head);
            head = reverseDLLbyreference(head);
          printDLL(head);



        }
        // what you have to do you have to reverse the linked list
       public  static Node reverseDLL(Node head){
        Node temp = head;
        Node temp1 = head;
           Stack<Integer> s = new Stack<Integer>();
           while (temp !=null){
               s.push(temp.data);
               temp = temp.next;
           }
           while (temp1 != null){
               temp1.data = s.pop();
               temp1 = temp1.next;
           }
        return head;
       }
       public static Node reverseDLLbyreference(Node head){
        Node cur = head;
        Node newHead = null;

        while (cur !=null){
          Node temp = cur.next;
          cur.next = cur.back;

          // update the new head
            newHead = cur;
            cur = temp;
        }

        return  newHead;
       }

    }



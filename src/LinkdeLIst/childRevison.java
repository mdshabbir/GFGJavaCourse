package LinkdeLIst;

public class childRevison extends LinkedLIstRevision{

    public static void main(String[] args) {
      int[] arr = {10,20,30,40,50};
      Node head = new Node(arr[0]);
      head = createLinkedList(head,arr);
//      print(head);
//     head = deletFirst(head);
//      print(head);
//      head = deleteLastElement(head);
        head = deleteKthNode(head,2);


      print(head);

    }
    // create a method to delete first element from linked list and then print it
    public  static Node deletFirst(Node head){
        Node temp = head;
        // manage edge clases
        if(temp.next == null || temp == null){
            return null;
        }
        temp = temp.next;
        return  temp;
    }
    public static Node deleteLastElement(Node head){
        // to access last element we have to traverse linkedlist till last.
          Node temp = head;
          Node mover = temp.next;
          while (temp.next !=null){
              temp=temp.next;
              mover=mover.next;
              if(mover.next == null){
                  temp.next = null;
                  break;
              }
          }
        return head;
    }
    // now you have to delete the kth element of the linkedlist
    // here edge cases are same if the ll contian 0 element or only one node.
    // so late make the method to delete the kth element
    public  static Node deleteKthNode(Node head , int k){
        // let a preivous not which is equal to prev
        Node curr = head;
        Node mover = curr.next;
        int count =0;
        if( k==1){
           return  deletFirst(curr);
        }

        while (curr.next !=null){
            count++;
            if(count == k){
                curr.next = mover.next;
                return head;
            }
             curr = curr.next;
            mover = mover.next;


        }

        return  head;
    }
}

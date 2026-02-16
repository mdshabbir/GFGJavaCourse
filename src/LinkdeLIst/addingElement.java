package LinkdeLIst;

public class addingElement extends LinkedLIstRevision{

    public static void main(String[] args) {
        int [] arr = {10,240,20,304,34,35};
        Node head = new Node(arr[0]);
        head = createLinkedList(head,arr);
//        head = inserAtHead(head,38);
//        head = insertElementAtTail(head ,56);
        head = insertAtkthpostition(head , 57,7);
        print(head);
    }
    // create a method to insert element at head :
    public  static Node inserAtHead(Node head , int val){
        Node temp = head;
        Node n1 = new Node(val);
        if(temp == null){
            return  head = n1;
        }
        while (temp.next != null){
            n1.next = temp;
            head = n1;
            break;

        }
        return  head;
    }
    // insert Element at Tail
    public static Node insertElementAtTail(Node head, int val){
        Node n1 = new Node(val);
        Node temp = head;

        if(temp == null){
            return head = n1;
        }
        while (temp.next !=null){
            temp = temp.next;
          if(temp.next == null){
              temp.next = n1;
              break;
          }
        }
        return  head;
    }
    // insert Element at kth position or kth node
    public static Node insertAtkthpostition(Node head , int val,int pos){
        // first of all here we identify the postion where i want to insert then link it to the next and prev
         Node    n1 = new Node(val);
         Node temp = head;
         Node mover = temp.next;
         int count =2;
         if(temp.next == null || pos ==1){
             return  head = inserAtHead(temp,val);
         }
         while (temp.next != null){
              if(count == pos){
                  temp.next = n1;
                  n1.next = mover;
                  break;
              }
              temp = temp.next;
              mover = mover.next;
              count++;
         }
        return head ;
    }
}

package DoublyLL;

import LinkdeLIst.LinkedLIstRevision;

public class DoublyLLRevison extends LinkedLIstRevision {
    public static void main(String[] args) {
        int [] arr = {10,24,243,52,34,234,543,256,244};
        // create doubly LL
        Node head = new Node(arr[0]);
        // crete a doubly linkedLIst
        head = createDoublyLL(head,arr);



    }
    public static Node createDoublyLL(Node head,int [] arr){
        Node temp = head;
        System.out.println(arr.length);
        for(int i=1; i< arr.length; i++){
            temp.next =  new Node(arr[i]);
            temp.next.back = temp;
            System.out.println(temp.data);
//            if(temp.back != null){
//                System.out.println(temp.back.data);
//            }
            temp = temp.next;

        }

        return  head;
    }


}
class Node {
    int data ;
    Node next;
    Node back;
    Node(int data, Node next1 , Node back1){
        this.data=data;
        this.next = next1;
        this.back = back1;
    }
    Node (int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
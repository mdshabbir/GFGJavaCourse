package DoublyLL;

import LinkdeLIst.LinkedLIstRevision;

public class DoublyLLRevison extends LinkedLIstRevision {



    protected  int [] arr = {10,24,243,52,34,234,543,256,244};
    public int[] getNumbers() {
        return arr;
    }

    public static void main(String[] args) {
        DoublyLLRevison  obj = new DoublyLLRevison();
        // create doubly LL
        Node head = new Node(obj.arr[0]);
        // crete a doubly linkedLIst
        head = createDoublyLL(head,obj.arr);
        System.out.println(head.data);
        System.out.println(head.next);
        printDLL(head);



    }

    // make a method to print the double linkedList
    public   static void printDLL (Node head ){
        Node temp = head;
       while (temp != null){
           System.out.println(temp.data);
           temp = temp.next;
       }
    }
    public static Node createDoublyLL(Node head,int [] arr){
        Node temp = head;
        Node prev = temp;
        for(int i=1; i<arr.length; i++){
            temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
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
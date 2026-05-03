package DoublyLL;

public class Node {
    int data ;
    Node next;
    Node back;
    Node(int data, Node next1 , Node back1){
        this.data=data;
        this.next = next1;
        this.back = back1;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

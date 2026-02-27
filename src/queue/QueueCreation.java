package queue;

import java.util.Stack;

public class QueueCreation {
    public static void main(String[] args) {
//        myQueue arr = new myQueue(4);
//        arr.enqueue(10);
//        arr.enqueue(20);
//        arr.enqueue(40);
//        arr.print();
//        arr.dequeue();
//        arr.enqueue(10,true);
//        arr.enqueue(20,true);
//        arr.enqueue(30,true);
////        arr.dequeue(true);
////        arr.dequeue(true);
//        System.out.println(arr.peak());
//        System.out.println(arr.size());
//        arr.print();
        myQueue q = new myQueue();
        q.push(10,true);
        q.push(20,true);
        q.push(30,true);
        q.pop(true);
        System.out.println(q.top(true));

    }

}
class myQueue <T> {
    private  int capacity;
    private int size;
    private int[] arr;
    private  Node front;
    private  Node rear;
    Stack<Integer>  s1 = new Stack<>();
    Stack<Integer>  s2 = new Stack<>();

    Stack<Integer> input = new Stack<Integer>();
    Stack <Integer> output = new Stack<>();

    void push (int x, boolean stack) {
        input.push(x);

    }
    void pop (boolean stack) {
        if(!output.isEmpty()) {
            output.pop();
        } else {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
            output.pop();
        }
    }
    // peek operation to return top
    int top (boolean stack) {
        if(!output.isEmpty()) {
          return   output.peek();
        } else {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
           return output.peek();
        }
    }

    public void enqueue (int x ,boolean stack) {
        // move all element from s1 to s2
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        // push the new element to s1
        s1.push(x);
        // move everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    // dequeue operation to remove element from queue
    public  void dequeue (boolean stack) {
        if(s1.isEmpty()) {
            System.out.println("Stack is underflow!");
            return;
        }
      s1.pop();

    }
    // get front element from the queue
    int peak () {
        if(s1.isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return s1.peek();
    }
    // want to get the size of the stack
    int size() {
        return s1.size();
    }

    public myQueue(int capacity) {
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];
    }

    public myQueue () {
        front = rear = null;
    }
    // to push the element using linkedlist implementation
    public void push (int x) {
        int count  = 0;
        Node temp = new Node(x);


    }
   public  boolean isEmpty() {
        return size == 0;
   }
   public  boolean isFull () {
        return size == capacity -1;
   }
   // enqueue operation to insert element in queue
    public  void enqueue(int x) {
        if(isFull()){
            System.out.println("Enque is Full");
            return;
        }
        arr[size] = x;
        size ++;
    }
    // remove element from a queue
    public  void dequeue () {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        }
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }
    // get top element means first element so it's follow fifo
    public  int getFirst () {
        return arr[0];
    }
    // get last element
    public  int getLast () {
        return arr[size - 1];
    }
    // get size of the enqueur
    public int getSize () {
        return size;
    }
    // print queue
    public  void print() {
        while (size >= 0) {
            System.out.println(arr[size]);
            size--;

        }
    }
}
 class Node {
    int data ;
    Node next ;
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

package stack;

import java.util.ArrayList;

public class myStackRevison {
    public static void main(String[] args) {
        myStackImpl  s = new myStackImpl(5);


    }
}
class myStackImpl {
    int capacity;
    int top;
    private int[] arr;
    ArrayList<Integer>  Array = new ArrayList<Integer>();
    private Node pot;
    int count;
    myStackImpl() {
        pot = null;
        count = 0;
    }
    void push ( int x , boolean list) {
        Node temp = new Node(x);
        temp.next = pot;
        pot = temp;
        count++;
    }
    // pop Operation for stack to be implemented by linkedlist
    int pop (boolean list){
        Node temp = pot;
        pot.next = pot;
        return  temp.data;
    }

   void push1 (int x) {
       Array.add(x);
   }
   public int pop1 () {
       if(Array.isEmpty()) {
           System.out.println("Stack underflow !");
           return  -1;
       }
       int val = Array.get(Array.size() -1);
       Array.remove(Array.size()-1);
       return  val;
   }


  public  myStackImpl(int cap) {
        this.capacity = cap;
        top = -1;
        // initilize a new array to store the value of the element
        arr = new  int[cap];
    }
    // push operation which is used to put the data into the stack
    public void push (int x) {
      if(top == capacity -1) {
          System.out.println("Stack over flow");
          return;
      }
      arr[++top] = x;

    }
    public int peak () {
      if(top == -1 ) {
          System.out.println("Stack is Empty!");
          return -1;
      }
      return  arr[top];
    }
    public  int pop () {
      if(top == -1 ) {
          System.out.println("Stack is underflow!");
          return -1;
      }
      int temp = top;
      top = top -1;
      return  arr[temp];
    }
    // check if the stack is empty or not
    public boolean isEmpty () {
      return top == -1;
    }
    // check if stack is full
    public  boolean isFull () {
      return top == capacity - 1;
    }
}


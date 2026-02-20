package stack;

import java.util.ArrayList;
import java.util.List;

public class StackCreation {
    public static void main(String[] args) {
//        myStack st = new myStack(10);
//        st.push(10);
//        st.push(20);
//        st.push(40);
//        st.push(50);
//        st.pop();
//        st.pop();
//        st.pop();
//        st.push(980);
//        System.out.println(st.size());
//        st.print();
//        stackImpl s = new stackImpl();
//        System.out.println(s.peak());
//        s.push(10);
        stackImplll s = new stackImplll();
        s.push(10);
        s.push(20);
        s.push(5);
//        s.printNode();
        System.out.println(s.peak());
        System.out.println(s.pop());
        System.out.println(s.pop());





    }
    public static void printStack () {

    }
}
class myStack {
    //  array to store element
    private int [] arr;
    // maximum size of the stack
    private int capacity;
    // index of the top element
    private  int top;
    // constructor
    myStack(int cap) {
        capacity = cap;
        arr = new  int[capacity];
        top = -1;
    }
    // push operation
    public  void push (int x) {
        if(top == capacity - 1) {
            System.out.println("Stack over flow");
            return;
        }
        arr[++top] = x;
    }
    // pop operation
    public int pop () {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return  arr[top--];
    }
    // peak (or top) operation
    public int peak () {
        if (top == -1) {
            System.out.println("Stack is empty");
            return  -1;
        }
        return  arr[top];
    }
    // check stack is empty
    public  boolean isEmpty () {
        return  top == -1;
    }
    // check if stack is full
    public  boolean isFull () {
        return top == capacity -1;
    }
    // check stack size
    public  int size () {
        return  top + 1;
    }
    // print stack
    public  void   print() {
        int i =0;
        while (i <= top) {
            System.out.println(arr[i]);
            i++;
        }
    }

}
class stackImpl {
    // creating stack using arrayList
    List<Integer> arr = new ArrayList<Integer>();
    // push operation
    public  void push(int x)  {
        arr.add(x);
    }
    // pop operation
    public  int pop() {
        if(arr.isEmpty()){
            System.out.println("Stack is underflow");
            return  -1;
        }
        int val = arr.get(arr.size() - 1);
        arr.remove(arr.size()-1);
        return val;
    }
    // top or peak element
    public int peak () {
        if(arr.isEmpty()){
            System.out.println("stack is empty");
            return  -1;
        }
        return arr.get(arr.size() -1);
    }
    boolean isEmpty () {
        return  arr.isEmpty();
    }
   // check current size
    int size() {
        return arr.size();
    }
}
class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}
class stackImplll {
    Node top;
    int count;
    stackImplll() {
        top = null;
        count = 0;
    }
    // push operation
    void push(int x) {
        Node temp = new Node(x);
        temp.next =top;
        top = temp;
        count++;
    }
    // pop operation
    // initially stack is empty
    int pop () {
        if(top == null)  {
            System.out.println("Stack is underflow");
            return  -1;
        }
        Node temp = top;
        top = top.next;
        int val = temp.data;
        count--;
        return  val;
    }
    // peak operation
    int peak () {
        if (top == null) {
            System.out.println("Stack is empty");
            return  -1;
        }
        return top.data;
    }
    // check if stack is empty
    boolean isEmpty() {
        return top == null;
    }
    int size () {
        return  count;
    }
   void printNode() {
        while (top != null) {
            System.out.println(top.data);
            top = top.next;
        }
    }
}

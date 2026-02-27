package stack;

import java.util.*;

public class stackImple {
    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.push(10);
        q.push(20);
        q.push(30);
        q.pop();
        q.push(30);
        q.push(40);
        q.printQueur();


    }
}
 class myQueue {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push (int x) {
        q2.add(x);

          // move all element from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap contents using a temporary queue
     Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

    }
    // removing the element from stack
     void pop () {
        if(q1.isEmpty()){
            System.out.println("Stack underflow !");
            return;
        }
        q1.remove();
     }
     // getting the first element
     int peak () {
        if(q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return  -1;
        }
        return  q1.peek();
     }
     void printQueur () {
        while (q1!=null){
            System.out.println(q1.peek());
            q1.remove();
        }
     }

 }

package multiThredingExample;

class ThreadClass extends Thread{
    public  ThreadClass(String str){
        super(str);
        setPriority(MAX_PRIORITY);
    }
    public  void run (){
        System.out.println("you are inside the run method");

    }
}
public class ThreadMethodExam  {
    /*
    Thread Mehtod
    1. get Id();
    2. getName();
    3. getState();
    4. getPriority();

    // Thread Constructor
     1. Thread()
     2. Thread(Runnable r)
     3. Thread(Runnable r, String)

     Instance Method as Well
     1. Start()
     2. run()
     3. wait()

     */
    public static void main(String[] args) {
       ThreadClass  obj = new ThreadClass("MY Thread-1");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        obj.start();



    }
}

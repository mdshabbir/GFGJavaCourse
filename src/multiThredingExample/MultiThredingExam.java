package multiThredingExample;

public class MultiThredingExam extends  Thread {
  public  void run (){
      for(int i=0; i<10000; i++){
          System.out.println(i);
      }
    }
    public static void main(String[] args) {
        MultiThredingExam obj = new MultiThredingExam();
        obj.start();
        for(int i=0; i<10000; i++){
            System.out.println("world");
        }

    }
}

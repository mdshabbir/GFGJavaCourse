package InterfaceExm;

public interface MyInterface {
    // Interface is a special type of class which contain only abstract class.
    int add(int a, int b);
    int substract(int a, int b);
    int multiply(int a, int b);
    int divide(int a,int b);

}
interface  I1 extends MyInterface {
  String myName();

}
class Myclass implements MyInterface{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int substract(int a, int b) {
     return a-b;
    }

    @Override
    public int multiply(int a, int b) {
      return a*b;
    }

    @Override
    public int divide(int a, int b) {
     return a/b;
    }

    public static void main(String[] args) {
        MyInterface  m2;
        m2 = new Myclass();
        try {  System.out.println(m2.add(10,20));
            System.out.println(m2.substract(10,20));
            System.out.println(m2.multiply(10,20));
            System.out.println(m2.divide(10,20));}
        catch (Exception e){
            e.getMessage();
        }



        I1 m3;
        m3 = (I1) new Myclass();
        // what is lambda function?




    }
}

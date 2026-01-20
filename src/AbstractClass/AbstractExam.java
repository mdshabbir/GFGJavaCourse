package AbstractClass;

abstract public class AbstractExam {
    // to make a class abstract there must be atleast one abstract method should be present in the class
    abstract void display();
    // abstract method should not have body
    // abstract method should be implemented in the child class

    void display(String s){
        System.out.println(s);
    }
    int add(int x, int y){
        return x+y;
    }
    int age = 40;
    int salray = 35000;
   protected String address;
   abstract int subtract(int a, int b);


}
class AbstractExamChild extends AbstractExam{
    // implement the abstract display method using lambda function
    @Override
    void display() {
        System.out.println("Abstract method implemented in the child class");
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

}
class AbstractExamMain{
    public static void main(String[] args) {
     AbstractExam   ab;
     ab = new AbstractExamChild();
     ab.display();
     ab.display("this is in the subClass");
//     ab.add(7,8);
        System.out.println(ab.add(7,8));
        ab.address="Choti masjid Bajar Daltonganj";
        ab.age=40;
        System.out.println("The address of the person is:"+ab.address+"And the age of the person is:"+ab.age);
        System.out.println(ab.subtract(17,2));
    }

}

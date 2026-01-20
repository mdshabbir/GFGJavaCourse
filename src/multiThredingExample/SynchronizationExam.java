package multiThredingExample;
class ATM {
    public void checkBalance(String str) throws InterruptedException {
        System.out.println(str+"Checking");
        Thread.sleep(1000);
        System.out.println("Balance!!!!!!!");
    }
    public void withdrawBalance(String name,int amt) throws InterruptedException {
        System.out.println(name+"Withdrawing");
        Thread.sleep(1000);
        System.out.println(amt);
    }


}
class Customer extends  Thread{
    String name;
    int amount;
    ATM atm;
    Customer(String n, int a,ATM atm){
          this.name =n;
          this.amount = a;
          this.atm = atm;
    }
    public void useATM() throws InterruptedException {
        atm.checkBalance(name);
        atm.withdrawBalance(name,1000);

    }
    public void run(){
        try {
            useATM();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class SynchronizationExam {

    public static void main(String[] args) throws InterruptedException {
         ATM  myAtm = new ATM();
        Customer c1 = new Customer("Shabbir",2000,myAtm);
        Customer c2  = new Customer("Tauqir",5000,myAtm);
        c1.start();
        c2.start();
    }
}

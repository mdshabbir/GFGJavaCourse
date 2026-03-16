package constructor;
class Emp {
    private int id;
    private String name;
    private int salary;

    public Emp(int id, String name, int salary) {
        this.id = id;
        System.out.println(this.id);
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class ConstructorProblem {
    public static void main(String[] args) {
        Emp e1 = new Emp(101, "Ajay", 40000);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        Emp e2 = new Emp (102, "akash", 50000);
        System.out.println(e2.getId());
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());

    }
}

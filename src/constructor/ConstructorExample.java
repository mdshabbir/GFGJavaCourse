package constructor;

import sorting.SortingUtils;

public class ConstructorExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(10, "shabbir", 1);
        s2.displayInfo();

    }

//    public static void getInfo() {
//        System.out.println("Student Age: " + );
//    }

    static class Student {
        int age;
        String name;
        int id;

        Student() {
            System.out.println("This is Student class");
        }

        Student(int age, String name, int id) {
            this.age = age;
            this.name = name;
            this.id = id;
        }
        public void displayInfo () {
            System.out.println("Student Id: " + id);
            System.out.println("Student Age: " + age);
            System.out.println("Student Name: " + name);
        }
    }
}

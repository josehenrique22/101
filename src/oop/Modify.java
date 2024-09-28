package oop;

public class Modify {
    final int x;
    final double PI;

    public Modify() {
        x = 10;
        PI = 3.14;
    }
    // A static method means that it can be accessed without creating an object of the class, unlike public:

    static void myStaticMethod() {
        System.out.println("Static Method can be call without create a object ");
    }

    }

    // An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:
    abstract class MainAbstraction {
        public String fname = "John";
        public int age = 22;
        public abstract void study();
    }

    class Student extends MainAbstraction {
        public int graduationYear = 2018;
        public void study() { // the body of the abstract method is provided here
            System.out.println("Studying all day long");
        }

    public static void main(String[] args) {
        Modify modify = new Modify();
        int x = modify.x; // Cannot be modified
        double PI = modify.PI;

        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Year: " + myObj.graduationYear);
        myObj.study();



        System.out.println("X: " + x + " PI " + PI);
    }
}

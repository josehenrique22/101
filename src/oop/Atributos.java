package oop;

public class Atributos {
    int x = 5;
    final int y = 3; // Can't override value in Final

    String fName = "John";
    String lName = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Atributos myObject = new Atributos();
        myObject.x = 20; // now is 20
        System.out.println(myObject.x);
        System.out.println(myObject.y);
        System.out.println("Name: " + myObject.fName + " " + myObject.lName);
        System.out.println("Age: " + myObject.age);
    }
}

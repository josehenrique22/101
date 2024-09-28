package oop;

public class Main {
    int x = 5;

    // In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects

    public static void main(String[] args) {
        Main myObject = new Main();
        Main myObject2 = new Main();
        System.out.println(myObject.x);
        System.out.println(myObject2.x);
    }
}

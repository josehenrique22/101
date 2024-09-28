package oop;

public class OopMethod {
    static void myMethod() {
        System.out.println("Hello, World");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public int speed(int maxSpeed) {
        return maxSpeed;
    }

    public static void main(String[] args) {
        myMethod();

        OopMethod publicMethod = new OopMethod();
        publicMethod.myPublicMethod();

        int printSpeed = publicMethod.speed(4);
        System.out.println(printSpeed);
    }
}

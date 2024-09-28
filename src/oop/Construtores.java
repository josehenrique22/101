package oop;

public class Construtores {
    int x; // Create a class Atribute

    // Create a class Constructor for the Construtores
    public Construtores(int y) {
        x = 5; // Set the initial Value for the class attribute x
        x = y;
    }

    public static void main(String[] args) {
        Construtores myObject = new Construtores(6); // Create an object of class Main (This will call the constructor)
        System.out.println(myObject.x);
    }
}

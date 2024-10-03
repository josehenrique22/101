package oop;
// Super Class
public class Inheritance {

    // Subclass and Superclass

    // In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:
    // subclass (child) - the class that inherits from another class
    // superclass (parent) - the class being inherited from
    // To inherit from a class, use the extends keyword.

    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuu, Tuu!");
    }
}
// SubClass
class Car extends Inheritance {
    private String modelName = "Mustang";

    public static void main(String[] args) {
       Car car = new Car();
       // Call the honk() method (From the vehicle class on car object
       car.honk();

       // Display the value of the brand attribute and the value of the modelName from the Car class
        System.out.println(car.brand + " " + car.modelName);

        // You Can use final, so the class can't be inheritance
    }
}
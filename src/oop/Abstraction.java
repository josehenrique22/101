package oop;

// Abstract class
abstract class Abstraction {

    /*
    Abstract Classes and Methods
    Data abstraction is the process of hiding certain details and showing only essential information to the user.
    Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

    The abstract keyword is a non-access modifier, used for classes and methods:

    Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

    Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    An abstract class can have both abstract and regular methods:
     */

    // Abstract method (does not have a body)
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Like an Interface
// Subclass
class BigPig extends Abstraction{
    public void animalSound() {
    System.out.println("The Pig say: we we");
    }
}

class ExMain {
    public static void main(String[] args) {
        BigPig myPig = new BigPig();
        myPig.animalSound();
        // can use Sleep of the superclass
        myPig.sleep();
    }
}

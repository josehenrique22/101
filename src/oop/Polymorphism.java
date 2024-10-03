package oop;

public class Polymorphism {

    /*
    Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

    Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

    For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):
     */

    public void animalSound() {
        System.out.println("Animal made a sound");
    }
}

class pig extends Polymorphism {
    public void animalSound() {
        System.out.println("The pig say hehe");
    }
}

class dog extends Polymorphism {
    public void anuimalSound() {
        System.out.println("The dog says: Au A");
    }
}

class MainRun {
    public static void main(String[] args) {
        Polymorphism myAnimal = new Polymorphism();
        Polymorphism myPig = new pig();
        Polymorphism myDog = new dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
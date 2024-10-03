package oop;

interface IAnimal {
    // Another way to achieve abstraction in Java, is with interfaces.
    public void animalSound(); // interface method (does not have body
    public void run(); // same

    // Instead of extends like abstraction you use implements
}

class smallPig implements IAnimal {
    public void animalSound() {
        // the body of animalSound() is provided here
        System.out.println("The pig say Wewe");
    }

    public void run() {
        System.out.println("Ruuuuuuuuuuun");
    }
}

class eMain {
    public static void main(String[] args) {
        smallPig myPig = new smallPig();
        myPig.animalSound();
        myPig.run();
    }
}

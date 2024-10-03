package oop;

public class EnumEx {
    public static void main(String[] args) {
        // Enum is a special class that represents a group of contansts
        //(unchangeable var, like Finals var)

        enum Level {
            LOW,
            MEDIUM,
            HIGH
        }

        // You can access enum constants with the dot syntax
        Level levelVar = Level.MEDIUM;

        // Enum is short for "enumerations", which means "specifically listed".
        System.out.println(levelVar);

        switch (levelVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        // Loop Through an enum
        // The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
        for (Level level : Level.values()) {
            System.out.println(level);
        }

        /*
            Difference between Enums and Classes
            An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

            An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

            Why And When To Use Enums?
            Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
         */
    }
}

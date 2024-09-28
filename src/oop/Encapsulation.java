package oop;

public class Encapsulation {
    /*
    Encapsulation
    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.

    declare class variables/attributes as private
    provide public get and set methods to access and update the value of a private variable
  */

    private String name;

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

class MainEx {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("John");
        String name = obj.getName();

        System.out.println(name);


    }
}




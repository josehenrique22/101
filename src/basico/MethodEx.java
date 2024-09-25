package basico;

public class MethodEx {
    public static void main(String[] args) {
        myMethod();
        checkAge(19);
        intMethod(3);
    }

    static int intMethod(int x) {
        return x + 5;
    }

    static void myMethodParameters(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void myMethodParameters2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    // Create a checkAge() method with a integer variable called age
    static void checkAge(int age) {
        //If age greater than, or equal to, 18, print "access granted"
        if (age < 18) {
            System.out.println("access denied - You are not old enougt!");
        } else {
            // If age is greater than, or equal to, 18, print "access granted"
            System.out.println("Access granted - You are old enougt!");
        }
    }

    static void myMethod() {
        // Code to be executed
        System.out.println("I just get executed");
        myMethodParameters("Liam");
        myMethodParameters2("Jenny", 31);
    }
}

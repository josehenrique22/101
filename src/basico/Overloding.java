package basico;

public class Overloding {
    // Overloading
    int method(int x){return x;};
    float method(float x){return x;}
    double method(double x){return x;}

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNumb1 = plusMethod(8, 7);
        double myNumb2 = plusMethod(4.3, 6.26);
        System.out.println("Int: " + myNumb1);
        System.out.println("Double: " + myNumb2);
    }
}

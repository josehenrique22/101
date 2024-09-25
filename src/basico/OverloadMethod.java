package basico;

public class OverloadMethod {

    static int PlusMethod(int x, int y) {
        return x + y;
    }

    static double PlusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNumInt = PlusMethod(8, 6);
        double myNumDouble = PlusMethod(8.2f, 6.2f);

        System.out.println("Int: " + myNumInt);
        System.out.println("Double: " + myNumDouble);

    }
}

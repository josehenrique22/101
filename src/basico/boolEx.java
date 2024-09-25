package basico;

public class boolEx {
    
    public static void main(String[] args) {
        
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        int x = 9, y = 10;
        System.out.println(x > y);
        System.out.println(x == y);
        System.out.println(x >= y);

        if (x >= y) {
            System.out.println("X é maior que Y");
        } else {
            System.out.println("Y é maior que X");
        }
    }
}

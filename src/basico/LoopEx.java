package basico;

public class LoopEx {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            // code block to be executed
            System.out.println(i);
            i++;
        }

        do {
            // code block to be executed
            System.out.println(i);
            i++;
        }
        while (i < 5);

        int countdown = 3;

        while (countdown > 0) {
            System.out.println("The countDown: " + countdown);
            countdown--;
        }

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzzy!");
            }
            dice = dice + 1;
        }

        for (int y = 0; y < 5; y++) {
            System.out.println(y);
        }

        // Nested Loop
        // Outer lopp
        for (int z = 1; z <= 2; z++) {
            System.out.println("Outer: " + z);
        }

        // Inner
        for (int p = 1; p <= 3; p++) {
            System.out.println("Inner: " + p);
        }

        // Foreach
        String[] cars = {"volvo, ford, bmw, mazda"};
        for (String carsString : cars) {
            System.out.println(carsString);
        }

        for (int ii = 0; ii <= 10; ii = ii + 2) {
            System.out.println(ii);
        }

        int number = 2;

        // Print the multiplication table for number 2
        for (int iii = 1; iii < 10; iii++) {
            System.out.println(number + " x " + iii + " = " + (number * iii));
        }

        for (int iiii = 0; iiii < 10; iiii++) {
            if (iiii == 4) {
                break;
            }
            System.out.println(iiii);
        }

        for (int iiii = 0; iiii < 10; iiii++) {
            if (iiii == 4) {
                continue;
            }
            System.out.println(iiii);
        }

        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
            if (a == 4) {
                break;
            }
        }
    }
}

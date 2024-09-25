package basico;

public class MultiArray {
    public static void main(String[] args) {
        // linha e coluna
        int[][] myNumbers = {{1, 2, 3, 4}, {5 , 6, 7}};
        System.out.println(myNumbers[1][2]);
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j <myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
        for (int [] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

    }
}

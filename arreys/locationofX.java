package arreys;

import java.util.Scanner;

public class locationofX {
    public static void main(String... args) {
        Scanner sr = new Scanner(System.in);

        int row = sr.nextInt();
        int coloum = sr.nextInt();

        int[][] number = new int[row][coloum];

        // Input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                number[i][j] = sr.nextInt();
            }
        }

        int x = sr.nextInt();

        // Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                if (number[i][j] == x) {
                    System.out.println("x is at location " + i + ", " + j);
                }
            }
        }

        sr.close();
    }
}
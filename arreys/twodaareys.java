package arreys;

import java.util.Scanner;

public class twodaareys {
    public static void main(String... args) {
        Scanner sr = new Scanner(System.in);
        int row = sr.nextInt();
        int coloum = sr.nextInt();
        int[][] number = new int[row][coloum];

        // INPUT
        // row inpiut from the user
        for (int i = 0; i < row; i++) {
            // coloum input from the user
            for (int j = 0; j < coloum; j++) {
                number[i][j] = sr.nextInt();
            }
        }

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();

        }
        sr.close();
    }

}

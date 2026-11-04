// Find the bit at position 2 in the number 5.

package bitmanipulation;

import java.util.Scanner;

public class Getbit {
    public static void main(String... args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sr.nextInt();
        int pos = 2;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was not zero");
        }
        sr.close();
    }
}

package startingconcepts;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.println("Enter the vlaue: ");
        int n = sr.nextInt();

        if (n % 2 == 0) {
            System.out.println("numeber is even");
        } else {
            System.out.println("number is odd");
        }
        sr.close();
    }
}
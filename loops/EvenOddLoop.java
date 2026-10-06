package loops;

// Write a program that repeatedly asks the user for a number and checks whether it is even or odd. Stop when the user chooses to exit.

import java.util.Scanner;

public class EvenOddLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int A = sc.nextInt();

        if (A % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}

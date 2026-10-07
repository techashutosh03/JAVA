package function;

import java.util.Scanner;

public class multiplication {
    public static int multiply(int a, int b) {
        System.out.print(a * b);
        return a * b;
    }

    public static void main(String... args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        System.out.println(multiply(a, b));
    }
}
package function;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static int average(int a, int b, int c) {
        System.out.println((a + b + c) / 3);
        return (a + b + c) / 3;
    }

    public static void main(String... args) {
        Scanner se = new Scanner(System.in);
        int a = se.nextInt();
        int b = se.nextInt();
        int c = se.nextInt();
        System.out.println(average(a, b, c));
        se.close(); // always close scanner
    }
}

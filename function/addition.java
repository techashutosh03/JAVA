package function;

import java.util.Scanner;

public class addition {
    public static int add(int a, int b) {
        System.out.print(a + b);
        return a + b;
    }

    public static void main(String... args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        System.out.println(add(a, b));
        sr.close();
    }
}

package function;

import java.util.Scanner;

public class function {
    public static void printmyname(String name) {
        System.out.println(name);
    }

    public static void main(String... args) {
        Scanner sr = new Scanner(System.in);
        String name = sr.nextLine();
        printmyname(name); // this is how we call function in java
        sr.close();
    }
}
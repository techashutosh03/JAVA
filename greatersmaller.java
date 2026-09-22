import java.util.Scanner;

public class greatersmaller {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.println("Enter the value of A: ");
        int A = sr.nextInt();

        System.out.println("Enetr the value of B:");
        int B = sr.nextInt();

        if (A == B) {
            System.out.println("equal");
        } else if (A > B) {
            System.out.println("A is greater");
        } else {
            System.out.println("B is smaller");
        }
    }
}

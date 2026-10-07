/* package function;

import java.util.Scanner;

public class fectorial {
   public static void fectorial(int n) {
       int fectorial = 1;
       for (int i = 1; i >= n; i++) {
           fectorial = fectorial * 1;

       }
       System.out.print(fectorial);

   }

   public static void main(String[] args) {
       Scanner sr = new Scanner(System.in);
       int n = sr.nextInt();
       System.out.println(fectorial(n));

   }

}
*/

package function;

import java.util.Scanner;

public class fectorial {

    public static int factorial(int n) {
        int factorial = 1;

        for (int i = n; i >= n; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();

        System.out.println(factorial(n));

        sr.close();
    }
}
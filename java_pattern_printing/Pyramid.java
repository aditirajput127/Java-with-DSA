
import java.util.*;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;

        //OR METHORD 2
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();


        //OR METHORD 2
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst += 2;

            System.out.println();
        }
        
        sc.close();
    }
}
        //       *
        //     * * *
        //   * * * * *
        // * * * * * * *
        
//HOW WOULD THIS WOULD PRINT

        //     nsp--;
        //     nst =+ 2;

        //           * 
        //         * * 
        //       * * * 
        //     * * * * 
        //   * * * * * 
import java.util.Scanner;

public class SpecialTriangle {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Spaces at the beginning
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Decreasing stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *
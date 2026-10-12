import java.util.*;  // MOST IMPORTANT FOR CONCEPT <3

public class VerticalFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Pattern 1: Vertical Flipped Triangle
        // Using Rectangle Method
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) <= n) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 2: Right-Aligned Triangle
        //using loop inside loop but not in neste loop way5
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
         
        sc.close();
    }
}
        //         * 
        //       * * 
        //     * * * 
        //   * * * * 
        // * * * * * 
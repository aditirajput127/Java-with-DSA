import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = n - 1, nst = 1;

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            System.out.println();
            nsp--;
            nst += 2;
        }

        // Lower half
        nsp = 1;
        nst = 2 * n - 3;

        for (int i = 1; i < n; i++) {
            // Spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            System.out.println();
            nsp++;
            nst -= 2;
        }

        sc.close();
    }
}

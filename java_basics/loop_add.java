// public class loop {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         for(int i = 0; i <= 10 ; i++ ){
//             System.out.println(" hello world!!!");
//         }
//     }  
// }
import java.util.Scanner;

public class loop_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("sum = " + sum);
        sc.close();
    }
}
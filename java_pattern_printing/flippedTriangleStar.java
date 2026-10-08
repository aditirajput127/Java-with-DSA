import java.util.*;
public class flippedTriangleStar {
    public static void main(String[] args) {//tIN THIS THE INNER AND OUTER LOOP IS CHANGED
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>= 1;i--){
            for(int j=i; j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        } 
        sc.close();
    }
}
//WITHOUT CHANGING INNER LOOP .
//LOGIC :- ("how many time j would run if i has certain value")
// i=1 ----> j= 1,2,3,4 or jmax = 4
// i=2 ----> j= 1,2,3 or jmax = 3
// i=3 ----> j= 1,2 or jmax = 2
// i=4 ----> j= 1 or jmax = 1
// so according to this logic (i + jmax = n = 1)
// then jmax = n + 1 - i. So loop with run from j = 1 to n + 1 - i.


//NOW CODE OF THIS
// For(int i=1 ; i <= n ; i++){
//             for(int j=1; j<= n + 1 - i; j++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
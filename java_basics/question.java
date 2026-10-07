// import java.util.Scanner;

// public class question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);    

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         for (int i = 1; i <= a; i++) {
//             for (int j = 1; j <= b; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
// output :- 
// ******
// ******
// ******
// ******

// public class question{
// public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     int n = sc.nextInt();
//     int m = sc.nextInt();

//     for(int i = 1; i<=n; i++){
//         for(int j = 1; j<= m; j++){
//             if(i==1 || i==n || j==1 || j==m ){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
//     sc.close();
// }
// }
// Output :-
// 5
// 6
// ******
// *    *
// *    *
// *    *
// ******
// public class question {
//      public static void main(String[] args) {
//         int n= 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//      }
// }
// Output :-
// *
// **
// ***
// ****
// *****
// public class question {
//     public static void main(String[] args){
//      int n= 5;
//      for(int i=1; i<=n; i++){
//         for(int j=i; j<=n; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//      }   
//     }
// }
// Output:-
// *****
// ****
// ***
// **
// *
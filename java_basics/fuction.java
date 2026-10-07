import java.util.Scanner;
//this fuction is used to return the name of user.
// public  class fuction {
//     public static void printName(String name){
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         String name = sc.nextLine();
//         System.out.println(name);

//         sc.close();
//     }
// }

// this is to add two no.
// public class fuction{
//     public static int calculateSum(int a, int b){
//         int Add = a + b;
//         return Add;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("Sum of no, is: " + calculateSum(a,b));
//         sc.close();
//     }
// }

// This is to find factorial 
public class fuction{
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("invalid no.");
        }
        int factorial =1;
        for(int i=n ; i>=1 ;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printFactorial(n);
    sc.close();
}

}
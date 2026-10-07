// 1st PATTERN
import java.util.Scanner;
public class rectangleAndsquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
        // * * * * * 
        // * * * * * 
        // * * * * * 
        // * * * * * 
        System.out.println();
        for(int p = 1; p <= n ; p++){
            for(int r = 1; r <= n; r++){
            System.out.print(r+" ");
        }
        System.out.println();
        }
        // 1 2 3 4 
        // 1 2 3 4 
        // 1 2 3 4 
        // 1 2 3 4
        System.out.println(); //if i give n=4 it would print a,b,c,d in 4 rows and column
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
            System.out.print((char)(j+64)+ " ");
        }
        System.out.println();
    }
        // A B C D 
        // A B C D 
        // A B C D 
        // A B C D
        System.out.println();
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
            System.out.print((char)(i+64)+ " ");
        }
        System.out.println();
    }
        // A A A A 
        // B B B B 
        // C C C C 
        // D D D D 
        sc.close();
    }
}


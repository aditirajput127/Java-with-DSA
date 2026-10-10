import java.util.Scanner;

public class hollowPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        
        for(int i = 1; i <= n ; i++){
            for(int j = 1;j<=n ; j++){
            if(i == 1 || i == n || j == 1 || j == n){
               System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }System.out.println();
    }
        
        // * * * * 
        // *     * 
        // *     * 
        // * * * *  
        System.out.println();
        
        for(int i = 1; i <= m ; i++){//n and m value are interchangeable if want n is col and m as row do it or m as col and n as row.
            for(int j = 1;j<=n ; j++){
            if(i == 1 || i == m || j == 1 || j == n){
               System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
        // * * * * * 
        // *       * 
        // *       * 
        // * * * * *  

        sc.close();
    }
 }
}

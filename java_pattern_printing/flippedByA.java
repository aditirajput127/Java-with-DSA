import java.util.*;
public class flippedByA { //we are flipping the pattern by using a varaible 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = n;
    for(int i = 1; i<= n; i++){
        for(int j = 1;j <= a; j++){
            System.out.print(j+" ");
        }
        a--;
        System.out.println();
    }
        // 1 2 3 4 5 
        // 1 2 3 4 
        // 1 2 3 
        // 1 2 
        // 1     
        //    
     sc.close();
  }  
}
//do this wit every pattern 
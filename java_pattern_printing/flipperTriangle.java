import java.util.*;
public class flipperTriangle { //IN THIS THE OUTER LOOP WOULD NOT BE AFFECTED  (by taking j= 1 to  n +1 -i )
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i<= n; i++){
        for(int j = 1 ; j<= n +1 -i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // * 
    System.out.println();
    for (int i = 1; i<= n; i++){
        for(int j = 1 ; j<= n +1 -i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    System.out.println();
    // 1 1 1 1 1 
    // 2 2 2 2 
    // 3 3 3 
    // 4 4 
    // 5 

    for (int i = 1; i<= n; i++){
        for(int j = 1 ; j<= n +1 -i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
System.out.println();
    // 1 2 3 4 5 
    // 1 2 3 4 
    // 1 2 3 
    // 1 2 
    // 1 

    for (int i = 1; i<= n; i++){
        for(int j = 1 ; j<= n +1 -i; j++){
            System.out.print((char)(64+j)+" ");
        }
        System.out.println();
    }
System.out.println();
    // A B C D E 
    // A B C D 
    // A B C 
    // A B 
    // A

    for (int i = 1; i<= n; i++){
        for(int j = 1 ; j<= n +1 -i; j++){
            System.out.print((char)(64+i)+" ");
        }
        System.out.println();
    }
    // A A A A A 
    // B B B B 
    // C C C 
    // D D 
    // E 
    
    sc.close();
   } 
}

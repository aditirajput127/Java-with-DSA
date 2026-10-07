import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
                    //FIRST WAY to take input 
         Scanner sc = new Scanner(System.in);   
        
         int[] vinita = new int[10];
        
         for(int i= 0; i< vinita.length; i++){
             vinita[i] = sc.nextInt();
         }
        for(int i= 0; i<vinita.length; i++){
            if(vinita[i]>0){
            System.out.print(-vinita[i] + " ");
        }else{
            System.out.print(vinita[i] + " ");
        }
        }
        System.out.println();


                    // MAX NO. IN ARRAY 
        int max = vinita[0];
        for (int i = 0 ; i< vinita.length; i++){
            if(vinita[i]> max){
                max = vinita[i];
            }
        }
        System.out.println(max);
    
        sc.close();
    }
}
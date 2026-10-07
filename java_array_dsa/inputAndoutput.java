import java.util.Scanner;
public class inputAndoutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    //OUTPUT 
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < arr.length; i++) { // insted of index we can write length .
            System.out.print(arr[i] + " ");
        }

        // Move to the next line
        System.out.println();

        int[] aditi = new int[9];

        for (int i = 0; i < aditi.length; i++) {
            System.out.print(aditi[i] + " ");
        }
        
        
        
                    // INPUT
        int[] vinita = new int[5];
        
        for(int i= 0; i< vinita.length; i++){
            vinita[i] = sc.nextInt();
        }
        for(int i= 0; i<vinita.length; i++){
            System.out.print(vinita[i] + " ");
        }

        sc.close();
    }
}
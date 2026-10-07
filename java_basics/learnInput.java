import java.util.Scanner;

public class learnInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age:");
        int age = sc.nextInt();

        System.out.print("Enter your weight:");
        double weight = sc.nextDouble();
        
        sc.nextLine();
        // consume the leftover newline character
        System.out.print("Enter your city :");
        String city = sc.nextLine();

        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Weight:" + weight);
        System.out.println("City:" + city);
        
        sc.close();
    }
 

    
}

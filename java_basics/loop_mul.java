import java.util.Scanner;
public class loop_mul{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<=10; i++ ){
            System.out.println(n*i);
        }

        sc.close();
    }
}
 
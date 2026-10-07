import java.util.Scanner;  //take alphabet as input and print pattern in aplabets too.

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Letter:-");

        char ch = sc.next().charAt(0);
        int n = (int) ch;
        if(ch >= 'A' && ch <= 'Z') {
        for (int i = 65; i <= n; i++) {
            for (int j = 65; j <= n; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }else if(ch >= 'a' && ch <= 'z'){
        for (int i = 97; i <= n; i++) {
            for (int j = 97; j <= n; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
        sc.close();
    }
}

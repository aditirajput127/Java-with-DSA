public class hello {
    public static void main(String args[]) {
        System.out.print("Hello, World!");// without ln no escape seqquence is added.
        System.out.println("\nHello, World!\n");
        /*the output is like this with a line gap because ln already give it a escape the \n added new one */

        int a = 127;
        int b = 389;
        int sum = a+b;
        System.out.println(sum);
        int multiply = a*b;
        System.out.println(multiply);

        int c = 290;
        int d = 40;
        double solution = (c*d) / (a-b);
        System.out.println(solution);
    }
    
}

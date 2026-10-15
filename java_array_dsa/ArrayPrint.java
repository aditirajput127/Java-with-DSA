import java.util.Arrays;//IN ODER TO PRINT AN ARRAY EITHER WE'LL USE LOOP OR BUILT-IN FUNCTION Arrays.toString() INSIDE println()

public class ArrayPrint {
    public static void main(String[] args) {

        //WITH THE HELP OF BUILT IN FUNCTION Arrays.toString()
        int[] aditi = {1,2,3,4,5};
        System.out.println(Arrays.toString(aditi));

        //WITH THE HELP OF LOOP
        int[] tarun = {10, 20, 30, 40, 50};

        for (int i = 0; i < tarun.length; i++) {
            System.out.print(tarun[i] + " ");
        }
    }
}

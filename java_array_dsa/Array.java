public class Array {

    // An array is a way to store multiple values of the same data type in a single variable.

    public static void main(String[] args) {
                            //INITIALIZATION
        // Method 1: Create an array and assign values using indexes.
        int[] arr = new int[4];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Method 2: Declare and initialize an array in a single statement.
        int[] arr1 = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}

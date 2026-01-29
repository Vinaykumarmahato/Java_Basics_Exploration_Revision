import java.util.Arrays;   // Importing Arrays class for copyOf method

public class ShallowCopyDeepCopy {

    public static void main(String[] args) {

        // Original array
        int arr[] = {10, 20, 30};

        // ---------------- SHALLOW COPY ----------------

        // Here x is NOT a new array
        // It points to the SAME memory location as arr
        int[] x = arr;   

        // If we change x, original arr will also change
        // Uncomment below line to test
        // x[1] = 200;

        // ---------------- DEEP COPY ----------------

        // Here a NEW array is created in memory
        // Values are copied from arr into y
        int[] y = Arrays.copyOf(arr, arr.length);

        // Changing y will NOT affect arr
        y[1] = 100;

        // Printing value from deep copied array
        System.out.println("Value in y array (deep copy): " + y[1]);

        // Printing value from original array
        System.out.println("Value in original arr: " + arr[1]);

    }
}

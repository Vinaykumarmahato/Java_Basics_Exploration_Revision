import java.util.Arrays;   // Import Arrays class to use built-in sort method

public class SortArrayBuiltIn {

    public static void main(String[] args) {

        // Creating an integer array
        int arr[] = {8, 3, 6, 9, -4, -67};

        // Printing array BEFORE sorting
        print(arr);

        // Sorting the array in ascending order using built-in method
        Arrays.sort(arr);

        // Printing array AFTER sorting
        print(arr);
    }

    // This method prints all elements of the array
    public static void print(int[] arr){

        // Loop through each element
        for(int i = 0; i < arr.length; i++){

            // Print elements in same line
            System.out.print(arr[i] + " ");
        }

        // Move to next line after printing all elements
        System.out.println();
    }
}

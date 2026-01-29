public class RotateArray {
    
    public static void main(String[] args) {

        // Step 1: Create array
        int arr[] = {12, 34, 56, 78, 99};

        // Step 2: Number of rotations (left rotation)
        int d = 2;

        // Step 3: Find length of array
        int n = arr.length;

        // Step 4: Handle case when d is greater than array length
        // Example: if d = 7 and n = 5 → real rotation = 7 % 5 = 2
        d = d % n;

        // Step 5: Reverse first d elements (0 to d-1)
        reverse(arr, 0, d - 1);

        // Step 6: Reverse remaining elements (d to n-1)
        reverse(arr, d, n - 1);

        // Step 7: Reverse the whole array (0 to n-1)
        reverse(arr, 0, n - 1);

        // Step 8: Print rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Step 9: Reverse function to swap elements
    static void reverse(int arr[], int i, int j) {

        // Keep swapping till start index is smaller than end index
        while (i < j) {

            // Store value in temp
            int temp = arr[i];

            // Swap elements
            arr[i] = arr[j];
            arr[j] = temp;

            // Move indices
            i++;
            j--;
        }
    }
}

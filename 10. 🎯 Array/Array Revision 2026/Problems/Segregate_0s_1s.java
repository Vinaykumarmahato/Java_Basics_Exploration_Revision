public class Segregate_0s_1s {
    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 1, 0, 0, 1, 0};
        int i = 0, j = arr.length - 1;

        while (i < j) {

            // Move i forward while arr[i] is 0
            while (i < j && arr[i] == 0) {
                i++;
            }

            // Move j backward while arr[j] is 1
            while (i < j && arr[j] == 1) {
                j--;
            }

            // Swap when left is 1 and right is 0
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

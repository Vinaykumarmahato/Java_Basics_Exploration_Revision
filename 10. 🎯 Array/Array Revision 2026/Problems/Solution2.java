import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take size input
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // output
        for (int a : arr) {
            System.out.print(2 * a + " ");
        }
        System.out.println();
    }
}

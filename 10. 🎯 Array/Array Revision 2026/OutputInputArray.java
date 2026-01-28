import java.util.*;

public class OutputInputArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int arr[] = { 12, 45, 56, 64 };
        // for (int a : arr) {
        // System.out.println(arr.length);
        // System.out.println(a);

        // }

        int array[] = new int[7];
        // Default value
        // for(int a:array){
        // System.out.println(a);
        // }

        // input
        for (int i=0; i<=6;i++) {
            array[i] = sc.nextInt();
        }

        // output
        for (int i=0;i<=6;i++) {
            System.out.print(array[i]+" ");
        }

    }

}

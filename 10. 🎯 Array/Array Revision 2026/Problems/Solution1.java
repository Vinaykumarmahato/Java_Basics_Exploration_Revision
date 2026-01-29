package Problems;

public class Solution1 {
    public static void main(String[] args) {
//Multiply_Odd_Indexed_Element_By_2_And_Add_10_To_Even_Indexed_Element
        int arr[] = { 12, 34, 56, 77, 4 };

        print(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] *= 2;
            } else {
                arr[i] += 10;
            }
        }
        print(arr);
    }

    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}

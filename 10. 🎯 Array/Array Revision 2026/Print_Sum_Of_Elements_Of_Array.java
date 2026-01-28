import java.util.Scanner;

public class Print_Sum_Of_Elements_Of_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array!");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.print("Enter the Array Element:");
        // Input
        int sum=0;
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum +=arr[i];
        }

        // Array Output
        System.out.print("The Final Array is: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        // Output of Sum of element of Array
        System.out.println();
        System.out.println("Sum of Input Array Element is: "+sum);
    }
}

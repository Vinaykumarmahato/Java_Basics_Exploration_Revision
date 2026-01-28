import java.util.Scanner;

public class Print_Negative_Value {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array!");

        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Element: ");
        //Input
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Output Array is: ");
        // Output
        for (int a : arr) {
            if(a<0){
            System.out.print(a+" ");
            }  
        }
    }
    
}

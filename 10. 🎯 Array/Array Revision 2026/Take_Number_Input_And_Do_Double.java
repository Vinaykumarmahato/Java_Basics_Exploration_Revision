import java.util.Scanner;

public class Take_Number_Input_And_Do_Double {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input Array with 5 Length's");
        int arr[]=new int[5];

        // input
        for(int i=0;i<=4;i++){
            
            arr[i]=sc.nextInt();
        }
        // output
        for(int a:arr){
            System.out.println(2*a+" ");
        }

    }
}

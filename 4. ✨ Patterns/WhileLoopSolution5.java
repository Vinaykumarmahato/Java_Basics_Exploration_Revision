
import java.util.Scanner;
public class WhileLoopSolution5 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of N");

        int n=sc.nextInt();

        int num=1;

        while(num<=n){

            System.out.println(num);
            num++;
        }
    }
}

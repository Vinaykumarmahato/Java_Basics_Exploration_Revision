
import java.util.Scanner;
public class WhileLoopSolution2 {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of N");
        int n=sc.nextInt();

        int Number=1;

        while (Number<=n) {

            System.out.println(Number);
            Number++;
            
        }
        

    }
    
}

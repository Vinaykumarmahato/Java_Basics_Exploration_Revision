
import java.util.Scanner;
public class WhileLoopSolution1 {
    
    public static void main(String[] args) {
        
        // first we give the condition then we print the values according to the condition

       // so lets take one example: 1 to n

       Scanner vinay =new Scanner(System.in);
       System.out.println("Enter the value of n");
       int n=vinay.nextInt();

       int num=1;
       while(num<=n){
        System.out.println(num);
        num++;
       }
      
    }
}

import java.util.Scanner;

public class DoWhileLoopSolution1 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        // here we will work first then we will check the condition
        System.out.println("Enter the number");
        int number=sc.nextInt();
        do{
            System.out.println(number);
            number++;
        }
        while(number<=10);
    }
}

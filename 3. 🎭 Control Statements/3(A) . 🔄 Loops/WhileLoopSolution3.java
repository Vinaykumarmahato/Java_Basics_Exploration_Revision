

import java.util.Scanner; 
public class WhileLoopSolution3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n");

        int n=sc.nextInt();


        int number=1;
        while (number<=n) {

            System.out.println(number);
            number++;
            
        }


    }
    
}

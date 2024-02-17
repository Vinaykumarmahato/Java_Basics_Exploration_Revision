import java.util.Scanner;

public class IfElseStatementSolution3 {
    
    public static void main(String[] args) {
        
        // write the program if the age is greater than 18 then we can say that you are eligible for vote

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Age For checking the Eligibilty either you are eligible for vot or not!");

       int  age =sc.nextInt();
        if(age>=18){
            System.out.println(" You are Eligible for the Vote");

        }
        else{
            System.out.println(" You are not Eligible for the vote");
        }

    
    }
}

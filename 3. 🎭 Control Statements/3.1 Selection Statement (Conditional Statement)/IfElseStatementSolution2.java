import java.util.Scanner;

public class IfElseStatementSolution2 {

    public static void main(String[] args) {
        // write the program to find the largest number in three number

        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter three Number");
        System.out.println();
        System.out.println("enter the first Number");

        int a=Sc.nextInt();
        System.out.println("Enter second number");
        int b=Sc.nextInt();
        System.out.println("Enter third number");
        int c=Sc.nextInt();

        if (a>b && a>c) {

            System.out.println("A is greater");
            
        }
        else if (b>a && b>c) {

            System.out.println(" B is Greater");
            
        }

        System.out.println("C is greater");
    }
    
}

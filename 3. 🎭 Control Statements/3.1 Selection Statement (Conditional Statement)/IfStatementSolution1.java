


import java.util.Scanner;

public class IfStatementSolution1 {
    public static void main(String[] args) {
        
        // finf the greatest number in 2 given input

        Scanner sc=new Scanner(System.in);

        System.out.println("Please! Enter Any two Number!");

        int a=sc.nextInt();

        int b=sc.nextInt();

        if(a>b){
            System.out.println(" A is the Greatest Value");
        }
        else{
            System.out.println("A is not a Greatest Value");
        }
    }

}

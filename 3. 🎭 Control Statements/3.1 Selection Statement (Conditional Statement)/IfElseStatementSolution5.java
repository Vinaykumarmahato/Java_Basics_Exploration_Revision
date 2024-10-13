import java.util.Scanner;

public class IfElseStatementSolution5 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a=sc.nextInt();
        System.out.println("Enter The Second Number");
        int b=sc.nextInt();
        System.out.println("Enter The Third Number");
        int c=sc.nextInt();
        System.out.println("Enter The Fourth Number");
        int d=sc.nextInt();


        if (a==b && a==c && a==d) {
            System.out.println("All The Given Numbers are Equals");
        }
        else if (a==b & a==c && a==d) {
            System.out.println("The Greates Value is: "+a);
            
        }
        else if (b==a && b==c && b==d) {

            System.out.println("The Greatest Number is:  "+b);
            
        }
        else if (c==a && c==b && c==d) {
            System.out.println(" The Greatest Number is: "+c);

        }
        else  {
            System.out.println("The Greatest value is: "+d);
        }

        sc.close();
    }
}

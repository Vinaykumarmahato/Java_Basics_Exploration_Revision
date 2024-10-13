import java.util.Scanner;

public class IfElseStatementSolution4 {

    public static void main(String[] args) {
        
        Scanner vinay = new Scanner(System.in);

        System.out.println("Enter The First Number:");
        int num1 = vinay.nextInt();

        System.out.println("Enter The Second Number:");
        int num2 = vinay.nextInt();

        System.out.println("Enter The Third Number:");
        int num3 = vinay.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("All numbers are equal.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("The Greatest Number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The Greatest Number is: " + num2);
        } else {
            System.out.println("The Greatest Number is: " + num3);
        }

        vinay.close();  // Close the scanner
    }
}

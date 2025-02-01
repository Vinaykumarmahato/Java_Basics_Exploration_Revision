import java.util.Scanner;

public class IfElseStatementSolution1 {
    public static void main(String[] args) {
        
        // Find the greatest number between two given inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number:");
        int a = sc.nextInt();

        System.out.println("Enter The Second Number:");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("The Greatest value between the two numbers is: " + a);
        } else if (a < b) {
            System.out.println("The Greatest value between the two numbers is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();  // Closing the scanner
    }
}

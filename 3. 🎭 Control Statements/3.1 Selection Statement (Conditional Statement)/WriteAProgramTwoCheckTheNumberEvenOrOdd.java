import java.util.Scanner;

public class WriteAProgramTwoCheckTheNumberEvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number for checking the number is even or opdd!");

        int number = sc.nextInt();
        // Even number: if Number devided by 2 then called even number
        // if number not devided by 2 then called even number

        if (number % 2 == 0) {

            System.out.println("The number is Even");

        }

        else {
        }
        System.out.println("The number is Odd");
    }
}

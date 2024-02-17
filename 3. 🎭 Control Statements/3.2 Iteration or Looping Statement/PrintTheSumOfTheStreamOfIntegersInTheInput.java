import java.util.Scanner;

public class PrintTheSumOfTheStreamOfIntegersInTheInput {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum = 0;
        while (number != -1) {

            sum += number;
            number = sc.nextInt();

        }

        System.out.println("Addition of the Given Number is:" + sum);

    }
}

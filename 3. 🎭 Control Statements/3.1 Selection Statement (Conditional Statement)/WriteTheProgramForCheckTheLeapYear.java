import java.util.Scanner;

public class WriteTheProgramForCheckTheLeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * 
         * lets see the condition for leap year
         * we have two condition
         * the number should be divisible by 400
         * or it should be devided by 4 but not by 100
         */

        System.out.println("Enter the Year for checking the leap year");

        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The year is leap year");
        }

        else {
            System.out.println("The year is not leap year");
        }
    }

}

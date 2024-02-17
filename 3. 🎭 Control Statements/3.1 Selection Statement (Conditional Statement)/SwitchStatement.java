import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please! Enter the Floor number at which floor you want to go");

        int button = sc.nextInt();

        switch (button) {

            case 1:
                System.out.println("Thanks! You are Going on floor First");

                break;

            case 2:
                System.out.println("Thanks! You are going on Floor Second");

                break;

            case 3:
                System.out.println(" Thanks! You are going on Third Floor");
                break;

            case 4:
                System.out.println("Thanks! You are going on floor fourth");
                break;

            default:
                System.out.println("Invalid button");
                break;
        }
    }
}

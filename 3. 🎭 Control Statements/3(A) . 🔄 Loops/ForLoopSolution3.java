import java.util.Scanner;

/**
 * ForLoopSolution3
 */
public class ForLoopSolution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of n");

        int n = sc.nextInt();
        for (int num = n; num >= 1; num--) {

            System.out.println(num);
        }

    }
}
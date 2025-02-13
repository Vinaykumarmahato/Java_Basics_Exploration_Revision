import java.util.Scanner;

public class ForLoopSolution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of N");

        int n = sc.nextInt();
        for (int num = 1; num <= n; num++) {

            System.out.println(num);
            
        }
    }
}

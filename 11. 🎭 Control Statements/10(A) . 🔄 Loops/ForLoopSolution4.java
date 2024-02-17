import java.util.Scanner;

/**
 * ForLoopSolution4
 */
public class ForLoopSolution4 {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int num=1;num<=n;num++){
            System.out.println(num*2);
        }
    }
}
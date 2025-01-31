import java.util.Scanner;

public class ForLoopSolution2 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number of N");

        int n=sc.nextInt();

        int sum=0
        ;
        
        
        for(int num=0;num<=n;num++){
            sum=sum+num;
        }

        System.out.println("Sum of Number N: "+sum);

    }
}

import java.util.Scanner;

public class PrintMultiplicationTableFirstTime {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number According to You!");
        int Number=sc.nextInt();

        for(int i=1; i<=10;i++){

            System.out.println(Number+"*"+i+"="+Number*i);
        }
    
    }
}

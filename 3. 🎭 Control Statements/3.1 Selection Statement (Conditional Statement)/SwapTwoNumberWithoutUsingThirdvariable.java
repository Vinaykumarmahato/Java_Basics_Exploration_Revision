public class SwapTwoNumberWithoutUsingThirdvariable {
    
    public static void main(String[] args) {
        int a=10;

        System.out.println("a ="+a);
        int b=20;
        System.out.println("b ="+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The Value of A after Swapping "+a);
        System.out.println("The value of B after Swapping "+b);
    }
}

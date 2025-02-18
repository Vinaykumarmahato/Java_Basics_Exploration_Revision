public class BreakStatementInJava {
    
    public static void main(String[] args) {
        
        for(int i=1; i<=10; i++){

            if (i==5) {
                break;
            }

            System.out.println("The value is:"+i);
        }
    }
}

/*
 * 
 *  here the break statement is just breaking the loops timing 
 * 
 * in previosly it was printing 1 to 10 but when i write break 
 * 
 * with if condition with i==5 it just giving the output 1 to 4 only because the break statement
 * broken  the iteration of the loops
 */

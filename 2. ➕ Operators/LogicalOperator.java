public class LogicalOperator {

    public static void main(String[] args) {

        /*
         * AND = &&
         * OR = ||
         * NOT = !
         */

        int a = 10;
        int b = 40;
        int c = 30;
        int d = 80;
        int e = 90;

        // And Operation

        System.out.println(a == b && a < b && a < c && a < d && a < e);
        // output : False

        // OR Operations

        System.out.println(a < b || a > b || a <= e);
        // Output : Trues

        // NOT Operation
        System.out.println(a != b);
        // Output : True

        System.out.println(!false);
        // Output : True

    }
}

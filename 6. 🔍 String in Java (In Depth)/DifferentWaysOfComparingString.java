public class DifferentWaysOfComparingString {

    public static void main(String[] args) {

        String s1 = "Vinay Kumar";
        String s2 = "vinay kumar";
        String s3="Vinay Kumar";

        String s4 = new String("ADV Indian Coder");
        String s5 = new String("ADV Indian Coder");

        /*The equality operation, represented by the == operator, is used to compare
         references, while the .equals() method is employed to compare values.
*/

        System.out.println(s1==s2);// false
        System.out.println(s1==s3);// true

        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equals(s3));// true

        System.out.println(s4==s5);// false
        System.out.println(s4.equals(s5));// true



    }
}

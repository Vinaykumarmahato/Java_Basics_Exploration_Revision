public class EqualEgnoreCaseInStringComparing {
    
    public static void main(String[] args) {
        
        String s1="ADV Indian Coder";
        String s2="ADV INDIAN CODER";
        String s3="ADV INDIAN CODER";
        

        System.out.println(s1==s2); // false
        System.out.println(s2==s3); //true

        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equals(s3));// false

        System.out.println(s2.equals(s3));// true

        System.out.println(s1.equalsIgnoreCase(s3));// true
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        // The equality operation (==) is used to compare references, checking if two objects refer to the same memory location. 
// The .equals() method is used to compare the actual content or values of objects, providing a more meaningful comparison.


    }
}

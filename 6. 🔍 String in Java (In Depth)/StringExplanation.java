public class StringExplanation {

    public static void main(String[] args) {
        // A string is a collection of characters enclosed in double quotes.

        /*
         * String is an Object
         * It is also a class in Java.
         *
         * It has two types:
         *
         * Mutable String, also known as Memory map: It means the String can be changed.
         * Immutable: It means the String cannot be changed (String builder, StringBuffer).
         */

        // We create an object of the String class, which is immutable.
        String name = new String(); // Creating a new String object
        name = "Vinay Kumar"; // Assigning a value to the String object
        name.concat("Kumar"); // Concatenating "Kumar" to the existing value (Note: Strings are immutable)
        System.out.println(name); // Output: Vinay Kumar (unchanged because Strings are immutable)

        // Immutable String
        String Name = "Vinay Kumar";
        // When we want to change this name, we can use a mutable string. Let's see how:

        // Using StringBuilder (mutable)
        StringBuilder Name1 = new StringBuilder("Vinay Kumar" + " "); // Creating a mutable StringBuilder object
        System.out.println("Without Change " + Name1);
        Name1.append("Founder of ADV Indian Coder"); // Appending additional information
        System.out.println("After Change " + Name1);

        // Using StringBuffer (mutable)
        System.out.println();
        System.out.println("Let's See the StringBuffer");
        System.out.println();
        // Creating a mutable StringBuffer object
        StringBuffer info = new StringBuffer("ADV Indian Coder" + " ");
        info.append("Vinay Kumar"); // Appending additional information
        System.out.println(info); // Output: ADV Indian Coder Vinay Kumar

        /*
         * Memory Concepts:
         * - Heap Area: This is where objects like String are stored.
         * - String Constant Pool: A special area in the heap for storing string literals.
         * - Stack Area: It stores local variables and is used for method execution.
         */

        // Real-life example:
        // Think of the Heap Area as your personal library where you store books (objects).
        // The String Constant Pool is like a special shelf in your library reserved for specific books (string literals).
        // The Stack Area is like your reading table where you keep books (local variables) while reading.
    }
}

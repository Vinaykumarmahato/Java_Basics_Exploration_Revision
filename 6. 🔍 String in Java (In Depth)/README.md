### Understanding Strings in Java: Immutability, Mutability, and Memory Concepts

![Alt Text](https://github.com/Vinaykumarmahato/Java_Basics_Exploration_Revision/blob/main/6.%20%F0%9F%94%8D%20String%20in%20Java%20(In%20Depth)/image3.jpg)

[Download PDF](https://github.com/Vinaykumarmahato/Java_Basics_Exploration_Revision/blob/main/6.%20%F0%9F%94%8D%20String%20in%20Java%20(In%20Depth)/image2.pdf)


![Alt Text](https://github.com/Vinaykumarmahato/Java_Basics_Exploration_Revision/blob/main/6.%20%F0%9F%94%8D%20String%20in%20Java%20(In%20Depth)/image1.png)


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

# Immutable String Solution 2

```java

public class ImmutableStringSolution2 {

    public static void main(String[] args) {

        String brand = "ADV Indian Coder";
        System.out.println(brand);
        String brandceo = "Vinay Kumar";
        System.out.println(brandceo);

        // now let's see the difference between these two examples with memory mapping
        // let's see what happens during memory mapping; actually, these two are immutable
        // strings
        // so we cannot change or update them
        /*
         * 
         * In Java, we consider String as an object
         * 
         * Objects are stored in the heap area.
         * 
         * If the String object is stored in the String constant pool (SCP), duplicates are not allowed.
         * but outside of the SCP, duplicates are allowed.
         * 
         * When we write a normal String brand = "ADV Indian Coder";
         * in this situation, the object will be allocated to the heap area.
         * but when we write with the new keyword like
         * 
         * String brand = new Brand("ADV Indian Coder");
         * this object will be allocated outside of the SCP in the heap area.
         * 
         * Now let's see another example
         * 
         * String s1 = "ADV";
         * String s2 = "ADV";
         * 
         * for s1 and s2 in memory mapping, first for s1, the object will be allocated in
         * the SCP. But remember, in SCP, duplicates are not allowed.
         * that's why s1 and s2 have the same input "ADV",
         * 
         * so the memory will allocate only one time, reference of ADV will be s1 and s2
         * for both, memory will not be allocated in SCP.
         * 
         * 
         * Note: == (Double equal to) Operator is used to check the reference equality
         * 
         * 
         * 
         * 
         */

        String s1 = "ADV";
        String s2 = "ADV";
        System.out.println(s1 == s2); // true because this will allocate in CSP, and duplicates are not allowed so s1
                                      // and s2 will consider as an object ADV

        String s3 = new String("ADV Indian Coder");
        String s4 = new String("ADV Indian Coder");

        System.out.println(s3 == s4); // False here the reference will be both s3 and s4, and the object will be allocated to the heap area with their own object
        // 

        // Note: the CSP maintains one copy of the heap area object


        System.out.println(s1 == s4); // False

    }
}



public class StringConcatenationInJava {

    public static void main(String[] args) {

        // Creating a string "ADV Indian Coder"
        // String s1 = new String("ADV Indian Coder");
        // System.out.println(s1);

        // Adding "Vinay Kumar" to the existing string
        // s1 = s1.concat(" " + "Vinay Kumar");
        // System.out.println(s1);

        /*
         * Although this is called an Immutable String, it may seem like we're changing
         * it here.
         * If asked about this change, you can explain:
         * 
         * When we concatenate, we're basically creating a new 's1' by combining the old
         * 's1' with "Vinay Kumar".
         * It might look like we're changing the original 's1', but it's managed by the
         * Java Virtual Machine (JVM).
         * Initially, 's1' was pointing to a string in the heap. After concatenation,
         * 's1' points to a new string, leaving the original unchanged.
         */

        String name1 = "ADV";
        String name2 = name1.concat("Indian Coder");
        String name3 = new String("ADV");

        name3 = name3.concat("Indian Coder");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        String s1 = new String("ADV Indian Coder" + " ");
        s1 = s1.concat("Founder Adv Indian Coder");

        System.out.println(s1);

    }
}

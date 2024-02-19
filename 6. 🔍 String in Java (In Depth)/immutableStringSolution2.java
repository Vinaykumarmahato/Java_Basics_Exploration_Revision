/**
 * immutableStringSolution2
 */
public class immutableStringSolution2 {

    public static void main(String[] args) {

        String brand = "ADV Indian Coder";
        System.out.println(brand);
        String brandceo = "Vinay Kumar";
        System.out.println(brandceo);

        // now lets see the different between this two example with memory mapping
        // lets see what happens during memory mapping actually this two are immutable
        // string
        // so we can not change or update it
        /*
         * 
         * In java we consider String as a object
         * 
         * Object stored in heap area.
         * 
         * if the String object will be store in String constant pool(SCP) here
         * Duplicates is not allow
         * but in out side of the SCP the Duplicates is allow
         * 
         * when we write normal String brand ="ADV Indian Coder";
         * in this situation the object will be allocated to heap area
         * but when we will write with new key work like
         * 
         * String brand =new Brand("ADV Indian Coder");
         * this object will allocates outsite of the SCP in the heap area
         * 
         * Now lets see another exaple
         * 
         * String s1="ADV";
         * String s2="ADV";
         * 
         * this s1 and s2 in memory mapping first for s1 the object will be allocate in
         * the SCP but remember in SCP Duplicates is not allow
         * thats why s1 and s2 have same input "ADV" ,
         * 
         * so the memory will allocate only one time refrence of ADV will be s1 and s2
         * for both memory will not be allocates in SCP
         * 
         * 
         * Note: == (Double equal to ) Operator used to check the reference equality
         * 
         * 
         * 
         * 
         */

        String s1 = "ADV";
        String s2 = "ADV";
        System.out.println(s1 == s2);// true because this will allocates in CSP and there duplicates not allow so s1
                                     // and s2 will consider as a object ADV

        String s3 =new String("ADV Indian Coder");
        String s4 = new String("ADV Indian Coder");

        System.out.println(s3==s4);// False  here the refrence will be both s3 and s4 and object will be allocates to the heap area. with their own object 
        // 

        // Note: the CSP maintain one coppy of heap area object

    }
}
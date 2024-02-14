public class example1_of_1D {

    public static void main(String[] args) {

        /*
         * Generally, if we have a task to print 10, 30, 50, 46, we might take three
         * variables a, b, and c, and then print each one individually.
         * 
         * However, with the help of an array, we can use a single variable to store all
         * the data. This is why we use an array.
         * 
         * 
         * There are various types of arrays:
         * - 1D (One-Dimensional) array
         * - 2D (Two-Dimensional) array
         * - Multiple Dimensional array
         * - Jagged array
         * - Anonymous array
         * 
         * Additionally, there is a type of loop that is often used in the context of
         * arrays known as the Enhanced for loop.
         */

        // Lets see one example of 1D array. 
        // allready the values has given next example will be without values given

        int arr[] = { 2, 4, 6, 8, 10 };

        // lets print the value in array arr 10, for that we can use the index number
        System.out.println(arr[4]);
        // O/p=

        // lets print all the values
        for (int i = 0; i <= 4; i++) {

            System.out.println(arr[i]);
            /*
              
              O/p =
              2
              4
              6
              8
              10
            
             */
        }

    }
}

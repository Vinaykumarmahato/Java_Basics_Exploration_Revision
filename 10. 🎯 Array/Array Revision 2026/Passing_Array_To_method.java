public class Passing_Array_To_method {

    public static void main(String[] args) {

        // Creating an integer array named x
        int x[] = {12, 34, 56, 67};

        // Printing the value at index 2 (third element)
        // Before change → x[2] = 56
        System.out.println(x[2]);

        // Passing the array x to the change() method
        change(x);
    }

    // This method receives the array (same memory reference)
    public static void change(int [] y){

        // Changing the value at index 2 of the array
        // This will also affect the original array x
        y[2] = 99;

        // Printing the updated value
        // Now y[2] = 99
        System.out.println(y[2]);

        // NOTE: 👉 Haan, hum Java me array ke memory reference ko use karke original array change kar sakte hain

    }
}

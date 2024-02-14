public class Solution1 {
    // Private variable encapsulated within the class
    private int data;

    // Constructor to initialize the private variable
    public Solution1(int initialValue) {
        // Additional logic or validation can be added here
        data = initialValue;
    }

    // Public method to access the private variable
    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        // Creating an instance of the class with the initial value provided through the constructor
        Solution1 example = new Solution1(42);

        // Accessing the private variable through a public method
        int retrievedData = example.getData();
        System.out.println("Encapsulated Data: " + retrievedData);
    }
}

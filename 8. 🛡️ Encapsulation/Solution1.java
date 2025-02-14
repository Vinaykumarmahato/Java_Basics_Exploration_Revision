public class Solution1 {
    // Private variable to demonstrate encapsulation
    private int data;

    // Public methods to access and modify the private variable
    public int getData() {
        return data;
    }
    

    public void setData(int newValue) {
        // Additional logic or validation can be added here
        data = newValue;
    }

    public static void main(String[] args) {
        Solution1 example = new Solution1();
        // Accessing and modifying the private variable through public methods
        example.setData(42);
        int retrievedData = example.getData();

        System.out.println("Encapsulated Data: " + retrievedData);
    }
}

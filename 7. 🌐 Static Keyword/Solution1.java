public class Solution1 {
    // Static variable shared among all instances of the class
    static int count = 0;

    // Non-static variable unique to each instance
    int instanceCount;

    // Static method to increment the static variable
    static void incrementCount() {
        count++;
    }

    // Constructor to initialize the instance variable
    public Solution1() {
        // Assign the current value of the static variable to the instance variable
        instanceCount = count;
        // Increment the static variable
        incrementCount();
    }

    public static void main(String[] args) {
        // Creating instances of the class
        Solution1 obj1 = new Solution1();
        Solution1 obj2 = new Solution1();
        Solution1 obj3 = new Solution1();

        // Printing the instance variable for each object
        System.out.println("Instance count for obj1: " + obj1.instanceCount);
        System.out.println("Instance count for obj2: " + obj2.instanceCount);
        System.out.println("Instance count for obj3: " + obj3.instanceCount);

        // Printing the static variable
        System.out.println("Static count: " + count);
    }
}

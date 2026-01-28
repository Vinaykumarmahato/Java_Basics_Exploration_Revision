public class Product_Of_All_element {

    public static void main(String[] args) {
        int product = 1;
        int arr[] = { 2, 4, -5, 2 };

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];

        }
        System.out.println("Product of array element is: " + product);

    }
}

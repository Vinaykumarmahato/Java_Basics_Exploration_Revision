public class TwoSum {

    public static void main(String[] args) {
        System.out.println("Two sum");

        int arr[] = {12, 34, 67, 89, 24};
        int target = 36; // example target

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                }
            }

        }

        // boolean twoSum(int arr[], int target) {
        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (arr[i] + arr[j] == target)
        // return true;
        // }
        // }
        // return false;
    }
}

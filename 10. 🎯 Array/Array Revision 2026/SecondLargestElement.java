public class SecondLargestElement {
    public static void main(String[] args) {

        int arr[] = { 12, 34, 55, 566, 67 };

        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        // Finding First Max
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Finding Second Max

        for (int i = 0; i < n; i++) {
            if (arr[i] > smax  && arr[i]!=max) {
                smax = arr[i];
            }
           
        }
        System.out.println("Max: "+max);
        System.out.println("Second Max:"+smax);
    }
}

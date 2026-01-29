
public class Add_Elements {
    
    public static void main(String[] args) {
        
        int arr[]={23,54,-98,67,-34};

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("Sum of Array is: "+sum);
    }
}

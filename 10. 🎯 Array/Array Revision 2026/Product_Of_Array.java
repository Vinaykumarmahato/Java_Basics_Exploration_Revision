public class Product_Of_Array {
    
    public static void main(String[] args) {
        
        int arr[]={12,55,-33,-45,56};

        int Product_Of_Array=1;
        for(int i=0;i<arr.length;i++){
            Product_Of_Array *=arr[i];
        }
        System.out.println("Product of array is:"+Product_Of_Array);
    }
}

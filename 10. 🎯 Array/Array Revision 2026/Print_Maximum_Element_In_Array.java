public class Print_Maximum_Element_In_Array {
    public static void main(String[] args) {

        
        int arr[]= {12,34,67,89,-34,5232,-134};
                int max=arr[0];

                for(int i=0;i<arr.length;i++){
                    if(arr[i]>max){
                        max=arr[i];
                    }
                }
                System.out.println("Max Value is: "+max);

    }
}

public class Min_Element_In_Array {
    public static void main(String[] args) {
        
        int arr[]={12,34,-44,-23,33,-1};

        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min Value in Array is:"+min);
    }
}

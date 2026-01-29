public class Find_Max_Number_In_Array {
    public static void main(String[] args) {
        
        int arr[]={12,45,53,56,12,-45,64};

        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max value in Array is:"+max);
    }
}

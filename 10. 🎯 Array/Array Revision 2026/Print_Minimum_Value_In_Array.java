public class Print_Minimum_Value_In_Array {
    public static void main(String[] args) {

        int arr[]={-2,4,56,67,-87};
        int min=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        System.out.println("Min Value is:"+min);
    }

}
public class Wave_Array {
    public static void main(String[] args) {
        
        int arr[]={12,3,43,21,32,31};
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}

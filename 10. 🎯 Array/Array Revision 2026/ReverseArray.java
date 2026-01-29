public class ReverseArray {
    public static void main(String[] args) {
        
        int arr[]={12,34,56,78,43};
        int n=arr.length;

        int i=0,j=n-1; 

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int a:arr) System.out.print(a+" ");
    }
}

public class LinearSearchInArray {
    
    public static void main(String[] args) {
        
        int arr[]={12,3,4,56,66,33,24,56,32,35};

        int target=3;
        boolean flag=false; // false means target array me nahi hai
        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                flag=true; // true means target array me hai
                break;
            }
        }
        if(flag==true){
            System.out.println("Target is Exist in array");
        }
        else{
            System.out.println("Target is Missing");
        }
    }
}

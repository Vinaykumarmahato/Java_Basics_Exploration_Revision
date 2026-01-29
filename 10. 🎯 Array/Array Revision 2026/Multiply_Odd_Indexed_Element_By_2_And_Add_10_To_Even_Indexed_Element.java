public class Multiply_Odd_Indexed_Element_By_2_And_Add_10_To_Even_Indexed_Element {

    public static void main(String[] args) {

        int arr[]={10,20,30,4,50,89};
        Operation(arr);
        print(arr);
        
    }
    public static void Operation(int []arr){

        for(int i=0;i<arr.length;i++){
            // If index is even → add 10
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=arr[i]*2;
            }
        }

    }

    public static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}

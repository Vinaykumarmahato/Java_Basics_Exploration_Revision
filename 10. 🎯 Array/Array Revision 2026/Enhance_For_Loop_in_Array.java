class Enhance_For_Loop_in_Array {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("1D Array Using Enhance for loop");
        // 1D
        int arr1[]={34,65,32,24};
        for(int n:arr1){
            System.out.println(n);
        }

        System.err.println("==========================");
        System.out.println("2D Array Using Enhance For Loop");
        // 2D
        int array[][]={
            {12,43,56,53},
            {12,54,32,42},
            {45,43,21,44}
        };

        for(int P[]:array){
            for(int q:P){
                System.out.print(q+" ");
            }
            System.out.println();
        }

        System.out.println("================");
        System.out.println("Jaged Array");
        // Jaged Array
        int arr[][]={
            {45,567,89},
            {43,56,78,89},
            {23,45}
        };

        for(int a[]:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
            }





        

    }
}

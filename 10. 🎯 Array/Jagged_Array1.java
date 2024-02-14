public class Jagged_Array1 {

    public static void main(String[] args) {
        
        // if the size of a matrix will be like 
        /*
         
        4 5 6 4 5
        5 9
        7 6 5
        6 4 5 85 2 5 4 2 5

        then it is called as jagged array

         */


         int arr[][]={


            {45,78,98,97},
            {77,39,98},
            {34,76,754,4566,4556}
         };

         for(int i=0; i<arr.length;i++){

            for(int j=0; j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }


    }
}

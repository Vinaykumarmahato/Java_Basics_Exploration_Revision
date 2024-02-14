public class example1_of_2D {

    public static void main(String[] args) {
        
        // first see with given values

        int array[][]={

            {2,4,5,6,6},
            {2,56,3,5,32},
            {32,8,45,86,55}
        };

        for(int i=0;i<=array.length;i++){

            for(int j=0;j<=2;j++){

                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
    }
    
}

public class example1_of_2D {

    public static void main(String[] args) {
        
        // first see with given values

        int array[][]={

            {2,4,5,6,6},
            {2,5,3,5,3},
            {3,8,5,6,5}
        };

        for(int i=0;i<=array.length;i++){

            for(int j=0;j<=2;j++){

                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
    }
    
}

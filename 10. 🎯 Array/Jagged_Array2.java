public class Jagged_Array2 {
    
    public static void main(String[] args) {
        
        int vinay[][]={

            {3, 4,6,8,9},
            {7,8,9},
            {5,9,0,8,9,4,6,7,8,4,3},
            {2},
            {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,66,6,66,6,6,6,}


        };

        for(int i=0; i<vinay.length;i++){

            for(int j=0; j<vinay[i].length;j++){

                System.err.print(vinay[i][j]+" ");
            }
            System.out.println();
        }
    }
}

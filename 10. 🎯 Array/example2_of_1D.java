public class example2_of_1D {

    public static void main(String[] args) {
        
        int array[]=new int[5];

        array[0]=2;
        array[1]=4;
        array[2]=6;
        array[3]=8;
        array[4]=10;
        System.out.println("Lets see the result");
        System.out.println(array);
        System.out.println();
        // the garbage value will be print

        System.out.println(array[3]);
        System.out.println();
        // o/p=8

        // Now i want all the values 
        for(int i=0; i<=5;i++){

            System.out.println(array[i]);

        }
    }
    
}

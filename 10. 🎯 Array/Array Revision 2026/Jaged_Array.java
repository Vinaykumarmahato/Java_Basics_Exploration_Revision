class jaged_Array {
    public static void main(String[] args) {
        int jaggedArr[][] = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("=================");
        int jaged_Array[][] = new int[3][];
        jaged_Array[0] = new int[3];
        jaged_Array[1] = new int[5];
        jaged_Array[2] = new int[6];
        
        for(int i=0;i<=2;i++){
            for(int j=0;j<jaged_Array[i].length;j++){
           System.out.print(jaged_Array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
class One_D_Array {
    public static void main(String[] args) {

        // 1D Array with values
        int arr1[] = {12, 34, 445, 56, 23};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        // 1D Array without initial values
        int arr2[] = new int[5];
        arr2[0] = 23;
        arr2[1] = 45;
        arr2[2] = 67;
        arr2[3] = 89;
        arr2[4] = 90;

        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }
    }
}

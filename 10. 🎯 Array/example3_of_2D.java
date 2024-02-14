public class example3_of_2D {

    public static void main(String[] args) {

        // Now the values will not be given

        int arr[][] = new int[3][5];

        arr[0][0] = 5;
        arr[0][1] = 6;
        arr[0][2] = 9;
        arr[0][3] = 7;
        arr[0][4] = 2;

        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 9;
        arr[1][3] = 7;
        arr[1][4] = 2;

        arr[2][0] = 5;
        arr[2][1] = 6;
        arr[2][2] = 9;
        arr[2][3] = 7;
        arr[2][4] = 2;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

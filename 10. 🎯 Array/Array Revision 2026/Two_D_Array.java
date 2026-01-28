class Array {
    public void Solution1() {
        System.out.println("2D Array with initial values");
        // 2D Array
        int Arr1[][] = {

                { 12, 34, 56, 67, 75 },
                { 45, 78, 89, 90, 91 },
                { 23, 45, 67, 78, 89 }
        };

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(Arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Solution2() {
        System.out.println("2D Array with initial values");
        int arr[][] = {
                { 12, 55, 54, 25, 53, 56, 78 },
                { 45, 64, 64, 34, 32, 56, 78 },
                { 45, 67, 75, 43, 35, 63, 35 },
                { 45, 76, 56, 78, 96, 86, 88 }
        };

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Solution3() {
        System.out.println("2D Array without initial values and assigning values later");

        int arr[][] = new int[3][4];
        arr[0][0] = 23;
        arr[0][1] = 45;
        arr[0][2] = 67;
        arr[0][3] = 89;
        arr[1][0] = 12;
        arr[1][1] = 34;
        arr[1][2] = 56;
        arr[1][3] = 78;
        arr[2][0] = 90;
        arr[2][1] = 23;
        arr[2][2] = 45;
        arr[2][3] = 67;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}

class Two_D_Array {
    public static void main(String[] args) {
        System.out.println("=========================");

        Array array = new Array();
        array.Solution1();
        System.out.println("=========================");

        array.Solution2();
        System.out.println("=========================");

        array.Solution3();
        System.out.println("=========================");

    }
}

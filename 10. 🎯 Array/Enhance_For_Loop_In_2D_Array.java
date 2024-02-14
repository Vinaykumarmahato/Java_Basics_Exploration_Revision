public class Enhance_For_Loop_In_2D_Array {

    public static void main(String[] args) {

        int array[][] = {

                { 23, 54, 56, 756, 78 },
                { 22, 12, 13, 13, 14 },
                { 90, 98, 87, 89, 798 }

        };

        for (int N[] : array) {

            for (int all : N) {

                System.out.print(all+" ");
            }
            System.out.println();

        }
    }
}

public class Enhance_For_Loop_In_2D_Array_Example2 {

    public static void main(String[] args) {

        int array[][] = {

                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 },
                { 34, 90, 98, 87, 97, 98 }

        };

        for (int dub[] : array) {

            for (int all : dub) {

                System.out.print(all + " ");
            }

            System.out.println();
        }
    }
}

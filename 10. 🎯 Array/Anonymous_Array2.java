class Anonymous1{

    
    public void display1(int arr[]) {
        for (int all : arr) {
            System.out.print(all + " ");
        }
    }
}

public class Anonymous_Array2 {
    
    public static void main(String[] args) {


        Anonymous1 object=new Anonymous1();
    object.display1(new int[]{95,98,54,856,55,65});

    }
}



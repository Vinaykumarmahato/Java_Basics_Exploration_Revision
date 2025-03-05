



class Anonymous{

    public void dis(int x[]){

        for(int y:x){
            System.out.print(y+" ");

        }
    }
}


public class Anonymous_Array1 {
    
    public static void main(String[] args) {
        Anonymous obj=new Anonymous();
        obj.dis(new int[]{54,58,85,968,68});
        // here we are not giving the name of the array so it is Anonymous array.

    }
}

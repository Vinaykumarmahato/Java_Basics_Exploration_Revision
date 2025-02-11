
class coreJava{

 public void display1 (String names[]){

        for(String vinay:names){

            System.out.println(vinay);
        }
      
    }
}



public class Anonymous_Array3 {
    public static void main(String[] args) {
        coreJava obj=new coreJava();

        obj.display1(new String[]{"vinay kumar","rahul sahani","Lakshman kumar"});
        

    }
}

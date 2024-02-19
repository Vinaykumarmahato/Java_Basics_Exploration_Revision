class Data{

    public static String getData(){
        return "My name is Vinay Kumar";

    }
}

public class ReturnStatement2 {
    
    public static void main(String[] args) {
        
        Data result=new Data();
       String name= result.getData();
       System.out.println(name);
    }
}

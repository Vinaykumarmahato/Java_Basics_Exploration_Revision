
public class ReturnStatementInJava {

    public static void main(String[] args) {

        System.out.println("hello");
        int data = GetData();
        String name = GetName();

        System.out.println(name);

        System.out.println(data);

    }

    public static int GetData(){
        return 20;
      // this fun will give the output 20

      }

      public static String GetName(){

        return "Vinay Kumar";
    }
}


class emp{

    int empid;
    int salary; // non static
  static  String CEO; // static variable
  // if we will use class name during using static key word wo don't need object.

static{
    CEO="ADV Indian Coder"; // for initializing static variable we use a static block.
    // this will execute when we load a class.
    System.out.println("In static");
}

  public emp(){ // for initializing static variable  we use constructor
    // constructor will be excute when we create a objject

    empid=1;
    salary=330000;
    System.out.println("in constructor");

  }


public void show(){

    System.out.println(empid + " " + salary + " " + CEO);
}
}

public class Solution2 {
    
    public static void main(String[] args) {

        // if we want to call main method we don't use object thats why the main method is static, and 
        // and due to it the syntax of the main methos enclude static.
        emp vinay = new emp();

       // vinay.empid = 1;
//vinay.salary = 10000;
       // emp.CEO="adv indian coder"; // here we can use class name also and object also due to static string

        emp anish =new emp();
        //anish.empid=2;
       // anish.salary=20000;
        //emp.CEO="DSCET SparkTech";

        vinay.show();
        anish.show();

    }
}


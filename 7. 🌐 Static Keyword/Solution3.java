/**
 * InnerSolution3
 */
class Engineer {

    int EngId;
    int ENGAge;
    int EngSalary;
    static String EngCompany;

    static {
        EngCompany = "ADV Indian Coder"; // it will execute one time when we load a class.
    }

    public void Engineer() { // it will execute when we create a object.
        EngId = 1;
        ENGAge = 21;
        EngSalary = 10000;

    }

    public void show() {

        System.out.println( EngId+ " " + ENGAge + " " + EngSalary + " " + EngCompany);
    }

}

public class Solution3 {

    int i=0; // non static variable

    public static void main(String[] args) {

      //   i=9; we can't use non static variable in static method.

        Engineer vinay = new Engineer();
       // vinay.EngId = 1;
        //vinay.ENGAge = 21;
        //vinay.EngSalary = 10000;

        Engineer anish = new Engineer();
       // anish.EngId = 2;
       // anish.ENGAge = 22;
       // anish.EngSalary = 20000;

        Engineer Divakar = new Engineer();
       // Divakar.EngId = 3;
      //  Divakar.ENGAge = 23;
       // Divakar.EngSalary = 30000;
       vinay.Engineer();
        Divakar.Engineer();
        anish.Engineer();

        vinay.show();
        anish.show();
        Divakar.show();

    }
}

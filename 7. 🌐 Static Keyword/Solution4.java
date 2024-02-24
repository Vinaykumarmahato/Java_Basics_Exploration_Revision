/**
 *  
 */
class Employee  {

    String EmpName;
    int EmpAge;
    int EmpId;
  static  String Company;

    public void Employee(){

        System.out.println(EmpName + " " + EmpAge + " " + EmpId + " " + Company);
    }

    
}

public class Solution4 {
    public static void main(String[] args) {
        
        Employee vinay = new Employee();
        vinay.EmpName = "Vinay";
        vinay.EmpAge = 23;
        vinay.EmpId = 63;
        vinay.Company = "ADV Indian Coder";

        Employee Arjun = new Employee();
        Arjun.EmpName = "Arjun";
        Arjun.EmpAge = 23;
        Arjun.EmpId = 07;
        Arjun.Company = "DSCET Spark Tech";
    }
}

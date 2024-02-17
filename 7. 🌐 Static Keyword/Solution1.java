import java.io.ObjectInputFilter.Status;

class Student{

    int stdid;
    int salary;
    String CEO;


    public void data(){

        System.out.println(stdid+" "+salary+" "+CEO);
    }


}

public class Solution1 {
    public static void main(String[] args) {

        Student vinay=new Student();
        vinay.stdid=63;
        vinay.salary=10000;
        vinay.CEO="ADV Indian Coder";


        Student Arjun =new Student();

        Arjun.stdid=07;
        Arjun.salary=500000;
        Arjun.CEO="Laura Lahasun";

        vinay.data();
        Arjun.data();

        

    }
}

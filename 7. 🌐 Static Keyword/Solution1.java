
class Student {

    int stdid;
    int salary;
   static String CEO;
   // when here static was not involbe we were getting the o/p according to the user different ceo name
   // but now due to this static the ceo name will be same for diffferent object 
   // when we will have static keyword we can use class name or a normal object name.

    public void data() {

        System.out.println(stdid + " " + salary + " " + CEO);
    }

}

public class Solution1 {
    public static void main(String[] args) {

        Student vinay = new Student();
        vinay.stdid = 63;
        vinay.salary = 10000;
        vinay.CEO = "ADV Indian Coder";

        Student Arjun = new Student();

        Arjun.stdid = 07;
        Arjun.salary = 500000;
        Arjun.CEO = "anish kumar";
        Arjun.CEO="ADV Indian Coder";

        vinay.data();
        Arjun.data();

    }
}

class human{


   private int age;
    private String name;
// if i will make this two as private it cant be access by another class
// but it is possible by the Method

public int getAge(){

    return age;
}

public void setAge(int a) {
	
	age=a;
}

public void setName(String n) {
	
	name=n;
}

public String getName(){

    return name;
}

}

public class Demo {
    
    public static void main(String[] args) {
    human obj=new human();
    
    obj.setAge(20);
    obj.setName("Vinay Kumar");

    human anish=new human();
    anish.setAge(21);
    anish.setName("Anish Kumar");
 
    
    System.out.println(obj.getAge());
    System.out.println(obj.getName());
    
    System.out.println(anish.getAge());
    System.out.println(anish.getName());
    
    
    }
}
/*
 * 
 * lets see one real life examplle 
 * suppose you have a box and under the box you are having your personal data 
 * now if someone ask for you data might be you can provide that data if its personal you 
 * also cant provide the data 
 * 

 according too you you will so lets see 
 */
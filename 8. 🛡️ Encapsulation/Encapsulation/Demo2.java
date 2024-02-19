package Encapsulation;

class  Student{
	private String stdName;// ="vinay Kumar";
	private String stdAddress;
	private int age;
	private double number;
	// these are all the private so it can't  be access in another class by creating an object.
	// so lets see how can we do it
	
	// we create  the method for this 
	
	public void setstdName(String n) {
		stdName=n;
	}
	
	public void setAddress(String add) {
		
		stdAddress=add;
	}
	
	public void setstdAge(int Age) {
		
		age=Age;
		
	}
	
	public void setStdNumber(double num) {
		
		number-=num;
	}
	
	
	public String getStdName() {
		
		return stdName;
	}
	
	public String getstdAddress() {
		
		return stdAddress;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getNumber() {
		
		return number;
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		
		
		Student Anish=new Student();
		
		Anish.setstdName("Anish Kumar");
		Anish.setAddress("Saran");
		Anish.setstdAge(20);
		Anish.setStdNumber(9931860);
		
		
		
		
		System.out.println(Anish.getStdName());
		System.out.println(Anish.getAge());
		System.out.println(Anish.getstdAddress());
		System.out.println(Anish.getNumber());
		
		
		
		// System.out.println(obj.SetName());
		
		

	}

}

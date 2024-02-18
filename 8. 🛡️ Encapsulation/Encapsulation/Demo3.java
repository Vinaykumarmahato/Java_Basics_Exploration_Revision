package Encapsulation;
class Info{
	
	private String name;
	private int age;
	
	public void setName(String n) {
		
		name=n;
	}
	
	public void setAge(int Age) {
		
		age=Age;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		Info vinay=new Info();
		
		vinay.setAge(21);
		vinay.setName("Vinay Kumar Mahato");
		System.out.println(vinay.getName());
		System.out.println(vinay.getAge());

	}

}

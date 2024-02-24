package Encapsulation;

class StudentInformation{
	
	private String name;
	private int age;
	private String company;
	
	public void SetName(String Name) {
		
		name=Name;
		
	}
	
	public void SetAge(int Age) {
		
		age=Age;
	}
	
	public void SetCompanyName(String CompanyName) {
		
		company =CompanyName;
	}
	
	public String GetName() {
		return name;
	}
	
	public int  GetAge() {
		return age;
	}
	
	public String GetCompanyName() {
		return company;
	}
}
public class Demo4 {
	
	public static void main(String[] args) {
		
		StudentInformation Vinay= new StudentInformation();
		
		Vinay.SetName("Vinay Kumar");
		Vinay.SetAge(21);
		Vinay.SetCompanyName("ADV Indian Coder");
		System.out.println(Vinay.GetName());
		System.out.println(Vinay.GetAge());
		System.out.println(Vinay.GetCompanyName());
		
		
	}

}

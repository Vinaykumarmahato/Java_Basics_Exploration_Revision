
public class immutableStringSolution1 {

	public static void main(String[] args) {
		
		String brand="ADV Indian Coder";
		System.out.println(brand);// O/P ADV Indian Coder
		
		brand.concat("India");
		System.out.println(brand); // O/P ADV Indian Coder
		
		
		
		String name="Vinay Kumar";
		System.out.println(name);
		name.concat("Founder of ADV Indian Coder");
		System.out.println(name);
		
		
		// the value cant be change in immutable String 
 
	}

}

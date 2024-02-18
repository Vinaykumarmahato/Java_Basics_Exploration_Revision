
public class StringExplanation {

	public static void main(String[] args) {
		// it is the collection of the characters which are enclosed with double coats
		
		/*
		 * String is an Object
		 * its is also a class in java
		 * 
		 * It has two Types
		 * 
		 * Mutable String also known as Memory map: It means thhe String can be change 
		 * 
		 * Immutable: it means the String can not be change ( String builder , StringBuffer
		 * 
		 * 
		 * 
		 * */
		
		// so we can say that it is a class that's why  here below i have created  the object
		
		String name=new String();
		name="Vinay Kumar";
		name.concat("Kumar");
		System.out.println(name);
		
		
		// immutable
		
		String Name="Vinay Kumar";
		// but when we want to change this name then we can use mutable string lets see how?
		
		// Using StringBuilder (mutable)
		StringBuilder Name1 = new StringBuilder("Vinay Kumar"+" ");
		System.out.println("Without Change "+Name1);
		Name1.append("Founder of ADV Indian Coder");
		
		System.out.println("After Change "+Name1);
		
		// Using StringBffer (mutable)
		System.out.println();
		System.out.println("Lets See the StringBuffer");
		System.out.println();
		StringBuffer info=new StringBuffer("ADV Indian Coder"+" ");
		
		info.append("Vinay Kumar");
		
		System.out.println(info);
	
	}

}

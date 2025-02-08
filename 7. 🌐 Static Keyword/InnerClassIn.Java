

class outer{
    int a;
    public void show(){

    }


    class Inner{

        public void Display(){
            System.out.println("Inner Class In Display Method");
        }
    }
}
class InnerClassInJava{

    public static void main(String[] args) {

        outer obj=new outer();
        obj.show();
        outer.Inner obj1 = obj.new Inner(); 

        // for access the inner class we have to create the object of outer class and then we 
        // can create the object of inner class.

        obj1.Display();



        // Inner class can be private, public, protected or default
        // Inner class can access all members of outer class including private members
        // Inner class can be static or non-static
        // Inner class can be abstract or final
        // Inner class can extend any class and implement other interfaces
        // Inner class can be defined inside method, constructor or instance block
        // Inner class cannot have static variables
        // Inner class cannot have
}
}

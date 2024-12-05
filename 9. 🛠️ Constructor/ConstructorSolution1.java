class human {

    private int age;
    private String name;

    public human() { // here no need to write the void keyword because it is a constructor.

        age = 19;
        name = "Vinay Kumar";

        
    }
}

public class ConstructorSolution1 {

    public static void main(String[] args) {

        human obj = new human();
        human obj1 = new human();
        human obj3 = new human();

    }
}

# Encapsulation Example in Java

## Student Class

```java
package Encapsulation;

// Student class demonstrating encapsulation
class Student {
    // Private attributes
    private String stdName; // Default value is commented out ("vinay Kumar")
    private String stdAddress;
    private int age;
    private double number;

    // These are all private so they can't be accessed in another class by creating an object.
    // Let's see how we can do it.

    // Method to set student name
    public void setstdName(String n) {
        stdName = n;
    }

    // Method to set student address
    public void setAddress(String add) {
        stdAddress = add;
    }

    // Method to set student age
    public void setstdAge(int Age) {
        age = Age;
    }

    // Method to set student number
    public void setStdNumber(double num) {
        number -= num;
    }

    // Method to get student name
    public String getStdName() {
        return stdName;
    }

    // Method to get student address
    public String getstdAddress() {
        return stdAddress;
    }

    // Method to get student age
    public int getAge() {
        return age;
    }

    // Method to get student numbers
    public double getNumber() {
        return number;
    }
}


// Demo2 class to showcase the usage of the Student class
public class Demo2 {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student Anish = new Student();

        // Setting values using the provided methods
        Anish.setstdName("Anish Kumar");
        Anish.setAddress("Saran");
        Anish.setstdAge(20);
        Anish.setStdNumber(9931860);

        // Getting and printing values using the provided methods
        System.out.println("Student Name: " + Anish.getStdName());
        System.out.println("Student Age: " + Anish.getAge());
        System.out.println("Student Address: " + Anish.getstdAddress());
        System.out.println("Student Number: " + Anish.getNumber());
    }
}

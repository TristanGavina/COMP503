package Week4;

public class Person {
	// Declare instance variables
    String name;
    int age;

    public static void main(String[] args) {
        //use new to instantiate a Person object
        Person p = new Person();
        
        // Set its instance variables
        p.name = "Bill";
        p.age = 25;
        
        // Print in standard output formatting
        System.out.println("name = " + p.name);
        System.out.println("age = " + p.age);   
    }
}

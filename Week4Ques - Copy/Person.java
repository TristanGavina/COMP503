public class Person {
    // declare instance variables
    String name;
    int age;
    
    public static void main(String[] args) {
        // instantiate a Person object
        Person p = new Person();
        
        // set instance variables
        p.name = "Bill";
        p.age = 25;
        
        // print the instance variables in standard output formatting
        System.out.println("name = " + p.name);
        System.out.println("age = " + p.age);
    }
}

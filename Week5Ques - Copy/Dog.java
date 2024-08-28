public class Dog {
    // Declare private instance variables
    private String name;
    private int age;

    // Constructor method with input parameters for name and age
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Get method for name
    public String getName() {
        return name;
    }

    // Get method for age
    public int getAge() {
        return age;
    }

    // Method to compute and return the age of the dog in person-years
    public int inPersonYears() {
        return age * 7;
    }

    public static void main(String[] args) {
        // Create a Dog instance with "Fido" and 5
        Dog myDog = new Dog("Fido", 5);

        // Print the instance variables
        System.out.println("name = " + myDog.getName());
        System.out.println("age = " + myDog.getAge());

        // Print the return value of inPersonYears()
        System.out.println("inPersonYears = " + myDog.inPersonYears());
    }
}

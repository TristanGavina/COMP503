package Week5;
import java.lang.reflect.*;
public class Dog {
	private String name;
	private int age;
	
	//Constructor
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//get method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//method
	public int inPersonYears() {
		return age * 7;
	}
	
	public static void main(String[] args) {
		Dog myDog = new Dog("Fido", 5);
		System.out.println("name = " + myDog.getName());
		System.out.println("age = " + myDog.getAge());
		System.out.println("inPersonYears = " + myDog.inPersonYears());
	}
}

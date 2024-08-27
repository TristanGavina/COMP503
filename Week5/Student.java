package Week5;
import java.lang.reflect.*;
public class Student {
	private String name;
	private int score;
	
	//constructor
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//get method
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	//set method
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Student Name; " + name + ", Score: " + score;
	}
	
	//main
	public static void main(String[] args) {
		Student student = new Student("Holly Day", 88);
		System.out.println("name = " + student.getName());
		System.out.println("score = " + student.getScore());
	}
}

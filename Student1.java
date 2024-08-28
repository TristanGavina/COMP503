package PastQuiz;

public class Student1 {
	private String name;
	private int score;
	
	//constructor
	public Student1(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "name = " + name + "\n" + "score = " +score;
	}
	public static void main(String[] args) {
		Student1 student = new Student1("Holly Day", 88);
		System.out.println(student);
		System.out.println("name = " +student.getName());
		System.out.println("score = " +student.getScore());
	}
}

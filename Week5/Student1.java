package Week5;
import java.util.Scanner;
public class Student1 {
	private String name;
	private int id;
	private double score;
	
	public Student1 (String name, int id, double score) {
		this.name = name;
		this.id = id;
		this.score = score;
	}
	
	public String checkGrade() {
		if (score >= 79.5 && score <= 100) {
			return "A";
		} else if (score >= 64.5 && score < 79.5) {
			return "B";
		} else if (score >= 49.5 && score < 64.5) {
			return "C";
		} else if (score >= 0 && score < 49.5) {
			return "D";
		} else {
			return "DNC";
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a name:");
		String name = scan.nextLine();
		
		System.out.println("Enter id:");
		int id = scan.nextInt();
		
		System.out.println("Enter score:");
		double score = scan.nextDouble();
		
		Student1 student = new Student1(name, id , score);
		System.out.println("name = " + name);
		System.out.println("id = " + id);
		System.out.println("checkGrade = " + student.checkGrade());
	}
}

package PastQuiz;
import java.util.Scanner;
public class Student2 {

	String name;
	int id;
	double score;
	
	public Student2(String name, int id, double score) {
		this.name = name;
		this.id = id;
		this.score = score;
	}
	
	public String checkGrade() {
		if(score >= 79.5 && score <=100) {
			return "A";
		} else if(score >= 64.5 && score < 79.5) {
			return "B";
		} else if(score >= 49.5 && score < 64.5) {
			return "C";
		} else if (score >= 0 && score < 49.5) {
			return "D";
		} else {
			return "DNC";
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = scan.nextLine();
		System.out.println("Enter id: ");
		int id = scan.nextInt();
		System.out.println("Enter score: ");
		double score = scan.nextDouble();
		
		//instance
		Student2 student = new Student2(name, id, score);
		System.out.println("name = " +student.name);
		System.out.println("id = " +student.id);
		System.out.println("checkGrade = " +student.checkGrade());
		scan.close();
	}
}

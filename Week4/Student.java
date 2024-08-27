package Week4;
import java.util.Scanner;
public class Student {
	
	String name;
	int ID;
	double score;
	
	public Student(String name, int ID, double score) {
		this.name = name;
		this.ID = ID;
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
		
		System.out.print("Enter a name: ");
		String name = scan.nextLine();
		System.out.print("Enter ID: ");
		int ID = scan.nextInt();
		System.out.print("Enter score: ");
		double score = scan.nextDouble();
		
		Student student = new Student(name, ID, score);
		System.out.println("name = " +student.name);
		System.out.println("ID = " +student.ID);
		System.out.println("grade = " +student.checkGrade());
		scan.close();
	}
}

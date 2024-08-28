package PastQuiz;
import java.util.Scanner;
public class AgeChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = scan.nextInt();
		if(age > 40) {
			System.out.println("You are old");
		} else {
			System.out.println("You are young");
		}
		scan.close();
}
}


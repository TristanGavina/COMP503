package PastQuiz;
import java.util.Scanner;
public class ECounter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a phrase:");
		String message = scan.nextLine();
		int counter = 0;
		
		for(int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			if(ch == 'e' || ch == 'E') {
				counter++;
			}
		}
		System.out.println("The phrase '" + message + "' contains " + counter + " 'e's.");
		scan.close();
		
	}

}

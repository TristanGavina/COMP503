package Week5;
import java.lang.reflect.*;
public class Grade {
	private int percentage;
	
	//constructor
	public Grade(int percentage) {
		if (percentage >= 0 && percentage <= 100) {
			this.percentage = percentage;
		}
		else {
			this.percentage = 0;
		}
	}
	
	//get method
	public int getPercentage(){
		return percentage;
	}
	
	//main
	public static void main(String[] args) {
		Grade grade = new Grade(-10);
		System.out.println(grade.getPercentage());
	}
}

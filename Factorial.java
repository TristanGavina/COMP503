package PastQuiz;

public class Factorial {

	public static void main(String[] args) {
        //Declare an int variable to represent the total factorial value
        int factorial = 1;
        //Use a for loop to multiply every number between 1 and 10 together
        for(int i = 1; i <= 10;i++) {
        	factorial *= i;
        }
        System.out.print("10! is equal to: ");
        //Use another for loop to print the equation. (hint: to make sure there is no new line, use system.out.print() instead)
        for(int i = 1; i <= 10; i++) {
        	System.out.print(i);
        	if(i < 10) {
        		System.out.print(" x ");
        	}
        }
        System.out.println(" = " + factorial);
	}
	
}

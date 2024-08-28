package PastQuiz;

public class ReverseString {
	public static void main(String[] args) {
		String original = "Hello World!";
		String reversed = reverseString(original);
		System.out.println(reversed);
	}
	
	public static String reverseString(String input) {
		int length = input.length();
		String reversed = "";
		int i = length - 1;
		while (i >= 0) {
			reversed += input.charAt(i);
			i--;
		}
		return reversed;
	}
}

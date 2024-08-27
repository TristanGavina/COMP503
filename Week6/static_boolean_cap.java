package Week6;

public class static_boolean_cap {
	static boolean cap(char[] array) {
		for (char value : array) {
			if(value < 'A' || value > 'Z') {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(cap(new char[] {'A','B','C','9'}));
	}

}

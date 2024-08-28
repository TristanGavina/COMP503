package PastQuiz;

public class static_int_sum {
	
	static int sum(int[] array) {
		int sum = 0;
		for(int value : array) {
		if(value > 0) {
			sum += value;
		}
	}
	return sum;
	}
	
	//testing
	//public static void main(String[] args) {
		//System.out.println(sum(new int[] {10,4,5,6,7}));
	//}
	
}

package Week6;

public class static_int_sum {
	static int sum(int[] array) {
		int sum = 0;
		for (int value : array) {
			if(value > 0) {
				sum += value;
			}
		}
		return sum;
	}
	//public static void main(String[] args) {
		//System.out.println(sum(new int[] {}));
	//}
}

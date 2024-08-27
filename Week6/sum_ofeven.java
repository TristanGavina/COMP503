package Week6;

public class sum_ofeven {
	static int sumOfEvens(int [] array) {
		int sum = 0;
		for (int value : array) {
			if(value % 2 == 0) {
				sum += value;
			}
		}
		return sum;
	}
	
	public static void main (String[] args) {
		System.out.println(sumOfEvens(new int[]{1,2,3,4,5,6}));
	}
	

}

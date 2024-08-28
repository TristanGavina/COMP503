package PastQuiz;

public class static_int_max {

	static int max(int[] array) {
		 if(array.length == 0){
		        return 0;
		    }
		    int max = array[0];
		    for(int value: array){
		        if(value > max){
		            max = value;
		        }
		    }
		   return max;
	}
	
	public static void main(String[] args) {
		System.out.println(max(new int[]{-10,-4,-5,-6,-7}));
	}
}

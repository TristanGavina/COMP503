package PastQuiz;
//import java.util.Arrays;
public class int_occurances {
	static int occurrences(int nb, int[] numbers) {
		int count = 0;
	    for (int number : numbers){
	        if(number == nb){
	            count++;
	        }
	    }
	    return count; 
	}
	
	//testing
	//public static void main(String[] args) {
		//int [] numbers = {1,2,3,4,5}; int nb = 2;
		//System.out.println(nb+" occurs "+occurrences(nb,numbers)+" times in "+Arrays.toString(numbers));
	//}

}

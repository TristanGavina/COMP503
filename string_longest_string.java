package PastQuiz;
import java.util.Arrays;
public class string_longest_string {
	
	public static String longestString(String[] word) {
	    if (word == null || word.length == 0) {
	        return "";
	    }
	    
	    String longest = word[0];
	    
	    for (String words : word) {
	        if (words.length() > longest.length()) {
	            longest = words;
	        }
	    }
	    
	    return longest;
	}	    
	
	public static void main(String[] args) {
		String[] words = {"boolean","","byte","case","char","class","default","do","double"};
		System.out.println("longest string from "+Arrays.toString(words)+" is: "+longestString(words));

	}

}

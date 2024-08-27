package Week6;

public class static_boolean_found {
	static boolean found(boolean[] array) {
		for(boolean value : array) {
			if(!value){
				return false;
			}
		}
		return true;
	}
	
	//public static void main(String[] args) {
		//System.out.println(found(new boolean[]{true,false,true}));
	//}

}

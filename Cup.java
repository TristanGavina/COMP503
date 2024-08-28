package PastQuiz;

public class Cup {
	//declare instance var here
	 private int fluidAmount;
	 //write constructor here
	 public Cup() {
		 this.fluidAmount = 1;
	 }
	    
	 //write get method here 
	 public int getFluidAmount() {
		 return fluidAmount;
	 }
	 //write pour method here
	 public void pour(int ml) {
		 if(fluidAmount >= 250) {
			 fluidAmount = 250;
		 } else {
			 fluidAmount += ml;
		 }
	 }
	  
	//write empty method here
	 public void empty() {
		 fluidAmount = 0;
	 }
	 //write isFull method here
	 public boolean isFull() {
		 if(fluidAmount >= 250) {
			 return true;
		 } else {
			 return false;
		 }
	 }

	    public static void main(String[] args) {
	       //initialise Cup object here
	    	Cup cup = new Cup();
	    	cup.pour(300);
	    	System.out.println("fluidAmount = " + cup.getFluidAmount());
	    	System.out.println("isFull = " + cup.isFull());
	    }
}

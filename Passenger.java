package PastQuiz;

public class Passenger {

	//Declare instance variables here
	int age;
	boolean student;
    
    //Write the constructor
    public Passenger(int age, boolean student) {
    	this.age = age;
    	this.student = student;
    }
    
    //Write a method to compute the fare according to the conditions
   public double computeFare() {
	   if(age >= 0 && age <= 10) {
		   return 0.0;
	   } else if(age > 65) {
		   return 1.25; 
	   } else if(student) {
		   return 1.50;
	   } else {
		   return 2.0;
	   }
   }
     
    
    //Complete the main method
    public static void main(String[] args) {
        // create three Passenger objects
    	Passenger p1 = new Passenger(20, true);
    	Passenger p2 = new Passenger(3, false);
    	Passenger p3 = new Passenger(70, true);
        // Print instance variables and fare in standard output format        
    	System.out.println("age = " +p1.age);
    	System.out.println("student = " +p1.student);
    	System.out.println("computeFare = " + p1.computeFare()); 
    	
    	System.out.println("age = " +p2.age);
    	System.out.println("student = " +p2.student);
    	System.out.println("computeFare = " + p2.computeFare());
    	
    	System.out.println("age = " +p3.age);
    	System.out.println("student = " +p3.student);
    	System.out.println("computeFare = " + p3.computeFare()); 
    }
}

package Week4;

public class Passenger {
	int age;
	boolean student;
	
	public Passenger(int age, boolean student) {
		this.age = age;
		this.student = student;
	}

	public double computeFare() {
		if (age >= 0 && age <= 10) {
			return 0.0;
		} else if (age > 65) {
			return 1.25;
		} else if (student) {
			return 1.50;
		} else {
			return 2.0;
		}
	}
	
	public static void main(String[] args) {
		Passenger p = new Passenger(20, true);
		Passenger p1 = new Passenger(3, false);
		Passenger p2 = new Passenger(70, true);
		
		System.out.println("age = " +p.age);
		System.out.println("student = " +p.student);
		System.out.println("computeFare = " +p.computeFare());
		
		System.out.println("age = " +p1.age);
		System.out.println("student = " +p1.student);
		System.out.println("computeFare = " +p1.computeFare());
		
		System.out.println("age = " +p2.age);
		System.out.println("student = " +p2.student);
		System.out.println("computeFare = " +p2.computeFare());

	}
}

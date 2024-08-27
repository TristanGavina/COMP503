package Week4;

public class Car {
	String factory;
	String model;
	int year;
	String colour;
	
	public Car(String factory, String model, int year, String colour) {
		this.factory = factory;
		this.model = model;
		this.year = year;
		this.colour = colour;
	}
	
	public int carAge() {
		return 2024 - this.year;
	}
	
	public static void main(String[] args) {
		Car c = new Car("BMW" , "X5" , 2021 , "Black");
		
		System.out.println("Factory = " +c.factory);
		System.out.println("Model = " +c.model);
		System.out.println("Year = " +c.year);
		System.out.println("Colour = " +c.colour);
		System.out.println("Car Age = " +c.carAge());
	}

}

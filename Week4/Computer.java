package Week4;

public class Computer {
	String brand;
	int ramSize;
	int storageCapacity;
	
	public Computer(String brand, int ramSize, int storageCapacity) {
		this.brand = brand;
		this.ramSize = ramSize;
		this.storageCapacity = storageCapacity;
	}
	
	public void displaySpecs() {
		System.out.println("Brand = " +brand);
		System.out.println("RAM Size = " +ramSize +" GB");
		System.out.println("Storage Capacity = " +storageCapacity +" GB");
	}
	public static void main(String[] args) {
		Computer c = new Computer("Dell", 16, 512);
		Computer c1 = new Computer("HP", 8, 256);
		
		c.displaySpecs();
		c1.displaySpecs();
	}

}

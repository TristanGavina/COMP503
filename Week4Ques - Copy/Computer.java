
public class Computer {
	
	String brand;
	int ramSize;
	int storageCapacity;
	
	public Computer(String brand, int ramSize, int storageCapacity)
	{
		this.brand = brand;
		this.ramSize = ramSize;
		this.storageCapacity = storageCapacity;
	}
	
	public String displaySpecs() 
	{
		return "Brand = " + brand + "\n" + "RAM Size = " + ramSize + " GB\n" + "Storage Capacity = " + storageCapacity + " GB";
	}
	
	public static void main(String[] args)
	{
		Computer comp1 = new Computer("Dell", 16, 512);
		Computer comp2 = new Computer("HP", 8, 256);
		
		System.out.println(comp1.displaySpecs());
		System.out.println(comp2.displaySpecs());
		
		
	}
	
}

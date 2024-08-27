package Week4;

public class MobilePhone {
	String brand;
	double screenSize;
	int batteryLife;
	
	public MobilePhone(String brand, double screenSize, int batteryLife) {
		this.brand = brand;
		this.screenSize = screenSize;
		this.batteryLife = batteryLife;
	}
	
	public int checkBatteryLife() {
		return 100 - this.batteryLife;
	}
	
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone("Samsung", 6.2, 80);
		MobilePhone mp1 = new MobilePhone("Apple", 6.5, 65);
		
		System.out.println("brand = " +mp.brand);
		System.out.println("Screen Size = " +mp.screenSize);
		System.out.println("Battery Life = " +mp.batteryLife);
		System.out.println("Used Battery Life = " +mp.checkBatteryLife() +"%");
		
		System.out.println("brand = " +mp1.brand);
		System.out.println("Screen Size = " +mp1.screenSize);
		System.out.println("Battery Life = " +mp1.batteryLife);
		System.out.println("Used Battery Life = " +mp1.checkBatteryLife() +"%");
		
	}
}

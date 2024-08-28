public class MobilePhone {
    // Declare instance variables
    private String brand;
    private double screenSize;
    private int batteryLife;

    // Constructor
    public MobilePhone(String brand, double screenSize, int batteryLife) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    // Method to check battery life used percentage
    public int checkBatteryLife() {
        return 100 - batteryLife;
    }

    public static void main(String[] args) {
        // Create instances of MobilePhone
        MobilePhone mp1 = new MobilePhone("Samsung", 6.2, 80);
        MobilePhone mp2 = new MobilePhone("Apple", 6.5, 65);

        // Print instance variables
        System.out.println("brand = " + mp1.brand);
        System.out.println("Screen Size = " + mp1.screenSize);
        System.out.println("Battery Life = " + mp1.checkBatteryLife() + "%");
        System.out.println("Used Battery Life = " + mp1.checkBatteryLife() + "%");

        System.out.println("brand = " + mp2.brand);
        System.out.println("Screen Size = " + mp2.screenSize);
        System.out.println("Used Battery Life = " + mp2.checkBatteryLife() + "%");
    }
}

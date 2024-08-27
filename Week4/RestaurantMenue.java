package Week4;

public class RestaurantMenue {
	String itemName;
    double price;
    String category;
    public RestaurantMenue(String itemName, double price, String category) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }
    public double priceForTwo() {
        return this.price * 2;
    }
    
    public static void main(String[] args) {
        // Create two instances of RestaurantMenu
        RestaurantMenue rm = new RestaurantMenue("Grilled Salmon", 16.99, "Main");
        RestaurantMenue rm1 = new RestaurantMenue("Chocolate Cake", 6.49, "Dessert");
        System.out.println("Item name = " +rm.itemName);
        System.out.println("Price = " +rm.price +"$");
        System.out.println("Category = " +rm.category);
        System.out.println("Price for Two Persons = " +rm.priceForTwo() +"$");
       
        System.out.println("Item name = " +rm1.itemName);
        System.out.println("Price = " +rm1.price +"$");
        System.out.println("Category = " +rm1.category);
        System.out.println("Price for Two Persons = " +rm1.priceForTwo() +"$");
    }
    
    
}

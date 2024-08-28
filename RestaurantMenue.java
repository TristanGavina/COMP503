package PastQuiz;

public class RestaurantMenue {
	//declare instance variables here
    String itemName;
    double price;
    String category;
    
    //Constructor Method
    public RestaurantMenue(String itemName, double price, String category) {
    	this.itemName = itemName;
    	this.price = price;
    	this.category = category;
    }
    
    //Method
    public double priceForTwo() {
    	return this.price * 2;
    }
    
    public static void main(String[] args)
    {
        // Creating instances of RestaurantMenue
        RestaurantMenue rm1 = new RestaurantMenue("Grilled Salmon", 16.99, "Main");
        RestaurantMenue rm2 = new RestaurantMenue("Chocolate Cake", 6.49, "Dessert");
        // Printing instance variables and price for two persons for food1
        System.out.println("Item = " + rm1.itemName);
        System.out.println("Price = " + rm1.price + "$");
        System.out.println("Category = " + rm1.category);
        System.out.println("Price for Two Person = " + rm1.priceForTwo() + "$");
        // Printing instance variables and price for two persons for food2
        System.out.println("Item = " + rm2.itemName);
        System.out.println("Price = " + rm2.price + "$");
        System.out.println("Category = " + rm2.category);
        System.out.println("Price for Two Person = " + rm2.priceForTwo() + "$");
        //print in standard output formatting
        // Item Name = 
        // Price = 
        // Category = 
        // Price for Two Persons = 
        
    }

}

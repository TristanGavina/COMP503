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
        return price * 2;
    }

    public static void main(String[] args) {
        RestaurantMenue rm1 = new RestaurantMenue("Grilled Salmon", 16.99, "Main");
        RestaurantMenue rm2 = new RestaurantMenue("Chocolate Cake", 6.49, "Dessert");

        System.out.println("Item Name = " + rm1.itemName);
        System.out.println("Price = " + rm1.price + "$");
        System.out.println("Category = " + rm1.category);
        System.out.println("Price for Two Persons = " + String.format("%.2f", rm1.priceForTwo()) + "$");

        System.out.println("Item Name = " + rm2.itemName);
        System.out.println("Price = " + rm2.price + "$");
        System.out.println("Category = " + rm2.category);
        System.out.println("Price for Two Persons = " + String.format("%.2f", rm2.priceForTwo()) + "$");
    }
}

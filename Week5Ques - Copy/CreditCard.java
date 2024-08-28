public class CreditCard {
    // Declare private instance variables
    private int owing;
    private String name;

    // Constructor method with input parameter for name
    public CreditCard(String name) {
        this.name = name;
        this.owing = -1; // Initialize owing to -1
    }

    // Get method for owing
    public int getOwing() {
        return owing;
    }

    // Method to spend an amount, decrementing the value of owing
    public void spend(int amount) {
        if (amount >= 0) {
            owing -= amount;
        }
    }

    // Method to pay back an amount, incrementing the value of owing without exceeding 0
    public void payback(int amount) {
        if (amount >= 0) {
            owing += amount;
            if (owing > 0) {
                owing = 0;
            }
        }
    }

    public static void main(String[] args) {
        // Create a CreditCard instance with "Robin Banks" as the name
        CreditCard card = new CreditCard("Robin Banks");

        // Spend $50 using the CreditCard instance
        card.spend(50);
        // Print the owing amount
        System.out.println("owing = " + card.getOwing()); // Output: -51

        // Pay back $100 to the CreditCard instance
        card.payback(100);
        // Print the owing amount
        System.out.println("owing = " + card.getOwing()); // Output: 0
    }
}

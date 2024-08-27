package Week4;

public class BankAccount {
    // Declare instance variables
    String name;
    int balance;

    public static void main(String[] args) {
        // Use new to instantiate a BankAccount object
        BankAccount ba = new BankAccount();
        
        // Set its instance variables
        ba.name = "Robin Banks";
        ba.balance = 10;
        
        // Print in standard output formatting
        System.out.println("name = " + ba.name);
        System.out.println("balance = " + ba.balance);   
    }
}







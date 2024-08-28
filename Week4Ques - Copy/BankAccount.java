public class BankAccount {
   
    String name;
    int balance;

    public static void main(String[] args) {
    
        BankAccount ba = new BankAccount();

        ba.name = "Robin Banks";
        ba.balance = 10;

        
        System.out.println("name = " + ba.name);
        System.out.println("balance = " + ba.balance);
    }
}

package PastQuiz;

public class BankAccount {
	private int balance;
	private String name;
	
	//constructor
	public BankAccount(String name) {
		this.balance = 1;
		this.name = name;
	}
	
	//get method
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		if(amount <= 0) {
			balance = balance;
		} else {
			balance += amount;
		}
	}
	
	public static void main(String[] args) 
    {
        //create BankAccount here
		BankAccount ba = new BankAccount("Robin Banks");
		ba.deposit(50);
		System.out.println("balance = " + ba.getBalance());
    }
}

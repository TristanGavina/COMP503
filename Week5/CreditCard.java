package Week5;
import java.lang.reflect.*;
public class CreditCard {
	private int owing;
	private String name;
	
	//Constructor
	public CreditCard(String name) {
		this.owing = -1;
		this.name = name;
	}
	
	//get method
	public int getOwing() {
		return owing;
	}
	
	public void spend(int amount) {
		if (amount >= 0) {
			owing -= amount;
		}
	}
	
	public void payback(int amount) {
		if (amount >= 0) {
			owing = Math.min(owing + amount, 0);
		}
	}
	
	public static void main(String[] args) {
		CreditCard card = new CreditCard("Robin Banks");
		
		card.spend(50);
		System.out.println("owing = " + card.getOwing());
		
		card.payback(100);
		System.out.println("owing = " + card.getOwing());
	}
}

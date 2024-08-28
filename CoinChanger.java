package PastQuiz;

public class CoinChanger {
	//declare private instance variables
	private int ten;
	private int twenty;
	private int fifty;
	private int oneDollar;
	private int twoDollar;
	//write constructor here
	public CoinChanger(int ten, int twenty, int fifty, int oneDollar, int twoDollar) {
		this.ten = ten;
		this.twenty = twenty;
		this.fifty = fifty;
		this.oneDollar = oneDollar;
		this.twoDollar = twoDollar;
	}
	//write get methods here
	public int getTen() {
		return ten;
	}
	public int getTwenty() {
		return twenty;
	}
	public int getFifty() {
		return fifty;
	}
	public int getOneDollar() {
		return oneDollar;
	}
	public int getTwoDollar() {
		return twoDollar;
	}
	//write int coinAsCents() method here
	public int coinAsCents() {
		return ten*10 + twenty*20 + fifty*50 + oneDollar*100 + twoDollar*200;
	}
	//write int dollars() method here
	public int dollars() {
		return this.coinAsCents()/100;
	}
	//write int cents() method here
	public int cents() {
		return coinAsCents() % 100;
	}
	public static void main(String[] args)
	{
		//instantiate CoinChanger objects here
		CoinChanger cc = new CoinChanger(3,4,5,6,10);
		System.out.println(cc.getTen());
		System.out.println(cc.getTwenty());
		System.out.println(cc.getFifty());
		System.out.println(cc.getOneDollar());
		System.out.println(cc.getTwoDollar());
		
		//testing
		//CoinChanger coinChanger = new CoinChanger(22, 1, 2, 40, 15);
		//System.out.println(coinChanger.coinAsCents());

		//CoinChanger coinchanger = new CoinChanger(6, 34, 9, 1, 0);
		//System.out.println(coinchanger.dollars());

		//CoinChanger Coinchanger = new CoinChanger(90, 21, 4, 2, 55);
		//System.out.println(Coinchanger.cents());
	}
}

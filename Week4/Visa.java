package Week4;

public class Visa {
	String name;
	int kind;
	
	public Visa(String name, int kind) {
		this.name = name;
		this.kind = kind;
	}
	
	public String description() {
		if(kind == 1) {
			return "Permanent";
		}
		else if (kind == 2) {
			return "Temporary";
		}
		else {
			return "Other";
		}
	}
	
	public static void main(String[] args) {
		Visa v = new Visa("John", 1);
		Visa v1 = new Visa("June", 2);
		
		System.out.println("name = " +v.name);
		System.out.println("kind = " +v.kind);
		System.out.println("name = " +v.description());
		
		System.out.println("name = " +v1.name);
		System.out.println("kind = " +v1.kind);
		System.out.println("name = " +v1.description());
	}

}

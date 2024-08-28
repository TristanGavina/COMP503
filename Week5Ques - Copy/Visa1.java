public class Visa1 {
    String name;
    int kind;

    public Visa1(String name, int kind) {
        this.name = name;
        this.kind = kind;
    }

    public String description() {
        if (kind == 1) {
            return "Permanent";
        } else if (kind == 2) {
            return "Temporary";
        } else {
            return "Other"; 
        }
    }

    public static void main(String[] args) {
        Visa1 v1 = new Visa1("John", 1);
        Visa1 v2 = new Visa1("June", 2);

        System.out.println("name = " + v1.name);
        System.out.println("kind = " + v1.kind);
        System.out.println("description = " + v1.description());
        System.out.println("name = " + v2.name);
        System.out.println("kind = " + v2.kind);
        System.out.println("description = " + v2.description());
    }
}


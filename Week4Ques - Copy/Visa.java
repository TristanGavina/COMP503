public class Visa {
    String name;
    int kind;

    public Visa(String name, int kind) {
        this.name = name;
        this.kind = kind;
    }

    public String description() {
        if (kind == 1) {
            return "Permanent";
        } else if (kind == 2) {
            return "Temporary";
        } else {
            return "Other"; // Corrected capitalization
        }
    }

    public static void main(String[] args) {
        Visa v1 = new Visa("John", 1);
        Visa v2 = new Visa("June", 2);

        System.out.println("name = " + v1.name);
        System.out.println("kind = " + v1.kind);
        System.out.println("description = " + v1.description());
        System.out.println("name = " + v2.name);
        System.out.println("kind = " + v2.kind);
        System.out.println("description = " + v2.description());
    }
}

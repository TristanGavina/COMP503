public class Rectangle {
    // Declare instance variables here
    double width;
    double length;

    // Write constructor here
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Write the area method here
    public double area() {
        return this.width * this.length;
    }

    public static void main(String[] args) {
        // Create instances of Rectangle and print their details
        Rectangle r = new Rectangle(50.5, 25.7);
        
        System.out.println("width = " + r.width);
        System.out.println("length = " + r.length);
        System.out.println("area = " + r.area());
    }
}

public class Passenger {
    // Declare instance variables
    private int age;
    private boolean student;

    // Constructor
    public Passenger(int age, boolean student) {
        this.age = age;
        this.student = student;
    }

    // Method to compute fare according to the conditions
    public double computeFare() {
        if (student) {
            return 1.50;
        } else if (age >= 0 && age <= 10) {
            return 0.00;
        } else if (age >= 65) {
            return 1.25;
        } else {
            return 2.00;
        }
    }

    public static void main(String[] args) {
        // Create three Passenger objects
        Passenger p1 = new Passenger(20, true);
        Passenger p2 = new Passenger(3, false);
        Passenger p3 = new Passenger(70, true);

        // Print instance variables and fare in standard output format
        System.out.println("age = " + p1.age + "\nstudent = " + p1.student + "\ncomputeFare = " + p1.computeFare());
        System.out.println("age = " + p2.age + "\nstudent = " + p2.student + "\ncomputeFare = " + p2.computeFare());
        System.out.println("age = " + p3.age + "\nstudent = " + p3.student + "\ncomputeFare = " + p3.computeFare());
    }
}

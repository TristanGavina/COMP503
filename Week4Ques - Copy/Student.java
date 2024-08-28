import java.util.Scanner;

public class Student {
    // Declare instance variables
    private String name;
    private int ID;
    private double score;

    // Constructor
    public Student(String name, int ID, double score) {
        this.name = name;
        this.ID = ID;
        this.score = score;
    }

    // Method to check grade based on score
    public String checkGrade() {
        if (score >= 79.5 && score <= 100) {
            return "A";
        } else if (score >= 64.5 && score < 79.5) {
            return "B";
        } else if (score >= 49.5 && score < 64.5) {
            return "C";
        } else if (score >= 0 && score < 49.5) {
            return "D";
        } else {
            return "DNC";
        }
    }

    // Method to provide a description of the student
    public String description() {
        return "name = " + name + "\nID = " + ID + "\ngrade = " + checkGrade();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Receive input from the user
        System.out.print("Enter a name: ");
        String name = scan.nextLine();

        System.out.print("Enter ID: ");
        int ID = scan.nextInt();

        System.out.print("Enter score: ");
        double score = scan.nextDouble();

        // Create an instance of Student with the user's input
        Student student = new Student(name, ID, score);

        // Print the instance variables and grade
        System.out.println(student.description());
    }
}

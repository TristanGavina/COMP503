public class Student1 {
    // Declare private instance variables
    private String name;
    private int score;

    // Constructor method with input parameters for name and score
    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Get method for name
    public String getName() {
        return name;
    }

    // Get method for score
    public int getScore() {
        return score;
    }

    // Set method for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to return a String representation of the Student
    public String toString() {
        return "name = " + name + "\nscore = " + score;
    }

    public static void main(String[] args) {
        // Create a Student instance with "Holly Day" and 88
        Student1 student = new Student1("Holly Day", 88);

        // Print the return value of the toString() method
        System.out.println(student.toString());
    }
}

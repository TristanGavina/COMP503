//This import is necessary for your program to run in code validator
import java.lang.reflect.*;


public class Grade
{
    private int percentage;

    public Grade(int percentage) {
        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            this.percentage = 0;
        }
    }

    public int getPercentage() {
        return percentage;
    }

    public static void main(String[] args) {
        Grade grade1 = new Grade(75);
        System.out.println(grade1.getPercentage()); 

        Grade grade2 = new Grade(-10);
        System.out.println(grade2.getPercentage()); 

        Grade grade3 = new Grade(-100);
        System.out.println(grade3.getPercentage()); 

        Grade grade4 = new Grade(100);
        System.out.println(grade4.getPercentage()); 
    }
}


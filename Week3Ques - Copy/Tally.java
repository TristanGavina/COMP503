import java.util.Scanner;

public class Tally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tally = 0;
        int input;

        do {
            System.out.print("Please enter a number. 0 to quit: ");
            input = scanner.nextInt();
            tally += input;
            System.out.println("tally = " + tally);
        } while (input != 0);
    }
}

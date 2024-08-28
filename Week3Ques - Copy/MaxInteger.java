import java.util.Scanner;

public class MaxInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int input;

        do {
            System.out.print("Please Enter a Number: ");
            input = scanner.nextInt();

            if (input > max) {
                max = input;
            }

            if (input >= 0) {
                System.out.println("max = " + max);
            }

        } while (input >= 0);
    }
}

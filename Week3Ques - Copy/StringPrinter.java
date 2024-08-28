import java.util.Scanner;

public class StringPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String message = scanner.nextLine();

        for (int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i));
        }
    }
    
}

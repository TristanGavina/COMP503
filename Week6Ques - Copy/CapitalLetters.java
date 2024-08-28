public class CapitalLetters {
    // Method to check if all chars in the input array are capital letters
    static boolean cap(char[] array) {
        for (char c : array) {
            if (c < 'A' || c > 'Z') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(cap(new char[]{'A', 'B', 'C'})); // Expected output: true
        System.out.println(cap(new char[]{'A', 'B', 'C', '9'})); // Expected output: false
        System.out.println(cap(new char[]{'A', 'B', 'C', 'D', 'x'})); // Expected output: false
    }
}

public class Main {
    // Method to check if all values in the input array are true
    static boolean found(boolean[] array) {
        for (boolean value : array) {
            if (!value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(found(new boolean[]{true, true, true})); // Output: true
        System.out.println(found(new boolean[]{true, false, true})); // Output: false
        System.out.println(found(new boolean[]{true, true, true, true})); // Output: true
    }
}

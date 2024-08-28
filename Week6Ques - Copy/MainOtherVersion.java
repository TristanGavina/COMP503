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


// For the question "Complete the static boolean found(boolean[] array) method to return true if all of the values in the input array are true, and return false otherwise".
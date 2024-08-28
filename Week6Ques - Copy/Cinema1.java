public class Cinema1 {
    final public boolean reserved = true;
    public Boolean seats[][];

    // Constructor to initialize the seats array
    public Cinema1(Boolean[][] seats) {
        this.seats = seats;
    }

    // Method to check if a seat is reserved
    public Boolean isReserved(int row, int col) {
        // Check if the row and col are within the valid range
        if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length) {
            return seats[row][col];
        } else {
            return null; // Return null if the indices are out of range
        }
    }

    public static void main(String[] args) {
        // Test case 1
        Boolean[][] seats1 = {
            {false, false, false},
            {false, false, false},
            {false, false, false}
        };
        Cinema1 cinema1 = new Cinema1(seats1);
        System.out.println(cinema1.isReserved(1, 1)); // Output: false

        // Test case 2
        System.out.println(cinema1.isReserved(4, 3)); // Output: null

        // Test case 3
        System.out.println(cinema1.isReserved(-1, 0)); // Output: null
    }
}

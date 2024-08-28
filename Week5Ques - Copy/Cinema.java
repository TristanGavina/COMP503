public class Cinema {
    private Boolean[][] seats;

    // Constructor to initialize the seats array
    public Cinema(Boolean[][] seats) {
        this.seats = seats;
    }

    // Method to calculate the percentage of reserved seats
    public Double usagePercentage() {
        int reservedSeats = 0;
        int totalSeats = 0;

        // Iterate through each row of seats
        for (Boolean[] row : seats) {
            // Iterate through each seat in the row
            for (Boolean seat : row) {
                totalSeats++; // Increment total seats count
                if (seat) {
                    reservedSeats++; // Increment reserved seats count if the seat is reserved
                }
            }
        }

        // Calculate and return the percentage of reserved seats
        return (reservedSeats / (double) totalSeats) * 100;
    }

    public static void main(String[] args) {
        // Test case 1: All seats are empty
        Boolean[][] seats1 = {
            {false, false, false},
            {false, false, false},
            {false, false, false}
        };
        Cinema cinema1 = new Cinema(seats1);
        System.out.println(cinema1.usagePercentage()); // Output: 0.0

        // Test case 2: Some seats are reserved
        Boolean[][] seats2 = {
            {true, false, false},
            {false, true, false},
            {false, false, true}
        };
        Cinema cinema2 = new Cinema(seats2);
        System.out.println(cinema2.usagePercentage()); // Output: 33.33333333333333

        // Test case 3: All seats are reserved
        Boolean[][] seats3 = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        Cinema cinema3 = new Cinema(seats3);
        System.out.println(cinema3.usagePercentage()); // Output: 100.0

        // Test case 4: Most seats are reserved
        Boolean[][] seats4 = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        Cinema cinema4 = new Cinema(seats4);
        System.out.println(cinema4.usagePercentage()); // Output: 88.88888888888889
    }
}

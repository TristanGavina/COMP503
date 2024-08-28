public class CinemaOtherVersion {
    private Boolean[][] seats;

    public CinemaOtherVersion(Boolean[][] seats) {
        this.seats = seats;
    }

    public Double usagePercentage() {
        int reservedSeats = 0;
        int totalSeats = 0;

        for (Boolean[] row : seats) {
            for (Boolean seat : row) {
                totalSeats++;
                if (seat) {
                    reservedSeats++;
                }
            }
        }

        return (reservedSeats / (double) totalSeats) * 100;
    }
}


// This is for the "writing the public Double usagePercentage() method which returns the percentage of reserved seats over the total capacity of the Cinema Hint: Use the methods available in the Cineam class." Question. 
package by.epam.task2.carriage;

public enum CarriageType {
    SEAT(62), COMMON(81), ECONOM_CLASS(54),
    COUPE(36), SV(18);

    private int numberOfSeats;

    CarriageType(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}

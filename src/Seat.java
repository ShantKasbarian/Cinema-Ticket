public class Seat {
    private int id;
    private int seatNumber;
    private int row;
    private boolean isBooked;

    public Seat(int id, int seatNumber, int row) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.row = row;
        this.isBooked = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}

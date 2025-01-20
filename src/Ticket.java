public class Ticket {
    private int id;
    private int seatId;
    private int customerId;
    private int movieId;

    public Ticket(int id, int seatId, int customerId, int movieId) {
        this.id = id;
        this.seatId = seatId;
        this.customerId = customerId;
        this.movieId = movieId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}

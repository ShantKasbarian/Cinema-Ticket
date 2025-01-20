import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int id;
    private String name;
    private double ticketPrice;
    private List<Seat> seats;

    public Movie(int id, String name, double ticketPrice) {
        this.id = id;
        this.name = name;
        this.ticketPrice = ticketPrice;
        this.seats = new ArrayList<>();

        this.seats.add(new Seat(1, 1, 1));
        this.seats.add(new Seat(2, 2, 1));
        this.seats.add(new Seat(3, 3, 1));
        this.seats.add(new Seat(4, 1, 2));
        this.seats.add(new Seat(5, 2, 2));
        this.seats.add(new Seat(6, 3, 2));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public List<Seat> getSeats() {
        List<Seat> seats = new ArrayList<>();
        seats.addAll(this.seats);
        return seats;
    }
}

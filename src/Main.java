import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "The Dark Knight", 3));
        movies.add(new Movie(2, "Superman: Man of Steel", 4));
        movies.add(new Movie(3, "The dark Knight rises", 2));

        Customer customer = new Customer(
                1,
                "John",
                "john@example.com",
                "0123456789"
        );

        customer.addToBalance(10);

        System.out.println(buyTicket(6, customer, movies.get(0)).getCustomerId());

    }

    public static Ticket buyTicket(int seatId, Customer customer, Movie movie) {
        if (seatId <= 0 || customer == null || (movie.getId() <= 0 && movie.getId() > 3)) {
            throw new RuntimeException("wrong inputs");
        }

        if (customer.getBalance() < movie.getTicketPrice()) {
            throw new RuntimeException("insufficient funds");
        }

        return new Ticket(1, seatId, customer.getId(), movie.getId());
    }
}
package Problems.MovieTicketBookingSystem;

public class MovieTicketBookingSystem {
    public static MovieTicketBookingSystem instance;

    private MovieTicketBookingSystem() {}

    public synchronized static MovieTicketBookingSystem getInstance() {
        if(instance == null) {
            instance = new MovieTicketBookingSystem();
        }
        return instance;
    }
}

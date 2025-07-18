package Problems.MovieTicketBookingSystem;

import Problems.MovieTicketBookingSystem.model.*;

import java.util.HashMap;
import java.util.List;

public class MovieTicketBookingSystem {
    public static MovieTicketBookingSystem instance;
    private HashMap<Integer, User> userMap;
    private HashMap<Integer, Theater> theaterMap;
    private HashMap<Integer, Show> showsMap;

    private MovieTicketBookingSystem() {
        this.theaterMap = new HashMap<>();
        this.userMap = new HashMap<>();
        this.showsMap = new HashMap<>();
    }

    public synchronized static MovieTicketBookingSystem getInstance() {
        if(instance == null) {
            instance = new MovieTicketBookingSystem();
        }
        return instance;
    }

    public Booking bookShow(Movie movie, int showId, List<Integer> seatIdList) {
        // get show by showId
        // check if the seats are unlocked

        return null;
    }

    public void addUser(User user) {
        userMap.put(user.getUserId(), user);
    }

    public void addTheater(Theater theater) {
        theaterMap.put(theater.getTheaterId(), theater);
    }

    public void addShow(Show show) {
        showsMap.put(show.getShowId(), show);
    }
}

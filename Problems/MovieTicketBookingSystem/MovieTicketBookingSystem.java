package Problems.MovieTicketBookingSystem;

import Problems.MovieTicketBookingSystem.model.*;
import Problems.MovieTicketBookingSystem.model.seat.ShowSeat;
import Problems.MovieTicketBookingSystem.seatLock.SeatLockProviderImpl;
import Problems.MovieTicketBookingSystem.service.BookingService;
import Problems.MovieTicketBookingSystem.service.ShowService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieTicketBookingSystem {
    public static MovieTicketBookingSystem instance;
    private HashMap<Integer, User> userMap;
    private HashMap<Integer, Theater> theaterMap;
    private ShowService showService;
    private BookingService bookingService;

    private MovieTicketBookingSystem() {
        this.theaterMap = new HashMap<>();
        this.userMap = new HashMap<>();
        this.showService = new ShowService();
        this.bookingService = new BookingService(showService, new SeatLockProviderImpl(600));
    }

    public synchronized static MovieTicketBookingSystem getInstance() {
        if(instance == null) {
            instance = new MovieTicketBookingSystem();
        }
        return instance;
    }

    public Booking bookShow(User user, int showId, List<Integer> selectedSeatIdList) throws Exception {
        // get show by showId
        Show show = showService.getShow(showId);
        List<ShowSeat> selectedShowSeatList = new ArrayList<>();
        Map<Integer, ShowSeat> showSeatMap = show.getShowSeatMap();
        for(int seatId : selectedSeatIdList) {
            selectedShowSeatList.add(showSeatMap.get(seatId));
        }
        Booking booking = bookingService.createBooking(user, show, selectedShowSeatList);
        // make payment
        return booking;
    }

    public void addUser(User user) {
        userMap.put(user.getUserId(), user);
    }

    public void addTheater(Theater theater) {
        theaterMap.put(theater.getTheaterId(), theater);
    }

    public void addShow(Show show) {
        showService.addShow(show);
    }
}

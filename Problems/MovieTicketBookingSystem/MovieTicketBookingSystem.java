package Problems.MovieTicketBookingSystem;

import Problems.MovieTicketBookingSystem.enums.PaymentMode;
import Problems.MovieTicketBookingSystem.model.*;
import Problems.MovieTicketBookingSystem.model.seat.ShowSeat;
import Problems.MovieTicketBookingSystem.paymentStrategy.PaymentFactory;
import Problems.MovieTicketBookingSystem.seatLock.SeatLockProviderImpl;
import Problems.MovieTicketBookingSystem.service.BookingService;
import Problems.MovieTicketBookingSystem.service.PaymentService;
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
    private PaymentService paymentService;

    private MovieTicketBookingSystem() {
        this.theaterMap = new HashMap<>();
        this.userMap = new HashMap<>();
        this.showService = new ShowService();
        this.bookingService = new BookingService(showService, new SeatLockProviderImpl(600));
        this.paymentService = new PaymentService(new PaymentFactory());
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
        return bookingService.createBooking(user, show, selectedShowSeatList);
    }

    public void makePayment(User user, Booking booking, PaymentMode paymentMode) throws Exception {
        if(paymentService.processPayment(user, booking.getBookingId(), booking.getTotalPrice(), paymentMode)) {
            bookingService.confirmBooking(booking);
        } else {
            // process failed payment
            // unlock seats
        }
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

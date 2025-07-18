package Problems.MovieTicketBookingSystem.service;

import Problems.MovieTicketBookingSystem.model.Booking;
import Problems.MovieTicketBookingSystem.model.Show;
import Problems.MovieTicketBookingSystem.model.User;
import Problems.MovieTicketBookingSystem.model.seat.Seat;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BookingService {
    private Map<String, Booking> bookingMap;

    public BookingService() {
        this.bookingMap = new ConcurrentHashMap<>();
    }

    public Booking createBooking(User user, Show show, List<Seat> seatList) {

        return null;
    }
}

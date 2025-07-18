package Problems.MovieTicketBookingSystem.model;

import Problems.MovieTicketBookingSystem.enums.BookingStatus;
import Problems.MovieTicketBookingSystem.model.seat.ShowSeat;

import java.util.List;
import java.util.UUID;

public class Booking {
    private String bookingId;
    private Show show;
    private User user;
    private List<ShowSeat> bookedSeats;
    private double totalPrice;
    private BookingStatus bookingStatus;

    public Booking(Show show, User user, List<ShowSeat> bookedSeats, double totalPrice) {
        this.bookingId = UUID.randomUUID().toString();
        this.show = show;
        this.user = user;
        this.bookedSeats = bookedSeats;
        this.totalPrice = totalPrice;
        this.bookingStatus = BookingStatus.CREATED;
    }
}

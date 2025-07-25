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

    public String getBookingId() {
        return bookingId;
    }

    public Show getShow() {
        return show;
    }

    public User getUser() {
        return user;
    }

    public List<ShowSeat> getBookedSeats() {
        return bookedSeats;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}

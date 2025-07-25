package Problems.MovieTicketBookingSystem.service;

import Problems.MovieTicketBookingSystem.enums.BookingStatus;
import Problems.MovieTicketBookingSystem.enums.SeatsStatus;
import Problems.MovieTicketBookingSystem.model.Booking;
import Problems.MovieTicketBookingSystem.model.Show;
import Problems.MovieTicketBookingSystem.model.User;
import Problems.MovieTicketBookingSystem.model.seat.ShowSeat;
import Problems.MovieTicketBookingSystem.seatLock.SeatLockProvider;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BookingService {
    private ShowService showService;
    private SeatLockProvider seatLockProvider;
    private Map<String, Booking> bookingMap;

    public BookingService(ShowService showService, SeatLockProvider seatLockProvider) {
        this.showService = showService;
        this.seatLockProvider = seatLockProvider;
        this.bookingMap = new ConcurrentHashMap<>();
    }

    public Booking createBooking(User user, Show show, List<ShowSeat> selectedSeatList) throws Exception {
        // check if any requested seat is unavailable
        if(showService.isAnySeatUnavailable(show, selectedSeatList)) {
            throw new Exception("Seats already booked");
        }
        seatLockProvider.lockSeats(show, user, selectedSeatList);
        Booking newBooking = null;
        try {
            double totalPrice = 0;
            for(ShowSeat selectedSeat : selectedSeatList) {
                totalPrice += selectedSeat.getPrice();
            }
            newBooking = new Booking(show, user, selectedSeatList, totalPrice);
            bookingMap.put(newBooking.getBookingId(), newBooking);
        } catch (Exception e) {
            System.out.println("Couldn't lock seats : " + e.getMessage());
        }
        return newBooking;
    }

    public void confirmBooking(Booking booking) throws Exception {
        for(ShowSeat showSeat : booking.getBookedSeats()) {
            if(!seatLockProvider.validateLock(booking.getShow(), booking.getUser(), showSeat)) {
                throw new Exception("Acquired lock is either invalid or expired");
            }
        }
        if(booking.getBookingStatus() != BookingStatus.CREATED) {
            throw new Exception("Cannot confirm a booking that is not in the CREATED state.");
        }
        markSeatsAsBooked(booking.getBookedSeats());
        booking.setBookingStatus(BookingStatus.CONFIRMED);
    }

    private void markSeatsAsBooked(List<ShowSeat> showSeatList) {
        synchronized (showSeatList) {
            for(ShowSeat showSeat : showSeatList) {
                showSeat.setSeatStatus(SeatsStatus.BOOKED);
            }
        }
    }
}

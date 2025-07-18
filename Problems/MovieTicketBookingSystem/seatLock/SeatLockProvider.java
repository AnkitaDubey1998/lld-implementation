package Problems.MovieTicketBookingSystem.seatLock;

import Problems.MovieTicketBookingSystem.model.Show;
import Problems.MovieTicketBookingSystem.model.User;
import Problems.MovieTicketBookingSystem.model.seat.Seat;

import java.util.List;

public interface SeatLockProvider {
    void lockSeats(Show show, User user, List<Seat> seatList);
    void unlockSeats(Show show, User user, List<Seat> seatList);
    void validateLock(Show show, User user, Seat seat);
}

package Problems.MovieTicketBookingSystem.seatLock;

import Problems.MovieTicketBookingSystem.model.Show;
import Problems.MovieTicketBookingSystem.model.User;
import Problems.MovieTicketBookingSystem.model.seat.Seat;
import Problems.MovieTicketBookingSystem.model.seat.ShowSeat;

import java.util.List;

public interface SeatLockProvider {
    void lockSeats(Show show, User user, List<ShowSeat> seatList) throws Exception;
    void unlockSeats(Show show, User user, List<ShowSeat> seatList);
    boolean validateLock(Show show, User user, ShowSeat seat);
}

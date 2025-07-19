package Problems.MovieTicketBookingSystem.seatLock;

import Problems.MovieTicketBookingSystem.model.Show;
import Problems.MovieTicketBookingSystem.model.User;
import Problems.MovieTicketBookingSystem.model.seat.SeatLock;
import Problems.MovieTicketBookingSystem.model.seat.ShowSeat;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SeatLockProviderImpl implements SeatLockProvider {
    private final Integer lockTimeout;
    private final Map<Show, Map<ShowSeat, SeatLock>> lockedSeatsMap;

    public SeatLockProviderImpl(Integer lockTimeout) {
        this.lockTimeout = lockTimeout;
        this.lockedSeatsMap = new ConcurrentHashMap<>();
    }

    @Override
    public void lockSeats(Show show, User user, List<ShowSeat> requestedSeatList) throws Exception {
        Map<ShowSeat, SeatLock> showLockedSeatsMap = lockedSeatsMap.get(show);
        synchronized (showLockedSeatsMap) {
            // check if any of the requested seats is already locked and the lock is still valid
            for(ShowSeat seat : requestedSeatList) {
                if(showLockedSeatsMap.containsKey(seat)) {
                    SeatLock seatLock = showLockedSeatsMap.get(seat);
                    if(!seatLock.isLockExpired()) {
                        throw new Exception("Seat " + seat.getSeatId() + " is already locked.");
                    }
                }
            }
            // all seats are available, lock them together
            for(ShowSeat seat : requestedSeatList) {
                SeatLock seatLock = new SeatLock(seat, show, user, new Date(), lockTimeout);
                showLockedSeatsMap.put(seat, seatLock);
            }
        }
    }

    @Override
    public void unlockSeats(Show show, User user, List<ShowSeat> seatList) {

    }

    @Override
    public void validateLock(Show show, User user, ShowSeat seat) {

    }
}

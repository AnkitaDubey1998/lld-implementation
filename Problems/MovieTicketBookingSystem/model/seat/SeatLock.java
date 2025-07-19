package Problems.MovieTicketBookingSystem.model.seat;

import Problems.MovieTicketBookingSystem.model.Show;
import Problems.MovieTicketBookingSystem.model.User;

import java.time.Instant;
import java.util.Date;

public class SeatLock {
    private ShowSeat seat;
    private Show show;
    private User lockedByUser;
    private Date lockTime;
    private Integer timeoutInSeconds;

    public SeatLock(ShowSeat seat, Show show, User lockedByUser, Date lockTime, Integer timeoutInSeconds) {
        this.seat = seat;
        this.show = show;
        this.lockedByUser = lockedByUser;
        this.lockTime = lockTime;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    public boolean isLockExpired() {
        Instant lockTimeoutInstant = lockTime.toInstant().plusSeconds(timeoutInSeconds);
        Instant currentInstant =new Date().toInstant();
        return lockTimeoutInstant.isBefore(currentInstant);
    }

    public Seat getSeat() {
        return seat;
    }

    public Show getShow() {
        return show;
    }

    public User getLockedByUser() {
        return lockedByUser;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }
}

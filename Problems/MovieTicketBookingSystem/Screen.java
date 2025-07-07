package Problems.MovieTicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int screenId;
    List<Seat> seats;

    public Screen(int screenId, List<Seat> seats) {
        this.screenId = screenId;
        this.seats = seats;
    }
}

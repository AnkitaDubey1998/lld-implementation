package Problems.MovieTicketBookingSystem.model;

import Problems.MovieTicketBookingSystem.model.seat.Seat;

import java.util.HashMap;

public class Screen {
    int screenId;
    HashMap<Integer, Seat> seatsMap;

    public Screen(int screenId) {
        this.screenId = screenId;
        this.seatsMap = new HashMap<>();
    }

    public void addSeat(Seat seat) {
        seatsMap.put(seat.getSeatId(), seat);
    }

    public int getScreenId() {
        return screenId;
    }

    public HashMap<Integer, Seat> getSeatsMap() {
        return seatsMap;
    }
}

package Problems.MovieTicketBookingSystem.model;

import Problems.MovieTicketBookingSystem.model.seat.ShowSeat;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Show {
    int showId;
    LocalDateTime showStartTime;
    LocalDateTime showEndTime;
    Movie movie;
    Screen screen;
    HashMap<Integer, ShowSeat> showSeatMap;

    public Show(int showId, LocalDateTime showStartTime, LocalDateTime showEndTime, Movie movie, Screen screen) {
        this.showId = showId;
        this.showStartTime = showStartTime;
        this.showEndTime = showEndTime;
        this.movie = movie;
        this.screen = screen;
        this.showSeatMap = new HashMap<>();
    }

    public void addShowSeat(ShowSeat showSeat) {
        showSeatMap.put(showSeat.getSeatId(), showSeat);
    }

    public int getShowId() {
        return showId;
    }

    public LocalDateTime getShowStartTime() {
        return showStartTime;
    }

    public LocalDateTime getShowEndTime() {
        return showEndTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public HashMap<Integer, ShowSeat> getShowSeatMap() {
        return showSeatMap;
    }
}

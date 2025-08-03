package Problems.MovieTicketBookingSystem.service;

import Problems.MovieTicketBookingSystem.enums.SeatStatus;
import Problems.MovieTicketBookingSystem.model.Show;
import Problems.MovieTicketBookingSystem.model.seat.ShowSeat;

import java.util.HashMap;
import java.util.List;

public class ShowService {
    private final HashMap<Integer, Show> showsMap;

    public ShowService() {
        this.showsMap = new HashMap<>();
    }

    public void addShow(Show show) {
        showsMap.put(show.getShowId(), show);
    }

    public Show getShow(int showId) throws Exception {
        if(!showsMap.containsKey(showId)) {
            throw  new Exception("Show with ID : " + showId + "not found.");
        }
        return showsMap.get(showId);
    }

    public boolean isAnySeatUnavailable(Show show, List<ShowSeat> selectedSeatList) {
        HashMap<Integer, ShowSeat> showSeatMap = show.getShowSeatMap();
        for(ShowSeat selectedSeat : selectedSeatList) {
            ShowSeat showSeat = showSeatMap.get(selectedSeat.getSeatId());
            if(showSeat == null || showSeat.getSeatStatus() != SeatStatus.AVAILABLE) {
                return true;
            }
        }
        return false;
    }
}

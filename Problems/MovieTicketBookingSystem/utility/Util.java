package Problems.MovieTicketBookingSystem.utility;

import Problems.MovieTicketBookingSystem.enums.SeatType;
import Problems.MovieTicketBookingSystem.model.Movie;
import Problems.MovieTicketBookingSystem.model.Screen;
import Problems.MovieTicketBookingSystem.model.Show;
import Problems.MovieTicketBookingSystem.model.Theater;
import Problems.MovieTicketBookingSystem.model.seat.Seat;
import Problems.MovieTicketBookingSystem.model.seat.ShowSeat;

import java.time.LocalDateTime;
import java.util.Map;

public class Util {

    public static Show createShow(int showId, Movie movie, Screen screen) {
        Show show = new Show(showId, LocalDateTime.now(), LocalDateTime.now().plusMinutes(movie.getMovieDurationInMinutes()), movie, screen);
        Map<Integer, Seat> seatMap = screen.getSeatsMap();
        for(Seat seat : seatMap.values()) {
            double seatPrice;
            if(movie.getMovieName().equals("Avengers")) {
                if(seat.getSeatType().equals(SeatType.PREMIUM)) {
                    seatPrice = 300;
                } else {
                    seatPrice = 200;
                }
            } else {
                if(seat.getSeatType().equals(SeatType.PREMIUM)) {
                    seatPrice = 200;
                } else {
                    seatPrice = 100;
                }
            }
            ShowSeat showSeat = new ShowSeat(seat, seatPrice);
            show.addShowSeat(showSeat);
        }
        System.out.println("created show : " + show.getShowId());
        return show;
    }

    public static Theater createTheater(int theaterId, String theaterName, int cityId) {
        Theater theater = new Theater(theaterId, theaterName, cityId);
        theater.addScreen(createScreen(1));
        theater.addScreen(createScreen(2));
        System.out.println("created theater : " + theaterName);
        return theater;
    }

    private static Screen createScreen(int screenId) {
        Screen screen = new Screen(screenId);
        int seatId = 1;
        for(int row = 1; row <= 2; row++) {
            for(int seatNumber = 1; seatNumber <= 10; seatNumber++) {
                Seat seat = new Seat(seatId, seatNumber, row, SeatType.PREMIUM);
                screen.addSeat(seat);
                seatId++;
            }
        }
        for(int row = 3; row <= 5; row++) {
            for(int seatNumber = 1; seatNumber <= 10; seatNumber++) {
                Seat seat = new Seat(seatId, seatNumber, row, SeatType.NORMAL);
                screen.addSeat(seat);
                seatId++;
            }
        }
        System.out.println("created screen : " + screenId);
        return screen;
    }
}

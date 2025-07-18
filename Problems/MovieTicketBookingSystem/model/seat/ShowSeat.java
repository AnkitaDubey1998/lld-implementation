package Problems.MovieTicketBookingSystem.model.seat;

import Problems.MovieTicketBookingSystem.enums.SeatType;
import Problems.MovieTicketBookingSystem.enums.SeatsStatus;

public class ShowSeat extends Seat {
    double price;
    SeatsStatus seatsStatus;

    public ShowSeat(Seat seat, double price) {
        super(seat.getSeatId(), seat.getSeatNumber(), seat.getRow(), seat.getSeatType());
        this.price = price;
        this.seatsStatus = SeatsStatus.AVAILABLE;
    }

    public boolean isBooked() {
        return this.seatsStatus == SeatsStatus.BOOKED;
    }
}

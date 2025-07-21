package Problems.MovieTicketBookingSystem.model.seat;

import Problems.MovieTicketBookingSystem.enums.SeatsStatus;

public class ShowSeat extends Seat {
    double price;
    SeatsStatus seatStatus;

    public ShowSeat(Seat seat, double price) {
        super(seat.getSeatId(), seat.getSeatNumber(), seat.getRow(), seat.getSeatType());
        this.price = price;
        this.seatStatus = SeatsStatus.AVAILABLE;
    }

    public boolean isBooked() {
        return this.seatStatus == SeatsStatus.BOOKED;
    }

    public double getPrice() {
        return price;
    }

    public SeatsStatus getSeatStatus() {
        return seatStatus;
    }
}

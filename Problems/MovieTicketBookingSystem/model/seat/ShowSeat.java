package Problems.MovieTicketBookingSystem.model.seat;

import Problems.MovieTicketBookingSystem.enums.SeatStatus;

public class ShowSeat extends Seat {
    double price;
    SeatStatus seatStatus;

    public ShowSeat(Seat seat, double price) {
        super(seat.getSeatId(), seat.getSeatNumber(), seat.getRow(), seat.getSeatType());
        this.price = price;
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    public boolean isBooked() {
        return this.seatStatus == SeatStatus.BOOKED;
    }

    public double getPrice() {
        return price;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

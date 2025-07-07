package Problems.MovieTicketBookingSystem;

import Problems.MovieTicketBookingSystem.enums.SeatsStatus;

public class ShowSeat extends Seat {
    double price;
    SeatsStatus seatsStatus;

    public boolean isBooked() {
        return this.seatsStatus == SeatsStatus.BOOKED;
    }
}

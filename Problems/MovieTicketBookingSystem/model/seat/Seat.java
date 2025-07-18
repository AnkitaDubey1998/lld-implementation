package Problems.MovieTicketBookingSystem.model.seat;

import Problems.MovieTicketBookingSystem.enums.SeatType;

public class Seat {
    int seatId;
    int seatNumber;
    int row;
    SeatType seatType;

    public Seat(int seatId, int seatNumber, int row, SeatType seatType) {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        this.row = row;
        this.seatType = seatType;
    }

    public int getSeatId() {
        return seatId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRow() {
        return row;
    }

    public SeatType getSeatType() {
        return seatType;
    }
}

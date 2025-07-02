package Problems.ParkingLotImplementation.fee;

import Problems.ParkingLotImplementation.Ticket;

public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}

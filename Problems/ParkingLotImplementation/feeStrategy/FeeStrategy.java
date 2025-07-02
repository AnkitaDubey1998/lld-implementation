package Problems.ParkingLotImplementation.feeStrategy;

import Problems.ParkingLotImplementation.Ticket;

public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}

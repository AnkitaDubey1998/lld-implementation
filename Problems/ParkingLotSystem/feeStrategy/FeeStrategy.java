package Problems.ParkingLotSystem.feeStrategy;

import Problems.ParkingLotSystem.Ticket;

public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}

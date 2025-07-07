package Problems.ParkingLotSystem.feeStrategy;

import Problems.ParkingLotSystem.Ticket;

public class FlatRateFeeStrategy implements FeeStrategy {

    private static final double FLAT_RATE_PER_HOUR = 10.0;

    @Override
    public double calculateFee(Ticket ticket) {
        long  duration = (ticket.getExitTimestamp() - ticket.getEntryTimestamp());
        long divisor = 1000 * 60 * 60;
        long hours = duration / divisor;
        if(duration % divisor != 0) {
            hours = hours + 1;
        }
        return hours * FLAT_RATE_PER_HOUR;
    }

}

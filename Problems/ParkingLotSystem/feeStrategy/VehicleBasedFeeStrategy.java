package Problems.ParkingLotSystem.feeStrategy;

import Problems.ParkingLotSystem.Ticket;
import Problems.ParkingLotSystem.Type;

import java.util.Map;

public class VehicleBasedFeeStrategy implements FeeStrategy {

    private static final Map<Type, Double> hourlyRates = Map.of(
            Type.TWO_WHEELER, 10.0,
            Type.FOUR_WHEELER, 20.0,
            Type.HLV, 30.0
    );

    @Override
    public double calculateFee(Ticket ticket) {
        long  duration = (ticket.getExitTimestamp() - ticket.getEntryTimestamp());
        long divisor = 1000 * 60 * 60;
        long hours = duration / divisor;
        if(duration % divisor != 0) {
            hours = hours + 1;
        }
        return hours * hourlyRates.get(ticket.getVehicle().getVehicleType());
    }
}

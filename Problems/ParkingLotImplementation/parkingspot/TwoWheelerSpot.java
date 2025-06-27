package Problems.ParkingLotImplementation.parkingspot;

import Problems.ParkingLotImplementation.Type;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

public class TwoWheelerSpot extends ParkingSpot{
    public TwoWheelerSpot(int spotId) {
        super(spotId, Type.TWO_WHEELER);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == Type.TWO_WHEELER;
    }
}

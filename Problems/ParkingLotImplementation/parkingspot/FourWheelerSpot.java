package Problems.ParkingLotImplementation.parkingspot;

import Problems.ParkingLotImplementation.Type;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

public class FourWheelerSpot extends ParkingSpot{
    public FourWheelerSpot(int spotId) {
        super(spotId, Type.FOUR_WHEELER);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == Type.FOUR_WHEELER;
    }
}

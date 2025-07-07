package Problems.ParkingLotSystem.parkingspot;

import Problems.ParkingLotSystem.Type;
import Problems.ParkingLotSystem.vehicle.Vehicle;

public class FourWheelerSpot extends ParkingSpot{
    public FourWheelerSpot(int spotId) {
        super(spotId, Type.FOUR_WHEELER);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == Type.FOUR_WHEELER;
    }
}

package Problems.ParkingLotImplementation.parkingspot;

import Problems.ParkingLotImplementation.Type;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

public class HLVSpot extends ParkingSpot {
    public HLVSpot(int spotId) {
        super(spotId, Type.HLV);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == Type.HLV;
    }
}

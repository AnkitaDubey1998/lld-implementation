package Problems.ParkingLotSystem.parkingspot;

import Problems.ParkingLotSystem.Type;
import Problems.ParkingLotSystem.vehicle.Vehicle;

public class HLVSpot extends ParkingSpot {
    public HLVSpot(int spotId) {
        super(spotId, Type.HLV);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == Type.HLV;
    }
}

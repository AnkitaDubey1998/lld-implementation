package Problems.ParkingLotImplementation.parkingStrategy;

import Problems.ParkingLotImplementation.ParkingFloor;
import Problems.ParkingLotImplementation.parkingspot.ParkingSpot;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class DefaultParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot getParkingSpot(List<ParkingFloor> floorList, Vehicle vehicle) {
        for(ParkingFloor floor : floorList) {
            Optional<ParkingSpot> optionSpot = floor.getAvailableSpot(vehicle);
            if(optionSpot.isPresent()) {
                return optionSpot.get();
            }
        }
        return null;
    }
}

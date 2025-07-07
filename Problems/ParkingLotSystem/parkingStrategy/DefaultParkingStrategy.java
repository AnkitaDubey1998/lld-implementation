package Problems.ParkingLotSystem.parkingStrategy;

import Problems.ParkingLotSystem.ParkingFloor;
import Problems.ParkingLotSystem.parkingspot.ParkingSpot;
import Problems.ParkingLotSystem.vehicle.Vehicle;

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

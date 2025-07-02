package Problems.ParkingLotImplementation.parkingStrategy;

import Problems.ParkingLotImplementation.ParkingFloor;
import Problems.ParkingLotImplementation.parkingspot.ParkingSpot;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot getParkingSpot(List<ParkingFloor> parkingFloorList, Vehicle vehicle);
}

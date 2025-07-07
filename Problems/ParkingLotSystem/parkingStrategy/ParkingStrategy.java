package Problems.ParkingLotSystem.parkingStrategy;

import Problems.ParkingLotSystem.ParkingFloor;
import Problems.ParkingLotSystem.parkingspot.ParkingSpot;
import Problems.ParkingLotSystem.vehicle.Vehicle;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot getParkingSpot(List<ParkingFloor> parkingFloorList, Vehicle vehicle);
}

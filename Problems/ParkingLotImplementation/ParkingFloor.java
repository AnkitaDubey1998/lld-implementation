package Problems.ParkingLotImplementation;

import Problems.ParkingLotImplementation.parkingspot.ParkingSpot;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpotList;

    public ParkingFloor(int floorNumber, List<ParkingSpot> parkingSpotList) {
        this.floorNumber = floorNumber;
        this.parkingSpotList = parkingSpotList;
    }

    public Optional<ParkingSpot> getAvailableSpot(Vehicle vehicle) {
        return parkingSpotList.stream()
                .filter(spot -> spot.isEmpty() && spot.canFitVehicle(vehicle))
                .findFirst();
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}

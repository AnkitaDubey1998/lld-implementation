package Problems.ParkingLotImplementation.parkingspot;

import Problems.ParkingLotImplementation.Type;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

public abstract class ParkingSpot {
    private int spotId;
    private Type spotType;
    private boolean isEmpty;
    private Vehicle vehicle;

    public ParkingSpot(int spotId, Type spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.isEmpty = true;
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        if(!isEmpty()) {
            return false;
        }
        this.vehicle = vehicle;
        this.isEmpty = false;
        return true;
    }

    public synchronized void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    public abstract boolean canFitVehicle(Vehicle vehicle);

    public int getSpotId() {
        return spotId;
    }

    public synchronized boolean isEmpty() {
        return isEmpty;
    }
}

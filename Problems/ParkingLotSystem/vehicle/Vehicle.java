package Problems.ParkingLotSystem.vehicle;

import Problems.ParkingLotSystem.Type;

public abstract class Vehicle {
    private String vehicleNumber;
    private Type vehicleType;

    public Vehicle(String vehicleNumber, Type vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public Type getVehicleType() {
        return vehicleType;
    }
}

package Problems.ParkingLotSystem;

import Problems.ParkingLotSystem.parkingspot.ParkingSpot;
import Problems.ParkingLotSystem.vehicle.Vehicle;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private long entryTimestamp;
    private long exitTimestamp;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTimestamp = new Date().getTime();
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public long getEntryTimestamp() {
        return entryTimestamp;
    }

    public long getExitTimestamp() {
        return exitTimestamp;
    }

    public void setExitTimestamp(long exitTimestamp) {
        this.exitTimestamp = exitTimestamp;
    }
}

package Problems.ParkingLotSystem;

import Problems.ParkingLotSystem.feeStrategy.FeeStrategy;
import Problems.ParkingLotSystem.feeStrategy.FlatRateFeeStrategy;
import Problems.ParkingLotSystem.parkingStrategy.DefaultParkingStrategy;
import Problems.ParkingLotSystem.parkingStrategy.ParkingStrategy;
import Problems.ParkingLotSystem.parkingspot.ParkingSpot;
import Problems.ParkingLotSystem.vehicle.Vehicle;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> floorList = new ArrayList<>();
    private Map<String, Ticket> activeTickets = new ConcurrentHashMap<>();
    private ParkingStrategy parkingStrategy;
    private FeeStrategy feeStrategy;

    private ParkingLot() {
        // parkingStrategy and feeStrategy can change according to requirement
        this.parkingStrategy = new DefaultParkingStrategy();
        this.feeStrategy = new FlatRateFeeStrategy();
    }

    public static synchronized ParkingLot getInstance() {
        if(instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addFloor(ParkingFloor parkingFloor) {
        floorList.add(parkingFloor);
    }

    public synchronized Ticket parkVehicle(Vehicle vehicle) throws Exception {
        ParkingSpot parkingSpot = parkingStrategy.getParkingSpot(floorList, vehicle);
        if(parkingSpot != null && parkingSpot.parkVehicle(vehicle)) {
            Ticket ticket = new Ticket(vehicle, parkingSpot);
            activeTickets.put(vehicle.getVehicleNumber(), ticket);
            return ticket;
        }
        throw new Exception("No available spot for " + vehicle.getVehicleType());
    }

    public synchronized void unParkVehicle(String vehicleNumber) throws Exception {
        Ticket ticket = activeTickets.remove(vehicleNumber);
        if(ticket == null) {
            throw new Exception("Ticket not found for vehicle number " + vehicleNumber);
        }
        ticket.setExitTimestamp(new Date().getTime());
        double fee = feeStrategy.calculateFee(ticket);
        System.out.println("Vehicle : " + ticket.getVehicle().getVehicleNumber() + " fee : " + fee);
        // make payment => call PaymentService class
        System.out.println("Making payment ..... Payment successful\n");
        ticket.getParkingSpot().removeVehicle();
    }
}

package Problems.ParkingLotImplementation;

import Problems.ParkingLotImplementation.fee.FeeStrategy;
import Problems.ParkingLotImplementation.fee.FlatRateFeeStrategy;
import Problems.ParkingLotImplementation.parkingspot.ParkingSpot;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> floorList = new ArrayList<>();
    private Map<String, Ticket> activeTickets = new ConcurrentHashMap<>();
    private FeeStrategy feeStrategy;

    private ParkingLot() {
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
        for(ParkingFloor floor : floorList) {
            Optional<ParkingSpot> optionSpot = floor.getAvailableSpot(vehicle);
            if(optionSpot.isPresent()) {
                ParkingSpot parkingSpot = optionSpot.get();
                if(parkingSpot.parkVehicle(vehicle)) {
                    Ticket ticket = new Ticket(vehicle, parkingSpot);
                    activeTickets.put(vehicle.getVehicleNumber(), ticket);
                    return ticket;
                }
            }
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
        // make payment => call PaymentService
        System.out.println("Making payment ..... Payment successful\n");
        ticket.getParkingSpot().removeVehicle();
    }
}

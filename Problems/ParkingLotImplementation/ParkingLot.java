package Problems.ParkingLotImplementation;

import Problems.ParkingLotImplementation.parkingspot.ParkingSpot;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> floorList = new ArrayList<>();
//    private Map<>

    private ParkingLot() {}

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
                    return ticket;
                }
            }
        }
        throw new Exception("No available spot for " + vehicle.getVehicleType());
    }
}

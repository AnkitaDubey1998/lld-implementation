package Problems.ParkingLotImplementation;

import Problems.ParkingLotImplementation.parkingspot.ParkingSpot;
import Problems.ParkingLotImplementation.parkingspot.ParkingSpotFactory;
import Problems.ParkingLotImplementation.vehicle.Bike;
import Problems.ParkingLotImplementation.vehicle.Truck;
import Problems.ParkingLotImplementation.vehicle.Vehicle;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        // parking spots of 1st floor
        List<ParkingSpot> floor1Spots = List.of(
                ParkingSpotFactory.createParkingSpot(101, Type.TWO_WHEELER),
                ParkingSpotFactory.createParkingSpot(102, Type.FOUR_WHEELER),
                ParkingSpotFactory.createParkingSpot(103, Type.FOUR_WHEELER),
                ParkingSpotFactory.createParkingSpot(104, Type.FOUR_WHEELER),
                ParkingSpotFactory.createParkingSpot(105, Type.HLV),
                ParkingSpotFactory.createParkingSpot(106, Type.HLV)
        );
        // parking spots of 1st floor
        List<ParkingSpot> floor2Spots = List.of(
                ParkingSpotFactory.createParkingSpot(201, Type.TWO_WHEELER),
                ParkingSpotFactory.createParkingSpot(202, Type.TWO_WHEELER),
                ParkingSpotFactory.createParkingSpot(203, Type.TWO_WHEELER),
                ParkingSpotFactory.createParkingSpot(204, Type.FOUR_WHEELER),
                ParkingSpotFactory.createParkingSpot(205, Type.FOUR_WHEELER),
                ParkingSpotFactory.createParkingSpot(206, Type.FOUR_WHEELER)
        );

        // creating 2 floors by adding parking spots
        ParkingFloor floor1 = new ParkingFloor(1, floor1Spots);
        ParkingFloor floor2 = new ParkingFloor(2, floor2Spots);

        // adding floors in parking lot
        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        // vehicles
        Vehicle bike1 = new Bike("ABC111");
        Vehicle bike2 = new Bike("ABC222");
        Vehicle truck1 = new Truck("DEF111");
        Vehicle truck2 = new Truck("DEF222");
        Vehicle truck3 = new Truck("DEF333");

        // park vehicles
        try {
            Ticket ticket1 = parkingLot.parkVehicle(bike1);
            System.out.println("Bike 1 parked\nTicket Id : " + ticket1.getTicketId() + ", Parking spot : " + ticket1.getParkingSpot().getSpotId() + "\n");

            Ticket ticket2 = parkingLot.parkVehicle(bike2);
            System.out.println("Bike 2 parked\nTicket Id : " + ticket2.getTicketId() + ", Parking spot : " + ticket2.getParkingSpot().getSpotId() + "\n");

            Ticket ticket3 = parkingLot.parkVehicle(truck1);
            System.out.println("Truck 1 parked\nTicket Id : " + ticket3.getTicketId() + ", Parking spot : " + ticket3.getParkingSpot().getSpotId() + "\n");

            Ticket ticket4 = parkingLot.parkVehicle(truck2);
            System.out.println("Truck 2 parked\nTicket Id : " + ticket4.getTicketId() + ", Parking spot : " + ticket4.getParkingSpot().getSpotId() + "\n");

            // trying to park anothe rtruck when spots are full for HLV
            Ticket ticket5 = parkingLot.parkVehicle(truck3);
            System.out.println("Truck 3 parked\nTicket Id : " + ticket5.getTicketId() + ", Parking spot : " + ticket5.getParkingSpot().getSpotId() + "\n");
        } catch (Exception e) {
            System.out.println("Exception while parking : " + e.getMessage() + "\n");
        }

        // Un-Park vehicles
        try {
            // valid vehicle number
            parkingLot.unParkVehicle(bike1.getVehicleNumber());

            // trying to un-park invalid vehicle number
            parkingLot.unParkVehicle("XYZ890");
        } catch (Exception e) {
            System.out.println("Exception while un-parking : " + e.getMessage() + "\n");
        }
    }
}

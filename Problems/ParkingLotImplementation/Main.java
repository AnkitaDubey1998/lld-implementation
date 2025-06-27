package Problems.ParkingLotImplementation;

import Problems.ParkingLotImplementation.parkingspot.ParkingSpot;
import Problems.ParkingLotImplementation.parkingspot.ParkingSpotFactory;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        List<ParkingSpot> floor1Spots = List.of(
                ParkingSpotFactory.createParkingSpot(101, Type.TWO_WHEELER),
                ParkingSpotFactory.createParkingSpot(102, Type.FOUR_WHEELER),
                ParkingSpotFactory.createParkingSpot(103, Type.FOUR_WHEELER),
                ParkingSpotFactory.createParkingSpot(104, Type.HLV),
                ParkingSpotFactory.createParkingSpot(105, Type.HLV),
                ParkingSpotFactory.createParkingSpot(106, Type.HLV)
        );

        List<ParkingSpot> floor2Spots = List.of(
                ParkingSpotFactory.createParkingSpot(201, Type.TWO_WHEELER),
                ParkingSpotFactory.createParkingSpot(202, Type.TWO_WHEELER),
                ParkingSpotFactory.createParkingSpot(203, Type.TWO_WHEELER),
                ParkingSpotFactory.createParkingSpot(204, Type.FOUR_WHEELER),
                ParkingSpotFactory.createParkingSpot(205, Type.FOUR_WHEELER),
                ParkingSpotFactory.createParkingSpot(206, Type.HLV)
        );

        ParkingFloor floor1 = new ParkingFloor(1, floor1Spots);
        ParkingFloor floor2 = new ParkingFloor(2, floor2Spots);

        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

    }
}

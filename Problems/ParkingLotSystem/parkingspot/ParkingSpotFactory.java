package Problems.ParkingLotSystem.parkingspot;

import Problems.ParkingLotSystem.Type;

public class ParkingSpotFactory {

    public static ParkingSpot createParkingSpot(int spotId, Type type) {
        return switch (type) {
            case TWO_WHEELER -> new TwoWheelerSpot(spotId);
            case FOUR_WHEELER -> new FourWheelerSpot(spotId);
            case HLV -> new HLVSpot(spotId);
            default -> throw new IllegalArgumentException("Unknown parking spot type : " + type);
        };
    }

}

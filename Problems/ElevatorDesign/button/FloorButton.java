package Problems.ElevatorDesign.button;

public class FloorButton implements Button{
    private int floorNumber;

    public FloorButton(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public void onPress() {

    }

    public int getFloorNumber() {
        return floorNumber;
    }
}

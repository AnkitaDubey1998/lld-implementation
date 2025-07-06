package Problems.ElevatorDesign.button;

import Problems.ElevatorDesign.enums.DoorAction;

public class DoorButton implements Button {
    private DoorAction doorAction;

    public DoorButton(DoorAction doorAction) {
        this.doorAction = doorAction;
    }

    @Override
    public void onPress() {

    }

    public DoorAction getDoorAction() {
        return doorAction;
    }
}
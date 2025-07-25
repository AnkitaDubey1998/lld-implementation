package Problems.ElevatorSystem;

import Problems.ElevatorSystem.enums.DoorAction;

public class Door {
    private DoorAction doorAction;

    public Door(DoorAction doorAction) {
        this.doorAction = doorAction;
    }

    public void openDoor() {
        this.doorAction = DoorAction.OPEN;
    }

    public void closeDoor() {
        this.doorAction = DoorAction.CLOSE;
    }
}

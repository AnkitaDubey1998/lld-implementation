package Problems.ElevatorImplementation.panel;

import Problems.ElevatorImplementation.button.DoorButton;
import Problems.ElevatorImplementation.button.FloorButton;

import java.util.List;

public class InternalPanel {
    List<FloorButton> floorButtons;
    List<DoorButton> doorButtons;

    public InternalPanel(List<FloorButton> floorButtons, List<DoorButton> doorButtons) {
        this.floorButtons = floorButtons;
        this.doorButtons = doorButtons;
    }
}

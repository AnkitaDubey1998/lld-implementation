package Problems.ElevatorSystem.panel;

import Problems.ElevatorSystem.button.DoorButton;
import Problems.ElevatorSystem.button.FloorButton;

import java.util.List;

public class InternalPanel {
    List<FloorButton> floorButtons;
    List<DoorButton> doorButtons;

    public InternalPanel(List<FloorButton> floorButtons, List<DoorButton> doorButtons) {
        this.floorButtons = floorButtons;
        this.doorButtons = doorButtons;
    }
}

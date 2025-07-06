package Problems.ElevatorDesign.panel;

import Problems.ElevatorDesign.button.DoorButton;
import Problems.ElevatorDesign.button.FloorButton;

import java.util.List;

public class InternalPanel {
    List<FloorButton> floorButtons;
    List<DoorButton> doorButtons;

    public InternalPanel(List<FloorButton> floorButtons, List<DoorButton> doorButtons) {
        this.floorButtons = floorButtons;
        this.doorButtons = doorButtons;
    }
}

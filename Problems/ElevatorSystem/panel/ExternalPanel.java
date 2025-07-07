package Problems.ElevatorSystem.panel;

import Problems.ElevatorSystem.button.DirectionButton;

import java.util.List;

public class ExternalPanel {
    List<DirectionButton> directionButtons;

    public ExternalPanel(List<DirectionButton> directionButtons) {
        this.directionButtons = directionButtons;
    }

    public List<DirectionButton> getDirectionButtons() {
        return directionButtons;
    }

    public void setDirectionButtons(List<DirectionButton> directionButtons) {
        this.directionButtons = directionButtons;
    }
}

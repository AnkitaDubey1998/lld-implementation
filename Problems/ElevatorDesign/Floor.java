package Problems.ElevatorDesign;

import Problems.ElevatorDesign.panel.ExternalPanel;

public class Floor {
    private int floorNumber;
    private ExternalPanel externalPanel;

    public Floor(int floorNumber, ExternalPanel externalPanel) {
        this.floorNumber = floorNumber;
        this.externalPanel = externalPanel;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public ExternalPanel getExternalPanel() {
        return externalPanel;
    }
}

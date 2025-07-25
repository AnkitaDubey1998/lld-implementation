package Problems.ElevatorSystem;

import Problems.ElevatorSystem.button.DirectionButton;
import Problems.ElevatorSystem.button.DoorButton;
import Problems.ElevatorSystem.button.FloorButton;
import Problems.ElevatorSystem.enums.Direction;
import Problems.ElevatorSystem.enums.DoorAction;
import Problems.ElevatorSystem.enums.ElevatorStatus;
import Problems.ElevatorSystem.panel.ExternalPanel;
import Problems.ElevatorSystem.panel.InternalPanel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static int numberOfFloors = 16;   // ground + 15 floors
    static int numberOfElevators = 3;

    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();

        // add floors
        for(int i = 0; i < numberOfFloors; i++) {
            Floor floor = new Floor(i, createExternalPanel());
            elevatorSystem.addFloor(floor);
        }

        // add elevators
        for(int i = 0; i < numberOfElevators; i++) {
            Display display = new Display(0, Direction.UP);
            InternalPanel internalPanel = createInternalPanel();
            Door door = new Door(DoorAction.CLOSE);
            Elevator elevator = new Elevator(i, 0, ElevatorStatus.IDLE, Direction.UP,
                    display, internalPanel, door);
            elevatorSystem.addElevator(elevator);
        }

        // call elevator from floor
        elevatorSystem.callElevatorFrom(1, Direction.UP);
        elevatorSystem.callElevatorFrom(5, Direction.DOWN);
        elevatorSystem.callElevatorFrom(6, Direction.UP);

    }

    /*********************************/

    private static ExternalPanel createExternalPanel() {
        DirectionButton upButton = new DirectionButton(Direction.UP);
        DirectionButton downButton = new DirectionButton(Direction.DOWN);
        return new ExternalPanel(List.of(upButton, downButton));
    }

    private static InternalPanel createInternalPanel() {
        List<FloorButton> floorButtons = new ArrayList<>();
        for(int i = 0; i < numberOfFloors; i++) {
            floorButtons.add(new FloorButton(i));
        }
        DoorButton openButton = new DoorButton(DoorAction.OPEN);
        DoorButton closeButton = new DoorButton(DoorAction.CLOSE);
        List<DoorButton> doorButtons = List.of(openButton, closeButton);
        return new InternalPanel(floorButtons, doorButtons);
    }

}

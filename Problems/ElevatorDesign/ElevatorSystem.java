package Problems.ElevatorDesign;

import Problems.ElevatorDesign.button.DirectionButton;
import Problems.ElevatorDesign.enums.Direction;
import Problems.ElevatorDesign.panel.ExternalPanel;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private static ElevatorSystem instance;
    public static List<Elevator> elevators = new ArrayList<>();
    List<Floor> floors = new ArrayList<>();

    private ElevatorSystem() {}

    public synchronized static ElevatorSystem getInstance() {
        if(instance == null) {
            instance = new ElevatorSystem();
        }
        return instance;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void addElevator(Elevator elevator) {
        elevators.add(elevator);
        new Thread(() -> {
            try {
                elevator.run();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    public void callElevatorFrom(int sourceFloor, Direction direction) {
        System.out.println("Request : " + sourceFloor + " " + direction);
        ExternalPanel panel = floors.get(sourceFloor).getExternalPanel();
        DirectionButton button = panel.getDirectionButtons().stream().filter(b -> b.getDirection().equals(direction)).findFirst().orElseThrow();
        button.getExternalDispatcher().submitRequest(sourceFloor, direction);
    }


}

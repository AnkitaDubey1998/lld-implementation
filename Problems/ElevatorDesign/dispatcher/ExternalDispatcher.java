package Problems.ElevatorDesign.dispatcher;

import Problems.ElevatorDesign.Elevator;
import Problems.ElevatorDesign.ElevatorSystem;
import Problems.ElevatorDesign.enums.Direction;
import Problems.ElevatorDesign.enums.ElevatorStatus;

import java.util.List;

public class ExternalDispatcher {

    List<Elevator> elevators = ElevatorSystem.elevators;

    public void submitRequest(int sourceFloor, Direction direction) {
        Elevator elevator = getBestElevator(sourceFloor, direction);
        System.out.println("Assigned elevator : " + elevator.getElevatorId());
        elevator.addRequest(sourceFloor, direction);
    }

    private Elevator getBestElevator(int sourceFloor, Direction direction) {
        // Basic strategy: pick first idle or nearest in same direction
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;
        for(Elevator elevator : elevators) {
            if(elevator.getElevatorStatus().equals(ElevatorStatus.IDLE)) {
                int distance = Math.abs(elevator.getCurrentFloor() - sourceFloor);
                if(distance < minDistance) {
                    bestElevator = elevator;
                    minDistance = distance;
                }
            } else if(elevator.getDirection() == direction) {
                if((direction == Direction.UP && elevator.getCurrentFloor() <= sourceFloor) ||
                        (direction == Direction.DOWN && elevator.getCurrentFloor() >= sourceFloor)) {
                    int distance = Math.abs(elevator.getCurrentFloor() - sourceFloor);
                    if(distance < minDistance) {
                        bestElevator = elevator;
                        minDistance = distance;
                    }
                }
            }
        }

        // fallback : first elevator
        if(bestElevator == null) {
            bestElevator = elevators.get(0);
        }
        return bestElevator;
    }

}

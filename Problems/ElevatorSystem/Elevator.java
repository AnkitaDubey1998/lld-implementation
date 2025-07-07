package Problems.ElevatorSystem;

import Problems.ElevatorSystem.enums.Direction;
import Problems.ElevatorSystem.enums.ElevatorStatus;
import Problems.ElevatorSystem.panel.InternalPanel;

import java.util.Collections;
import java.util.PriorityQueue;

public class Elevator {
    private int elevatorId;
    private int currentFloor;
    private ElevatorStatus elevatorStatus;
    private Direction direction;
    private Display display;
    private InternalPanel internalPanel;
    private Door door;
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;

    public Elevator(int elevatorId, int currentFloor, ElevatorStatus elevatorStatus, Direction direction,
                    Display display, InternalPanel internalPanel, Door door) {
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
        this.elevatorStatus = elevatorStatus;
        this.direction = direction;
        this.display = display;
        this.internalPanel = internalPanel;
        this.door = door;
        this.upMinPQ =new PriorityQueue<>();
        this.downMaxPQ = new PriorityQueue<>(Collections.reverseOrder());
    }

    public synchronized void addRequest(int floor, Direction direction) {
        if(direction == Direction.UP) {
            upMinPQ.offer(floor);
        } else {
            downMaxPQ.offer(floor);
        }
        notifyAll();
    }

    public void processRequests() throws InterruptedException {
        if (direction == Direction.UP) {
            currentFloor++;
            if (upMinPQ.contains(currentFloor)) {
                upMinPQ.remove(currentFloor);
                openDoors();
            }
            if (upMinPQ.isEmpty()) {
                direction = downMaxPQ.isEmpty() ? Direction.NEUTRAL : Direction.DOWN;
            }
        } else if (direction == Direction.DOWN) {
            currentFloor--;
            if (downMaxPQ.contains(currentFloor)) {
                downMaxPQ.remove(currentFloor);
                openDoors();
            }
            if (downMaxPQ.isEmpty()) {
                direction = upMinPQ.isEmpty() ? Direction.NEUTRAL : Direction.UP;
            }
        } else {
            if (!upMinPQ.isEmpty()) {
                direction = Direction.UP;
            } else if (!downMaxPQ.isEmpty()) {
                direction = Direction.DOWN;
            }
        }
    }

    private void openDoors() throws InterruptedException {
        System.out.println("Elevator " + elevatorId + " stopped at floor " + currentFloor);
        elevatorStatus = ElevatorStatus.IDLE;
        door.openDoor();
        Thread.sleep(1000);
        door.closeDoor();
        elevatorStatus = ElevatorStatus.MOVING;
    }

    public void run() throws InterruptedException {
        processRequests();
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public ElevatorStatus getElevatorStatus() {
        return elevatorStatus;
    }

    public Direction getDirection() {
        return direction;
    }

    public Display getDisplay() {
        return display;
    }

    public InternalPanel getInternalPanel() {
        return internalPanel;
    }

    public Door getDoor() {
        return door;
    }
}

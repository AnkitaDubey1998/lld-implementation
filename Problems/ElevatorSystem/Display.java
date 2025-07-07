package Problems.ElevatorSystem;

import Problems.ElevatorSystem.enums.Direction;

public class Display {
    int floor;
    Direction direction;

    public Display(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void showDisplay() {
        System.out.println("Display : " + floor + " " + direction);
    }
}

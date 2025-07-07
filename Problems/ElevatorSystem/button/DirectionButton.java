package Problems.ElevatorSystem.button;

import Problems.ElevatorSystem.dispatcher.ExternalDispatcher;
import Problems.ElevatorSystem.enums.Direction;

public class DirectionButton implements Button {

    private Direction direction;
    ExternalDispatcher externalDispatcher = new ExternalDispatcher();

    public DirectionButton(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void onPress() {

    }

    public Direction getDirection() {
        return direction;
    }

    public ExternalDispatcher getExternalDispatcher() {
        return externalDispatcher;
    }
}

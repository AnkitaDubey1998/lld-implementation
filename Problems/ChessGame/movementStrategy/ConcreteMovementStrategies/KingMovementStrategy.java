package Problems.ChessGame.movementStrategy.ConcreteMovementStrategies;

import Problems.ChessGame.Cell;
import Problems.ChessGame.movementStrategy.MovementStrategy;

public class KingMovementStrategy implements MovementStrategy {
    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return true;
    }
}

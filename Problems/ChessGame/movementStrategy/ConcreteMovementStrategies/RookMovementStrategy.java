package Problems.ChessGame.movementStrategy.ConcreteMovementStrategies;

import Problems.ChessGame.Cell;
import Problems.ChessGame.movementStrategy.MovementStrategy;

public class RookMovementStrategy implements MovementStrategy {
    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return startCell.getRow() == endCell.getRow() || startCell.getCol() == endCell.getCol();
    }
}

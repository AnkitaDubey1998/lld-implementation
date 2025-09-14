package Problems.ChessGame.movementStrategy;

import Problems.ChessGame.Cell;

public interface MovementStrategy {
    boolean canMove(Cell startCell, Cell endCell);
}

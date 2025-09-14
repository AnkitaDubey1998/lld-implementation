package Problems.ChessGame.piece;

import Problems.ChessGame.Cell;
import Problems.ChessGame.movementStrategy.MovementStrategy;

public abstract class Piece {
    private boolean isWhitePiece;
    private boolean isKilled;
    private MovementStrategy movementStrategy;

    public Piece(boolean isWhitePiece, MovementStrategy movementStrategy) {
        this.isWhitePiece = isWhitePiece;
        this.isKilled = false;
        this.movementStrategy = movementStrategy;
    }

    public boolean canMove(Cell startCell, Cell endCell) {
        return movementStrategy.canMove(startCell, endCell);
    }

    public boolean isWhitePiece() {
        return isWhitePiece;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }
}

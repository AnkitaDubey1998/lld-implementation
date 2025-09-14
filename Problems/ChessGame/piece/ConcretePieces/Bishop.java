package Problems.ChessGame.piece.ConcretePieces;

import Problems.ChessGame.movementStrategy.ConcreteMovementStrategies.BishopMovementStrategy;
import Problems.ChessGame.piece.Piece;

public class Bishop extends Piece {
    public Bishop(boolean isWhitePiece) {
        super(isWhitePiece, new BishopMovementStrategy());
    }
}

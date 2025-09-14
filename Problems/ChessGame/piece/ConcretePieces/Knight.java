package Problems.ChessGame.piece.ConcretePieces;

import Problems.ChessGame.movementStrategy.ConcreteMovementStrategies.KnightMovementStrategy;
import Problems.ChessGame.piece.Piece;

public class Knight extends Piece {
    public Knight(boolean isWhitePiece) {
        super(isWhitePiece, new KnightMovementStrategy());
    }
}

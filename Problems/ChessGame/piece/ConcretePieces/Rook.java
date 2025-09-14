package Problems.ChessGame.piece.ConcretePieces;

import Problems.ChessGame.movementStrategy.ConcreteMovementStrategies.RookMovementStrategy;
import Problems.ChessGame.piece.Piece;

public class Rook extends Piece {
    public Rook(boolean isWhitePiece) {
        super(isWhitePiece, new RookMovementStrategy());
    }
}

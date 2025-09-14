package Problems.ChessGame.piece.ConcretePieces;

import Problems.ChessGame.movementStrategy.ConcreteMovementStrategies.KingMovementStrategy;
import Problems.ChessGame.piece.Piece;

public class King extends Piece {
    public King(boolean isWhitePiece) {
        super(isWhitePiece, new KingMovementStrategy());
    }
}

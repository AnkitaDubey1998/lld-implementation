package Problems.ChessGame.piece.ConcretePieces;

import Problems.ChessGame.movementStrategy.ConcreteMovementStrategies.PawnMovementStrategy;
import Problems.ChessGame.piece.Piece;

public class Pawn extends Piece {
    public Pawn(boolean isWhitePiece) {
        super(isWhitePiece, new PawnMovementStrategy());
    }
}

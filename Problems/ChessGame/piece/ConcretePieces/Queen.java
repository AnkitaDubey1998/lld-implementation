package Problems.ChessGame.piece.ConcretePieces;

import Problems.ChessGame.movementStrategy.ConcreteMovementStrategies.QueenMovementStrategy;
import Problems.ChessGame.piece.Piece;

public class Queen extends Piece {
    public Queen(boolean isWhitePiece) {
        super(isWhitePiece, new QueenMovementStrategy());
    }
}

package Problems.ChessGame.piece;

import Problems.ChessGame.enums.PieceType;
import Problems.ChessGame.piece.ConcretePieces.*;

public class PieceFactory {
    public static Piece createPiece(PieceType pieceType, boolean isWhite) {
        return switch (pieceType) {
            case KING -> new King(isWhite);
            case QUEEN -> new Queen(isWhite);
            case BISHOP -> new Bishop(isWhite);
            case KNIGHT -> new Knight(isWhite);
            case ROOK -> new Rook(isWhite);
            case PAWN -> new Pawn(isWhite);
            default -> throw new IllegalArgumentException("Invalid piece type " + pieceType);
        };
    }
}

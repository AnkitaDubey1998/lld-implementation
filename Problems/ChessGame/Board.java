package Problems.ChessGame;

import Problems.ChessGame.piece.PieceFactory;

import static Problems.ChessGame.enums.PieceType.*;

public class Board {
    Cell[][] board;

    public Board() {
        board = new Cell[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        // white rows
        initializePieceRow(0, true);
        initializePawnRow(1, true);

        // black rows
        initializePawnRow(6, false);
        initializePieceRow(7, false);

        for(int i = 2; i <=5; i++) {
            for(int j = 0; j < 8; j++) {
                board[i][j] = new Cell(i, j, null);
            }
        }
    }

    private void initializePieceRow(int row, boolean isWhite) {
        board[row][0] = new Cell(row, 0, PieceFactory.createPiece(ROOK, isWhite));
        board[row][1] = new Cell(row, 1, PieceFactory.createPiece(KNIGHT, isWhite));
        board[row][2] = new Cell(row, 2, PieceFactory.createPiece(BISHOP, isWhite));
        board[row][3] = new Cell(row, 3, PieceFactory.createPiece(QUEEN, isWhite));
        board[row][4] = new Cell(row, 4, PieceFactory.createPiece(KING, isWhite));
        board[row][5] = new Cell(row, 5, PieceFactory.createPiece(BISHOP, isWhite));
        board[row][6] = new Cell(row, 6, PieceFactory.createPiece(KNIGHT, isWhite));
        board[row][7] = new Cell(row, 7, PieceFactory.createPiece(ROOK, isWhite));
    }

    private void initializePawnRow(int row, boolean isWhite) {
        for(int col = 0; col < 8; col++) {
            board[row][col] = new Cell(row, col, PieceFactory.createPiece(PAWN, isWhite));
        }
    }

    public boolean validCell(int row, int col) {
        return row >= 0 && col >= 0 && row < board.length && col < board.length;
    }

    public Cell getCell(int row, int col) {
        if(row < 0 || col < 0 || row >= board.length || col >= board.length) {
            throw new IllegalArgumentException("Invalid cell at row=" + row + " and col=" + col);
        }
        return board[row][col];
    }
}

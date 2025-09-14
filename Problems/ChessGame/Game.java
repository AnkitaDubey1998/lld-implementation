package Problems.ChessGame;

import Problems.ChessGame.enums.GameStatus;
import Problems.ChessGame.piece.ConcretePieces.King;
import Problems.ChessGame.piece.Piece;

import java.util.Scanner;

import static Problems.ChessGame.enums.GameStatus.*;

public class Game {
    public static Game instance;
    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;
    private boolean isWhiteTurn;
    private GameStatus gameStatus;

    private Game() {
        this.board = new Board();
        this.isWhiteTurn = true;
        this.gameStatus = ACTIVE;
    }

    public synchronized static Game getInstance() {
        if(instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void createPlayer(String whitePLayerName, String blackPlayerName) {
        whitePlayer = new Player(whitePLayerName, true);
        blackPlayer = new Player(blackPlayerName, false);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while(gameStatus == ACTIVE) {
            Player currentPlayer = isWhiteTurn ? whitePlayer : blackPlayer;
            System.out.println("\n" + currentPlayer.getName() + "'s turn");
            System.out.println("Enter source row and column (e.g. 6 4) : ");
            int startRow = scanner.nextInt();
            int startCol = scanner.nextInt();

            System.out.println("Enter destination row and column (e.g. 4 4) : ");
            int endRow = scanner.nextInt();
            int endCol = scanner.nextInt();

            Cell startCell = board.getCell(startRow, endRow);
            Cell endCell = board.getCell(endRow, endCol);

            if(!board.validCell(startRow, startCol)) {
                System.out.println("Give correct source cell");
                continue;
            } else if (!board.validCell(endRow, endCol)) {
                System.out.println("Give correct destination cell");
                continue;
            } else if(startCell.getPiece() == null) {
                System.out.println("No piece at source cell");
                continue;
            }
            makeMove(new Move(startCell, endCell));
        }
        System.out.println("Game Over : " + gameStatus);
    }

    private void makeMove(Move move) {
        if(move.isValidMove()) {
            Piece sourcePiece = move.getStartCell().getPiece();
            Piece destinationPiece = move.getEndCell().getPiece();
            if(sourcePiece.canMove(move.getStartCell(), move.getEndCell())) {
                if(destinationPiece != null) {
                    if(destinationPiece instanceof King) {
                        if(isWhiteTurn) this.gameStatus = WHITE_WIN;
                        else this.gameStatus = BLACK_WIN;
                        return;
                    }
                    destinationPiece.setKilled(true);
                }
                move.getEndCell().setPiece(sourcePiece);
                move.getStartCell().setPiece(null);
                isWhiteTurn = !isWhiteTurn;
            }
        }
    }
}

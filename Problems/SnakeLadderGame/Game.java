package Problems.SnakeLadderGame;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    public static Game instance;
    List<Player> players;
    Board board;
    List<Dice> dices;
    Queue<Player> queue;

    private Game() {
        players = new ArrayList<>();
        dices = new ArrayList<>();
        queue = new LinkedList<>();
    }

    public synchronized static Game getInstance() {
        if(instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void addPlayer(Player player) {
        players.add(player);
        queue.offer(player);
    }

    public void addDices(int n) {
        for(int i = 1; i <= n; i++) {
            dices.add(new Dice(i, 1, 6));
        }
    }

    public void createBoard(int size) {
        board = new Board(size);
    }

    void playGame() {
        System.out.println("\n\n*** GAME STARTS ***\n");
        Player winner = null;
        while(winner == null) {
            Player currentPlayer = queue.poll();
            System.out.println("\n" + currentPlayer.getPlayerName() + " is playing");
            int steps = 0;
            for(Dice dice : dices) {
                steps = steps + dice.roll();
            }
            if(isValidMove(currentPlayer.getCurrentPosition(), steps)) {
                int newPosition = currentPlayer.getCurrentPosition() + steps;
//                currentPlayer.move(newPosition);
                System.out.println("Move " + steps

                        + " steps to : " + newPosition);
                Cell newPositionCell = board.cells[newPosition];
                if(newPositionCell.getJump() != null) {
                    Jump jump = newPositionCell.getJump();
                    if(newPosition > jump.getEnd()) {
                        System.out.println("Bitten by snake : move to " + jump.getEnd());
                    } else {
                        System.out.println("Climb ladder : move to " + jump.getEnd());
                    }
                    newPosition = newPositionCell.getJump().getEnd();
                    if(newPosition == board.cells.length-1) {
                        winner = currentPlayer;
                        System.out.println("\n\nWinner is Player with id : " + winner.getPlayerId() + " name : " + winner.getPlayerName());
                        currentPlayer.move(newPosition);
                    } else if(newPosition < board.cells.length-1) {
                        currentPlayer.move(newPosition);
                    }
                }
            }
            queue.offer(currentPlayer);
        }
        System.out.println("\n\n*** GAME ENDS ***\n");
    }

    private boolean isValidMove(int currentPosition, int steps) {
        return currentPosition + steps < board.cells.length;
    }
}

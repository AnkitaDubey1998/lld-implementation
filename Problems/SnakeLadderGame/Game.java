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
        for(int i = 0; i < n; i++) {
            dices.add(new Dice());
        }
    }

    public void createBoard(int size) {
        board = new Board(size);
    }

    Player startPlay() {
        Player winner = null;
        while(winner == null) {
            Player player = queue.poll();
            int steps = 0;
            for(Dice dice : dices) {
                steps = steps + dice.roll();
            }
            int newPosition = player.getCurrentPosition() + steps;
            Cell dest = board.cells[newPosition];
            if(dest.getJump() != null) {
                newPosition = dest.getJump().getEnd();
            }
            if(newPosition == board.cells.length-1) {
                winner = player;
                player.move(newPosition);
            } else if(newPosition < board.cells.length-1) {
                player.move(newPosition);
            }
            queue.offer(player);
        }
        return winner;
    }
}

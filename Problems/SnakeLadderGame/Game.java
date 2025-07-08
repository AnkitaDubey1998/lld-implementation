package Problems.SnakeLadderGame;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static Game instance;
    List<Player> players;
    Board board;
    List<Dice> dices;

    private Game() {
        players = new ArrayList<>();
        dices = new ArrayList<>();
    }

    public synchronized static Game getInstance() {
        if(instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addDices(int n) {
        for(int i = 0; i < n; i++) {
            dices.add(new Dice());
        }
    }

    public void createBoard(int size) {
        board = new Board(size);
    }

    void startPlay() {

    }
}

package Problems.SnakeLadderGame;

public class Player {
    int playerId;
    String playerName;
    int currentPosition;

    public Player(int playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.currentPosition = 1;
    }

    void move(int position) {
        this.currentPosition = position;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }
}

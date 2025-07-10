package Problems.SnakeLadderGame;

public class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();

        game.createBoard(10);
        game.addDices(2);

        // create and add player
        Player player1 = new Player(1, "Ankita");
        Player player2 = new Player(2, "Urmi");
        Player player3 = new Player(3, "Ria");

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        game.playGame();
    }
}

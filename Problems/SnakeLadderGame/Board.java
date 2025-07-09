package Problems.SnakeLadderGame;

public class Board {
    Cell[] cells;

    public Board(int size) {
        this.cells = new Cell[size*size + 1];
        this.cells[0] = null;
        int count = 1;
        for(int i = 1; i <= size*size; i++) {
            this.cells[i] = new Cell(count);
        }
        // add snakes and ladders
    }
}

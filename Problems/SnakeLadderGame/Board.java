package Problems.SnakeLadderGame;

public class Board {
    Cell[] cells;

    public Board(int size) {
        this.cells = new Cell[size*size + 1];
        this.cells[0] = null;
        int count = 1;
        for(int i = 1; i <= size*size; i++) {
            this.cells[i] = new Cell(i);
        }
        // add snake
        addJump(27, 5);
        addJump(40, 3);
        addJump(43, 18);
        addJump(54, 31);
        addJump(66, 45);
        addJump(89, 53);
        addJump(95, 77);
        addJump(99, 41);

        // add ladder
        addJump(4, 25);
        addJump(13, 46);
        addJump(42, 63);
        addJump(50, 69);
        addJump(62, 81);
        addJump(74, 92);
    }

    private void addJump(int startCell, int endCell) {
        Cell cell = cells[startCell];
        Jump jump = new Jump(startCell, endCell);
        cell.setJump(jump);
    }
}

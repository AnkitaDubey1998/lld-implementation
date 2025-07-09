package Problems.SnakeLadderGame;

public class Cell {
    int cellNumber;
    Jump jump;

    public Cell(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public Jump getJump() {
        return jump;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }
}

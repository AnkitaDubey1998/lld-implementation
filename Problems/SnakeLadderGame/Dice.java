package Problems.SnakeLadderGame;

import java.util.Random;

public class Dice {
    private int diceId;
    private int minValue;
    private int maxValue;

    public Dice(int diceId, int minValue, int maxValue) {
        this.diceId = diceId;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int roll() {
        Random random = new Random();
        return random.nextInt(maxValue) + minValue;
    }
}

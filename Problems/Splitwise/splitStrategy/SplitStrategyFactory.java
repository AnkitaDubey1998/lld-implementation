package Problems.Splitwise.splitStrategy;

import Problems.Splitwise.enums.SplitType;
import Problems.Splitwise.splitStrategy.ConcreteSplitStrategies.EqualSplitStrategy;
import Problems.Splitwise.splitStrategy.ConcreteSplitStrategies.ExactSplitStrategy;
import Problems.Splitwise.splitStrategy.ConcreteSplitStrategies.PercentageSplitStrategy;

public class SplitStrategyFactory {
    public static SplitStrategy getSplitStrategy(SplitType splitType) {
        return switch (splitType) {
            case EQUAL -> new EqualSplitStrategy();
            case EXACT -> new ExactSplitStrategy();
            case PERCENTAGE -> new PercentageSplitStrategy();
            default -> throw new IllegalArgumentException("Invalid split type : " + splitType);
        };
    }
}

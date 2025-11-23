package Problems.Splitwise.splitStrategy.ConcreteSplitStrategies;

import Problems.Splitwise.entities.User;
import Problems.Splitwise.splitStrategy.SplitStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExactSplitStrategy implements SplitStrategy {
    @Override
    public Map<User, Double> calculateSplit(double totalAmount, User paidBy, List<User> participants, List<Double> splitDetails) {
        // validations to be implemented
        Map<User, Double> splitValues = new HashMap<>();
        for(int i = 0; i < participants.size(); i++) {
            splitValues.put(participants.get(i), splitDetails.get(i));
        }
        return splitValues;
    }
}

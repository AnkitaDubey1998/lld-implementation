package Problems.Splitwise.splitStrategy.ConcreteSplitStrategies;

import Problems.Splitwise.entities.User;
import Problems.Splitwise.splitStrategy.SplitStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualSplitStrategy implements SplitStrategy {
    @Override
    public Map<User, Double> calculateSplit(double totalAmount, User paidBy, List<User> participants, List<Double> splitDetails) {
        Map<User, Double> splitValues = new HashMap<>();
        double amountPerPerson = totalAmount / participants.size();
        for(User participant : participants) {
            splitValues.put(participant, amountPerPerson);
        }
        return splitValues;
    }
}

package Problems.Splitwise.entities;

import Problems.Splitwise.enums.SplitType;
import Problems.Splitwise.splitStrategy.SplitStrategy;
import Problems.Splitwise.splitStrategy.SplitStrategyFactory;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Expense {
    private final String id;
    private final String description;
    private final double amount;
    private final User payer;
    private final LocalDateTime timestamp;
    private final SplitStrategy splitStrategy;
    private final Map<User, Double> splitValues;

    private Expense(ExpenseBuilder builder) {
        this.id = builder.id;
        this.description = builder.description;
        this.amount = builder.amount;
        this.payer = builder.payer;
        this.timestamp = LocalDateTime.now();
        this.splitStrategy = builder.splitStrategy;
        this.splitValues = splitStrategy.calculateSplit(amount, payer, builder.participants, builder.splitDetails);
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public User getPayer() {
        return payer;
    }

    public Map<User, Double> getSplitValues() {
        return splitValues;
    }

    public static class ExpenseBuilder {
        private String id;
        private String description;
        private double amount;
        private User payer;
        private List<User> participants;
        private SplitStrategy splitStrategy;
        private List<Double> splitDetails;

        public ExpenseBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public ExpenseBuilder setDescription(String desc) {
            this.description = desc;
            return this;
        }

        public ExpenseBuilder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public ExpenseBuilder setPayer(User payer) {
            this.payer = payer;
            return this;
        }

        public ExpenseBuilder setParticipants(List<User> participants) {
            this.participants = participants;
            return this;
        }

        public ExpenseBuilder setSplitStrategy(SplitType splitType) {
            this.splitStrategy = SplitStrategyFactory.getSplitStrategy(splitType);
            return this;
        }

        public ExpenseBuilder setSplitValues(List<Double> splitDetails) {
            this.splitDetails = splitDetails;
            return this;
        }

        public Expense build() {
            if(this.splitStrategy == null) {
                throw new IllegalArgumentException("Split type is required");
            }
            return new Expense(this);
        }
    }
}

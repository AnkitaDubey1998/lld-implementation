package Problems.Splitwise.entities;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BalanceSheet {
    private final User owner;
    private double totalAmount;
    private final Map<User, Double> balances;

    public BalanceSheet(User user) {
        this.owner = user;
        totalAmount = 0.0;
        this.balances = new ConcurrentHashMap<>();
    }

    public void showBalances() {
        System.out.println("--- Balance Sheet for " + owner.getName() + " ---");
        System.out.println("Total amount : " + totalAmount);
        // print amount details for each user from balances map
    }
}

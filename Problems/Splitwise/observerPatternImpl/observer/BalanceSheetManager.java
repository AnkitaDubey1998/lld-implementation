package Problems.Splitwise.observerPatternImpl.observer;

import Problems.Splitwise.entities.BalanceSheet;
import Problems.Splitwise.entities.Expense;
import Problems.Splitwise.entities.User;

import java.util.Map;

public class BalanceSheetManager implements ExpenseObserver {
    @Override
    public void onExpenseAdded(Expense expense) {
        Map<User, Double> splitValues = expense.getSplitValues();
        User payer = expense.getPayer();
        BalanceSheet payerBalanceSheet = payer.getBalanceSheet();

        // for each participant, adjust the balance sheet
        for(Map.Entry<User, Double> splitValue : splitValues.entrySet()) {

        }
    }

    @Override
    public void onExpenseUpdated(Expense expense) {

    }
}

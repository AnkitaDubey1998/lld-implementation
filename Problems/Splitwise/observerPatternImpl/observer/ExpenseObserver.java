package Problems.Splitwise.observerPatternImpl.observer;

import Problems.Splitwise.entities.Expense;

public interface ExpenseObserver {
    void onExpenseAdded(Expense expense);
    void onExpenseUpdated(Expense expense);
}

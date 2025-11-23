package Problems.Splitwise.observerPatternImpl.observable;

import Problems.Splitwise.entities.Expense;
import Problems.Splitwise.observerPatternImpl.observer.ExpenseObserver;

public interface ExpenseObservable {
    void addObserver(ExpenseObserver expenseObserver);
    void removeObserver(ExpenseObserver expenseObserver);
    void notifyWhenExpenseAdded(Expense expense);
    void notifyWhenExpenseUpdated(Expense expense);
}

package Problems.Splitwise.observerPatternImpl.observable;

import Problems.Splitwise.entities.Expense;
import Problems.Splitwise.observerPatternImpl.observer.ExpenseObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseManager implements ExpenseObservable {
    List<ExpenseObserver> observers;
    Map<String, Expense> expenses;

    public ExpenseManager() {
        this.observers = new ArrayList<>();
        this.expenses = new HashMap<>();
    }

    @Override
    public void addObserver(ExpenseObserver expenseObserver) {
        observers.add(expenseObserver);
    }

    @Override
    public void removeObserver(ExpenseObserver expenseObserver) {
        observers.remove(expenseObserver);
    }

    @Override
    public void notifyWhenExpenseAdded(Expense expense) {
        for(ExpenseObserver observer : observers) {
            observer.onExpenseAdded(expense);
        }
    }

    @Override
    public void notifyWhenExpenseUpdated(Expense expense) {
        for(ExpenseObserver observer : observers) {
            observer.onExpenseUpdated(expense);
        }
    }

    public void addExpense(Expense expense) {
        expenses.put(expense.getId(), expense);
        notifyWhenExpenseAdded(expense);
    }
}

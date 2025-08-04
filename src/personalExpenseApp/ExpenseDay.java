package personalExpenseApp;

import java.util.ArrayList;

public class ExpenseDay {
    private final String expenseDay;
    private final String expenseMonth;
    private ArrayList<Expenses> expenses;
    private double expenseTotal;

    public ExpenseDay(String expenseDay, String expenseMonth) {
        this.expenseDay = expenseDay;
        this.expenseMonth = expenseMonth;
        this.expenses = new ArrayList<>();
    }

    public String getExpenseDay() {
        return expenseDay;
    }

    public String getExpenseMonth() {
        return expenseMonth;
    }

    public ArrayList<Expenses> getExpenses() {
        return expenses;
    }

    public double getExpenseTotal() {
        return expenseTotal;
    }

    public void addExpense(Expenses expense) {
        expenses.add(expense);
        expenseTotal += expense.getExpenseAmount();
    }

    @Override
    public String toString() {
        return "Day = " + expenseDay +
                ", Month = " + expenseMonth +
                ", number of expenses = " + expenses.size() +
                ", expense total = " + expenseTotal +
                '}';
    }
}

package personalExpenseApp;

import java.util.ArrayList;

public class ExpenseDay {
    private final String expenseDay;
    private final String expenseMonth;
    private final String expenseYear;
    private ArrayList<Expenses> expenses;
    private double expenseTotal;

    public ExpenseDay(String expenseDay, String expenseMonth, String expenseYear) {
        this.expenseDay = expenseDay;
        this.expenseMonth = expenseMonth;
        this.expenseYear = expenseYear;
        this.expenses = new ArrayList<>();
    }

    public String getExpenseDay() {
        return expenseDay;
    }

    public String getExpenseMonth() {
        return expenseMonth;
    }

    public String getExpenseYear() {
        return expenseYear;
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
}

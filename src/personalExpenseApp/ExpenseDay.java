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

    public String getExpenseNotes() {
        String notes = "";
        for (Expenses expense : expenses) {
            notes += expense.getExpenseNotes() + "\n";
        }
        return notes;
    }

    public String getExpenseCategory() {
        String category = "";
        for (Expenses expense : expenses) {
            category += expense.getExpenseCategory() + "\n";
        }
        return category;
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
                ", Expense Note = " + getExpenseNotes() +
                ", Expense Category = " + getExpenseCategory() +
                ", expense total = " + expenseTotal +
                '}';
    }
}
